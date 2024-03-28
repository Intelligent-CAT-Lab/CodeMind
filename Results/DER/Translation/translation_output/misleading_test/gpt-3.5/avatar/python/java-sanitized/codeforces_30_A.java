import java.util.Scanner;

public class codeforces_30_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] parts = input.split("â");

        int a = Integer.parseInt(parts[0].trim());
        int b = Integer.parseInt(parts[1].trim());
        int n = Integer.parseInt(parts[2].trim());

        if (a != 0) {
            if (b % a != 0) {
                System.out.println("No â solution");
            } else {
                b = b / a;
                int x = 0;
                int y = -2000;
                if (b >= 0) {
                    while (y < b) {
                        y = (int) Math.pow(x, n);
                        x++;
                    }
                    if (y > b) {
                        System.out.println("No â solution");
                    } else {
                        System.out.println(x - 1);
                    }
                } else {
                    if (n % 2 == 0) {
                        System.out.println("No â solution");
                    } else {
                        x = -1;
                        y = 2000;
                        while (y > b) {
                            y = (int) Math.pow(x, n);
                            x--;
                        }
                        if (y < b) {
                            System.out.println("No â solution");
                        } else {
                            System.out.println(x + 1);
                        }
                    }
                }
            }
        } else {
            if (b == 0) {
                System.out.println(5);
            } else {
                System.out.println("No â solution");
            }
        }

    }
}