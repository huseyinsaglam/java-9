package _06_process_API_Improvements;

import java.io.IOException;
import java.time.ZoneId;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java9Tester {

    public static void main(String[] args) throws IOException {

        // Burada process BUilder Oluşturduk
        ProcessBuilder p = new ProcessBuilder();

        // Notepad.exe programını açacağı dosyanın yolu ile birlikte gönderdik
        p.command("notepad.exe", "C:/dosya/dosya.txt");
        p.start();
    }
}
