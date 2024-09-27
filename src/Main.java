import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество палочек (n): ");
        long n = scanner.nextLong();

        long tanyaSticks = 0;
        boolean tanyaTurn = true;

        while (n > 0) {
            if (tanyaTurn) {
                if (n % 2 == 0) {
                    tanyaSticks += 1;
                    n -= 1;
                } else {
                    tanyaSticks += 1;
                    n -= 1;
                }
            } else {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n -= 1;
                }
            }
            tanyaTurn = !tanyaTurn;
        }

        System.out.println("Количество палочек у Тани: " + tanyaSticks);
    }
}
