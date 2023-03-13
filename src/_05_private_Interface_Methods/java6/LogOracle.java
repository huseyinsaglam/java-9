package _05_private_Interface_Methods.java6;

public class LogOracle implements Logging {

    @Override
    public void logInfo(String message) {
        getConnection();
        System.out.println("Log Message : " + "INFO");
        closeConnection();
    }

    @Override
    public void logWarn(String message) {
        getConnection();
        System.out.println("Log Message : " + "WARN");
        closeConnection();
    }

    @Override
    public void logError(String message) {
        getConnection();
        System.out.println("Log Message : " + "ERROR");
        closeConnection();
    }

    @Override
    public void logFatal(String message) {
        getConnection();
        System.out.println("Log Message : " + "FATAL");
        closeConnection();
    }

    @Override
    public void getConnection() {
        System.out.println("Open Database connection");
    }

    @Override
    public void closeConnection() {
        System.out.println("Close Database connection");
    }
}

final class LogMySql implements Logging {
    @Override
    public void logInfo(String message) {
        getConnection();
        System.out.println("Log Message : " + "INFO");
        closeConnection();
    }

    @Override
    public void logWarn(String message) {
        getConnection();
        System.out.println("Log Message : " + "WARN");
        closeConnection();
    }

    @Override
    public void logError(String message) {
        getConnection();
        System.out.println("Log Message : " + "ERROR");
        closeConnection();
    }

    @Override
    public void logFatal(String message) {
        getConnection();
        System.out.println("Log Message : " + "FATAL");
        closeConnection();
    }

    @Override
    public void getConnection() {
        System.out.println("Open Database connection");
    }

    @Override
    public void closeConnection() {
        System.out.println("Close Database connection");
    }
}
