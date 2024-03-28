import java.util.Scanner;

public class p02596 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        
        if (k % 10 == 0 || k % 10 == 2 || k % 10 == 4 || k % 10 == 5 || k % 10 == 6 || k % 10 == 8) {
            System.out.println(-1);
        } else if (k % 10 == 1) {
            long tmp = k * 7L;
            int ans = 1;
            while (true) {
                if (allSevens(tmp)) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num;
                int nextDigit = (int)((tmp / 10) % 10);
                if (nextDigit <= 7) {
                    num = 7 - nextDigit;
                } else if (nextDigit == 8) {
                    num = 9;
                } else {
                    num = 8;
                }
                long tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 3) {
            long tmp = k * 9L;
            int ans = 1;
            while (true) {
                if (allSevens(tmp)) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = (((int)((tmp / 10) % 10)) * 3 - 1) % 10;
                long tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 7) {
            long tmp = k;
            int ans = 1;
            while (true) {
                if (allSevens(tmp)) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = (((int)((tmp / 10) % 10)) * 7 + 1) % 10;
                long tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 9) {
            long tmp = k * 3L;
            int ans = 1;
            while (true) {
                if (allSevens(tmp)) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = (((int)((tmp / 10) % 10)) + 3) % 10;
                long tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        }
        
        scanner.close();
    }
    
    private static boolean allSevens(long number) {
        String numStr = String.valueOf(number);
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) != '7') {
                return false;
            }
        }
        return true;
    }
}