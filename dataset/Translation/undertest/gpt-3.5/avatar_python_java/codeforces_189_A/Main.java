import java.util.*;

public class codeforces_189_A {

    public static void cutRibbon() {
        Scanner sc = new Scanner(System.in);
        String[] inputArr = sc.nextLine().split(" ");
        int[] arr = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }
        int length = arr[0];
        Arrays.sort(arr, 1, 4);
        int ans = 0;
        if (length % arr[1] == 0) {
            System.out.println(length / arr[1]);
            return;
        } else if (arr[1] == arr[2]) {
            int k = 0;
            for (int i = 0; i <= length / arr[3]; i++) {
                int check = length - i * arr[3];
                if (check >= 0 && check % arr[1] == 0) {
                    k = check / arr[1];
                    ans = Math.max(ans, k + i);
                }
            }
        } else {
            int k = 0;
            for (int i = 0; i <= length / arr[3]; i++) {
                for (int j = 0; j <= length / arr[2]; j++) {
                    int check = length - i * arr[3] - j * arr[2];
                    if (check >= 0 && (check % arr[1] == 0)) {
                        k = check / arr[1];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }

    public static void main(String[] args) {
        cutRibbon();
    }
}