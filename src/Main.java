import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите числа через пробел");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        if (input.isEmpty()) {
            System.out.println("Ввод пустой");
            return;
        }

        String[] numbers = input.split(" ");
        int[] array = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        for (int number : array) {
            result += number*number;
        }
        System.out.println(result);
    }
}