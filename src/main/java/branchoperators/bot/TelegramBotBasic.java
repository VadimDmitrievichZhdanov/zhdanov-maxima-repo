package branchoperators.bot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Базовые элементы бота
 */
public class TelegramBotBasic {

    public static void main(String[] args) throws IOException {

        // Данный код мы вообще никак не трогаем. Просто смотрим и любуемся им.
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int number; // 0 - redundant
            try {
                number = Integer.parseInt(bufferedReader.readLine());
            } catch (Exception e) {
//                System.out.println("Enter number please.. only number =). And not big.");
                bufferedReader.close();
                break;
            }

            switch (number) {
                case 1 -> System.out.println("Hello");
                case 2 -> System.out.println("Buy");
                case 3 -> System.out.println("Whut???");
                default -> {
                    System.out.println("I don't understand you, I'm turning off");
                    bufferedReader.close();
                }
            }
        }
    }
}
