# JDBC
Java database connectivity

## Statements
- Statement - використовувати коли запит без параметрів
- PreparedStatement - компільований завчасно запит з параметрами
- CallableStatement - для виклику хранимих процедур


## Statements methods
- ResultSet executeQuery() - SELECT                   
- int executeUpdate() - INSERT, DELETE, UPDATE
- boolean execute()

## ResultSet Constants

### Scroll
- TYPE_FORWARD_ONLY
- TYPE_SCROLL_INSENSITIVE
- TYPE_SCROLL_SENSITIVE

### Concurrency
- CONCUR_UPDATABLE
- CONCUR_READ_ONLY
