import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ABC = new int[3];
        int countFives = 0;
        int sum = 0;

        for (int i = 0; i < ABC.length; i++) {
            ABC[i] = scanner.nextInt();
            if (ABC[i] == 5) {
                countFives++;
            }
            sum += ABC[i];
        }

        if (countFives == 2) {
            System.out.println(sum == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}