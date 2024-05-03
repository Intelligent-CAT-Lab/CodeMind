Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] abc = new char[]{'-', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '-'};
        char[] num = new char[]{'-', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-'};
        int[] abc_cnt = new int[28];
        int[] num_cnt = new int[12];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < 27; j++) {
                if (s.charAt(i) == abc[j]) {
                    abc_cnt[j]++;
                }
            }
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < 11; j++) {
                if (s.charAt(i) == num[j]) {
                    num_cnt[j]++;
                }
            }
        }

        int ans = 0;
        int abc_sum = 0;
        int num_sum = 0;

        for (int i : abc_cnt) {
            abc_sum += i;
        }

        for (int i : num_cnt) {
            num_sum += i;
        }

        while (abc_sum > 0) {
            int start = 100;
            int current = 1;
            while (current < 27) {
                if (abc_cnt[current - 1]
