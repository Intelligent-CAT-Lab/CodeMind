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

        int[] sortedArr = new int[4];
        for (int i = 0; i < 4; i++) {
            sortedArr[i] = arr[i];
        }
        Arrays.sort(sortedArr);

        int ans = 0;
        if (length % sortedArr[0] == 0) {
            ans = length / sortedArr[0];
        } else {
            if (sortedArr[0] == sortedArr[1]) {
                for (int i = 0; i <= length / sortedArr[2]; i++) {
                    int check = length - i * sortedArr[2];
                    if (check >= 0 && check % sortedArr[0] == 0) {
                        ans = Math.max(ans, i + check / sortedArr[0]);
                    }
                }
            } else {
                for (int i = 0; i <= length / sortedArr[2]; i++) {
                    for (int j = 0; j <= length / sortedArr[1]; j++) {
                        int check = length - i * sortedArr[2] - j * sortedArr[1];
                        if (check >= 0 && check % sortedArr[0] == 0) {
                            ans = Math.max(ans, i + j + check / sortedArr[0]);
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }
}