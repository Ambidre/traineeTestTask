import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadFileTests {

    @Test
    public void secondLineShouldHadAlloha() {

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "src/test/resources/ReadFileTests.txt"));

            //читаем первую строку
            reader.readLine();
            //читаем вторую строку
            String alloha = reader.readLine();

            reader.close();

            assertEquals("аллоха", alloha);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
        public void secondLineShouldHadAlloha2() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("src/test/resources/ReadFileTests.txt"));

        //читаем первую строку
         scanner.nextLine();
        //читаем вторую строку
        String alloha = scanner.nextLine();

        scanner.close();

        assertEquals("аллоха", alloha);
    }
}
