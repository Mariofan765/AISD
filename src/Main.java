import java.util.Scanner;

public class Main {
    private int[] array = new int[3];

    public void addNumber(int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = number;
                return;
            } else if (number < array[i]) {
                array[i] = number;
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main memoryCell = new Main();

        System.out.println("Введите числа через пробел");
        String input = scanner.nextLine().trim();
        String[] numbers = input.split(" ");

        for (String numStr : numbers) {
            try {
                int number = Integer.parseInt(numStr);
                memoryCell.addNumber(number);
            } catch (NumberFormatException e) {
            }
        }

        System.out.println("Значения в ячейке");
        for (int value : memoryCell.array) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
    }
}