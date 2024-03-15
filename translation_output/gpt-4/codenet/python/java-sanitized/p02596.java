import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02596 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());
        if (k % 10 == 0 || k % 10 == 2 || k % 10 == 4 || k % 10 == 5 || k % 10 == 6 || k % 10 == 8) {
            System.out.println(-1);
        } else {
            long tmp = 0, ans = 1, num = 0;
            boolean done = false;
            switch (k % 10) {
                case 1:
                    tmp = (long) k * 7;
                    break;
                case 3:
                    tmp = (long) k * 9;
                    break;
                case 7:
                    tmp = (long) k;
                    break;
                case 9:
                    tmp = (long) k * 3;
                    break;
            }
            while (!done) {
                if (allSevens(tmp)) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                switch (k % 10) {
                    case 1:
                    case 7:
                        if ((tmp / 10) % 10 <= 7) {
                            num = 7 - (tmp / 10) % 10;
                        } else if ((tmp / 10) % 10 == 8) {
                            num = 9;
                        } else if ((tmp / 10) % 10 == 9) {
                            num = 8;
                        }
                        break;
                    case 3:
                        num = (((tmp / 10) % 10) * 3 - 1) % 10;
                        break;
                    case 9:
                        num = (((tmp / 10) % 10) + 3) % 10;
                        break;
                }
                long tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        }
    }

    private static boolean allSevens(long number) {
        // Helper function to check if all digits of number are 7
        String numStr = String.valueOf(number);
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) != '7') return false;
        }
        return true;
    }
}