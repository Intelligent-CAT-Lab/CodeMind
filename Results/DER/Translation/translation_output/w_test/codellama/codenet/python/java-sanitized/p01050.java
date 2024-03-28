import java.util.Scanner;

public class p01050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] abcCnt = new int[28];
        int[] numCnt = new int[12];
        int abcSum = 0;
        int numSum = 0;
        int ans = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                abcCnt[c - 'a']++;
                abcSum++;
            } else if (c >= '0' && c <= '9') {
                numCnt[c - '0']++;
                numSum++;
            }
        }

        while (abcSum > 0) {
            int start = 100;
            int current = 1;
            while (current < 27) {
                if (abcCnt[current - 1] == 0 && abcCnt[current] > 0) {
                    start = Math.min(start, current);
                }

                if (abcCnt[current + 1] == 0 && abcCnt[current] > 0) {
                    ans += Math.min(3, current - start + 1);
                    abcCnt[current]--;
                    abcSum--;
                    break;
                }

                if (abcCnt[current] > 0) {
                    abcCnt[current]--;
                    abcSum--;
                }

                current++;
            }
        }

        while (numSum > 0) {
            int start = 100;
            int current = 1;
            while (current < 11) {
                if (numCnt[current - 1] == 0 && numCnt[current] > 0) {
                    start = Math.min(start, current);
                }

                if (numCnt[current + 1] == 0 && numCnt[current] > 0) {
                    ans += Math.min(3, current - start + 1);
                    numCnt[current]--;
                    numSum--;
                    break;
                }

                if (numCnt[current] > 0) {
                    numCnt[current]--;
                    numSum--;
                }

                current++;
            }
        }

        System.out.println(ans);
    }
}