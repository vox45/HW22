import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;

public class Main {
    public static void main(String[] args) {


    }
    public static void task1() {
        int current_value = 1;
        int print_times = 55;
        for (int i = 0;i < print_times ; i++) {
            System.out.println(current_value);
            current_value += 2;
        }
    }

          public static void task2() {
          for (int i = 90; i > 0; i -= 5) {
              System.out.println(i);
          }
     }


}


class MainTest {

        @Test
        public void testTask1() throws FileNotFoundException {
            // Ожидаемый вывод для task1
            String expectedOutput = generateTask1Output();

            // Устанавливаем вывод в System.out для сравнения с ожидаемым выводом
            String outContent = null;
            System.setOut(new PrintStream(outContent));

            // Запускаем метод task1
            Main.task1();

            // Получаем вывод из System.out и сравниваем его с ожидаемым выводом
            assertEquals(expectedOutput, outContent.toString());
        }

        @Test
        public void testTask2() throws FileNotFoundException {
            // Ожидаемый вывод для task2
            String expectedOutput = generateTask2Output();

            // Устанавливаем вывод в System.out для сравнения с ожидаемым выводом
            String outContent = null;
            System.setOut(new PrintStream(outContent));

            // Запускаем метод task2
            Main.task2();

            // Получаем вывод из System.out и сравниваем его с ожидаемым выводом
            assertEquals(expectedOutput, outContent.toString());
        }

        // Генерируем ожидаемый вывод для задачи 1
        private String generateTask1Output() {
            StringBuilder output = new StringBuilder();
            int current_value = 1;
            int print_times = 55;
            for (int i = 0; i < print_times; i++) {
                output.append(current_value).append("\n");
                current_value += 2;
            }
            return output.toString();
        }

        // Генерируем ожидаемый вывод для задачи 2
        private String generateTask2Output() {
            StringBuilder output = new StringBuilder();
            for (int i = 90; i > 0; i -= 5) {
                output.append(i).append("\n");
            }
            return output.toString();
        }
    }

