package _05_private_Interface_Methods.java8;

public class Java8Tester {

    public static void main(String[] args) {

        LogOracle log = new LogOracle();
        log.logInfo("");
        log.logWarn("");
        log.logError("");
        log.logFatal("");
        LogMySql log1 = new LogMySql();
        log1.logInfo("");
        log1.logWarn("");
        log1.logError("");
        log1.logFatal("");
    }
}
