package _05_private_Interface_Methods.java6;

public interface Logging {

    String ORACLE = "Oracle_Database";
    String MYSQL = "MySql_Database";

    void logInfo(String message);
    void logWarn(String message);
    void logError(String message);
    void logFatal(String message);

    void getConnection();
    void closeConnection();
}
