Solution


import java.util.Scanner;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] count = new int[1000001];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int cnt = 0;
        for (int i = 0; i < 1000001; i++) {
            if (count[i] % 2 != 0 && cnt < 1) {
                cnt++;
            } else if (count[i] % 2 != 0 && cnt >= 1) {
                break;
            }
        }
        if (cnt == 0) {
            System.out.println("First");
        } else if (cnt == 1) {
            System.out.println("Second");
        } else {
            System.out.println("First");
        }
    }
}