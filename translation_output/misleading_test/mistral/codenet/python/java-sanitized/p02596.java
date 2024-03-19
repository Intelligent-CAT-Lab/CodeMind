import java.util.Scanner;

public class p02596 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if (k % 10 == 0 || k % 10 == 2 || k % 10 == 4 || k % 10 == 5 || k % 10 == 6 || k % 10 == 8) {
            System.out.println(-1);
        } else if (k % 10 == 1) {
            int ans = 1;
            int tmp = k * 7;
            while (true) {
                int count = 0;
                for (int i = 0; i < tmp.toString().length(); i++) {
                    if (tmp.toString().charAt(i) == '7') {
                        count++;
                    }
                }
                if (count == tmp.toString().length()) {
                    System.out.println(ans + tmp.toString().length() - 1);
                    break;
                }
                int num = (tmp / 10 % 10) * 3 - 1;
                if (num == 8) {
                    num = 9;
                }
                tmp = (tmp / 10) + (k * num);
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 3) {
            int ans = 1;
            int tmp = k * 9;
            while (true) {
                int count = 0;
                for (int i = 0; i < tmp.toString().length(); i++) {
                    if (tmp.toString().charAt(i) == '7') {
                        count++;
                    }
                }
                if (count == tmp.toString().length()) {
                    System.out.println(ans + tmp.toString().length() - 1);
                    break;
                }
                int num = ((tmp / 10 % 10) * 3 - 1) % 10;
                tmp = (tmp / 10) + (k * num);
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 7) {
            int ans = 1;
            int tmp = k * 1;
            while (true) {
                int count = 0;
                for (int i = 0; i < tmp.toString().length(); i++) {
                    if (tmp.toString().charAt(i) == '7') {
                        count++;
                    }
                }
                if (count == tmp.toString().length()) {
                    System.out.println(ans + tmp.toString().length() - 1);
                    break;
                }
                int num = ((tmp / 10 % 10) * 7 + 1) % 10;
                tmp = (tmp / 10) + (k * num);
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 9) {
            int ans = 1;
            int tmp = k * 3;
            while (true) {
                int count = 0;
                for (int i = 0; i < tmp.toString().length(); i++) {
                    if (tmp.toString().charAt(i) == '7') {
                        count++;
                    }
                }
                if (count == tmp.toString().length()) {
                    System.out.println(ans + tmp.toString().length() - 1);
                    break;
                }
                int num = ((tmp / 10 % 10) + 3) % 10;
                tmp = (tmp / 10) + (k * num);
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        }
    }
}