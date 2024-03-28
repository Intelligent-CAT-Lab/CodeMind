import java.util.Scanner;

public class atcoder_ABC042_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ABC = new int[3];
        for (int i = 0; i < 3; i++) {
            ABC[i] = scanner.nextInt();
        }

        int count = 0;
        for (int num : ABC) {
            if (num == 5) {
                count++;
            }
        }

        if (count == 2) {
            if (ABC[0] + ABC[1] + ABC[2] == 17) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}