import java.util.Scanner;

public class p02394 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] i = new int[5];
        for (int j = 0; j < 5; j++) {
            i[j] = scanner.nextInt();
        }

        if (i[2] + i[4] <= i[0]) {
            if (i[2] - i[4] >= 0) {
                if (i[3] + i[4] <= i[1]) {
                    if (i[3] - i[4] >= 0) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}