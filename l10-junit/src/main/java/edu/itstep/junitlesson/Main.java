package edu.itstep.junitlesson;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String query = """
                SELECT
                    *
                FROM
                    users
                WHERE email = '%s'
                AND password = '%s'
                """;

        System.out.println(query.formatted("email", "' OR '' = '"));

        String template = """
                html
                
                h1 <script>localStorage fet</script>
                
                """;
    }
}