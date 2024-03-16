import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] ABC = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            ABC[i] = Integer.parseInt(numbers[i]);
        }
        if (ABC.length == 3) {
            int count = 0;
            for (int i = 0; i < ABC.length; i++) {
                if (ABC[i] == 5) {
                    count++;
                }
            }
            if (count == 2) {
                int sum = 0;
                for (int i = 0; i < ABC.length; i++) {
                    sum += ABC[i];
                }
                if (sum == 17) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}