import java.util.Scanner;

public class p02596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k % 10 == 0 || k % 10 == 2 || k % 10 == 4 || k % 10 == 5 || k % 10 == 6 || k % 10 == 8) {
            System.out.println(-1);
        } else if (k % 10 == 1) {
            int tmp = k * 7;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().filter(ch -> ch == '7').count() == String.valueOf(tmp).length()) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                if (tmp / 10 % 10 <= 7) {
                    int num = 7 - tmp / 10 % 10;
                    int tmp2 = k * num;
                    tmp = tmp / 10 + tmp2;
                    ans += 1;
                } else if (tmp / 10 % 10 == 8) {
                    int num = 9;
                    int tmp2 = k * num;
                    tmp = tmp / 10 + tmp2;
                    ans += 1;
                } else if (tmp / 10 % 10 == 9) {
                    int num = 8;
                    int tmp2 = k * num;
                    tmp = tmp / 10 + tmp2;
                    ans += 1;
                }
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 3) {
            int tmp = k * 9;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().filter(ch -> ch == '7').count() == String.valueOf(tmp).length()) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = ((tmp / 10 % 10) * 3 - 1) % 10;
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
                if (String.valueOf(tmp).chars().filter(ch -> ch == '7').count() == String.valueOf(tmp).length()) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = ((tmp / 10 % 10) * 7 + 1) % 10;
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
                if (String.valueOf(tmp).chars().filter(ch -> ch == '7').count() == String.valueOf(tmp).length()) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = ((tmp / 10 % 10) + 3) % 10;
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

/2020/09/2020090