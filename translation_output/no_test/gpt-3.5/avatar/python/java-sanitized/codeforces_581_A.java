import java.util.Scanner;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");

        int[] x = new int[inputArr.length];
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(inputArr[i]);
        }

        int a = x[0];
        int b = x[1];

        System.out.print(Math.min(x[0], x[1]) + " ▁ ");
        if (Math.abs(a - b) >= 2) {
            System.out.print(Math.abs(a - b) / 2);
        } else {
            System.out.print(0);
        }
    }
}