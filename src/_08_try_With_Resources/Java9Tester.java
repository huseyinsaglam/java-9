package _08_try_With_Resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Java9Tester {

    public static void main(String[] args) throws IOException {

        System.out.println("********************* Java 9 Oncesi ************************");
        String testMessage = "Try with Resources Test Deneme";
        Reader stringReader = new StringReader(testMessage);
        BufferedReader bufferedReader = new BufferedReader(stringReader);

/*        try (BufferedReader reader = bufferedReader) {
            System.out.println(reader.readLine());
        }*/

        System.out.println("********************* Java 9 Sonrasi ************************");

        try (bufferedReader) {
            System.out.println(bufferedReader.readLine());
        }


    }
}
