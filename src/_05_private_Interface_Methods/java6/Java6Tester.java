package _05_private_Interface_Methods.java6;

public class Java6Tester {

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
