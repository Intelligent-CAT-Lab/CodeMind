import java.util.Scanner;

public class codeforces_189_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int ans = 0;
        if (length % arr[0] == 0) {
            ans = length / arr[0];
        } else if (arr[0] == arr[1]) {
            for (int i = 0; i <= length / arr[2]; i++) {
                int check = length - i * arr[2];
                if (check >= 0 && check % arr[0] == 0) {
                    ans = Math.max(ans, i + check / arr[0]);
                }
            }
        } else {
            for (int i = 0; i <= length / arr[2]; i++) {
                for (int j = 0; j <= length / arr[1]; j++) {
                    int check = length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        ans = Math.max(ans, i + j + check / arr[0]);
                    }
                }
            }
        }

        System.out.println(ans);
    }
}