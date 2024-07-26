package edu.itstep.repository;

import com.github.javafaker.Faker;
import edu.itstep.model.User;

import java.sql.*;
import java.util.List;

public class UserRepository {
    private final Connection connection;

    public UserRepository() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lesson_db", "root", "");
    }

    public void findAll() throws SQLException {
        // Statement
        // PreparedStatement
        // CallableStatement
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("""
                SELECT * from users
                """);

        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
    }

    public void findByName(String name) throws SQLException {
        String selectQuery = """
                Select * from users where name = ?
                """;

        PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);

        preparedStatement.setString(1, name);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + ". " + resultSet.getString("name") + ": " + resultSet.getString("password"));
        }
    }

    public void testExecute() throws SQLException {
        String query = """
                SELECT * from users where name = ?
                """;
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, "Oleg");
        boolean hasResult = preparedStatement.execute();

        if (!hasResult) {
            return;
        }
        ResultSet resultSet = preparedStatement.getResultSet();
        System.out.println(resultSet.getInt("id"));
    }

    public void testResultSet() throws SQLException {
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
        resultSet.moveToInsertRow();
        resultSet.updateString("name", "PetroOleg");
        resultSet.updateString("password", "PetroOleg2.0");
        resultSet.insertRow();
        resultSet.moveToCurrentRow();
    }

    public void testTransaction() throws SQLException {
        Savepoint savepoint = connection.setSavepoint();
        try {
            connection.setAutoCommit(false);

            Statement statement = connection.createStatement();

            statement.executeUpdate("""
                    UPDATE users SET name = 'Petro 5.0' WHERE id = 1
                    """);


            statement.executeUpdate("""
                    UPDATE users SET name = 'Oleg 5.0' WHERE id = 2
                    """);

            connection.commit();
        } catch (ArithmeticException | SQLException e) {
            e.printStackTrace();
            connection.rollback(savepoint);
        } finally {
            connection.setAutoCommit(true);
        }
    }

    public void testBatch() throws SQLException {
        Statement statement = connection.createStatement();
        connection.setAutoCommit(false);
        for (int i = 0; i < 200; i++) {
            statement.addBatch(
                    "INSERT INTO users(name, password) VALUES('PETRO', 'PETRO')"
            );
        }
        statement.executeBatch();
        connection.commit();
        connection.setAutoCommit(true);
    }

    public void testInsert() throws SQLException {
        Statement statement = connection.createStatement();
        connection.setAutoCommit(false);
        for (int i = 0; i < 200; i++) {
            statement.executeUpdate(
                    """
                            INSERT INTO users(name, password) VALUES('PETRO', 'PETRO')
                                    """
            );
        }
        connection.commit();
        connection.setAutoCommit(true);
    }

}
