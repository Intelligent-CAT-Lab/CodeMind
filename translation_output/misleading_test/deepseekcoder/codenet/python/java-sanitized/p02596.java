import java.util.Scanner;

public class p02596 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if (k % 10 == 0 || k % 10 == 2 || k % 10 == 4 || k % 10 == 5 || k % 10 == 6 || k % 10 == 8) {
            System.out.println(-1);
        } else if (k % 10 == 1) {
            int tmp = k * 7;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).replaceAll("[0-9]*7[0-9]*", "").length() == 0) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = (tmp / 10) % 10 <= 7 ? 7 - (tmp / 10) % 10 : (tmp / 10) % 10 == 8 ? 9 : 8;
                int tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans += 1;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 3) {
            int tmp = k * 9;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).replaceAll("[0-9]*7[0-9]*", "").length() == 0) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = (tmp / 10) % 10 * 3 % 10;
                int tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans += 1;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 7) {
            int tmp = k * 1;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).replaceAll("[0-9]*7[0-9]*", "").length() == 0) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = (tmp / 10) % 10 * 7 % 10 + 1;
                int tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans += 1;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 9) {
            int tmp = k * 3;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).replaceAll("[0-9]*7[0-9]*", "").length() == 0) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = (tmp / 10) % 10 + 3;
                int tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans += 1;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        }
    }
}