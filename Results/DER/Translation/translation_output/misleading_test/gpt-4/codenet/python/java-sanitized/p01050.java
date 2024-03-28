import java.util.Scanner;

public class p01050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        String abc = "-abcdefghijklmnopqrstuvwxyz-";
        String num = "-0123456789-";
        int[] abcCnt = new int[28];
        int[] numCnt = new int[12];

        for (int i = 0; i < input.length(); i++) {
            int index = abc.indexOf(input.charAt(i));
            if (index >= 0) {
                abcCnt[index]++;
            }
            index = num.indexOf(input.charAt(i));
            if (index >= 0) {
                numCnt[index]++;
            }
        }

        int ans = 0;
        int abcSum = 0;
        for (int count : abcCnt) {
            abcSum += count;
        }
        int numSum = 0;
        for (int count : numCnt) {
            numSum += count;
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