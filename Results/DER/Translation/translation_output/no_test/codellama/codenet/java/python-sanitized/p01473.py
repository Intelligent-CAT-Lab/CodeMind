import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class p01473:
    public static final int MAX = 20;

    public static void main(String[] args):
        final Scanner sc = new Scanner(System.in);

        long[] facts = new long[MAX + 1];
        facts[0] = 1;
        for i in range(1, MAX + 1):
            facts[i] = facts[i - 1] * i;

        int[] count = new int[26];
        char[] input = sc.next().toCharArray();

        for c in input:
            count[c - 'a']++;

        final int allow_odd = input.length % 2 == 0 ? 0 : 1;
        int odd_count = 0;
        int odd_pos = -1;
        for i in range(26):
            if count[i] % 2 == 1:
                odd_count++;
                odd_pos = i;

        if allow_odd < odd_count:
            print(0);
            return;

        if odd_pos != -1:
            count[odd_pos]--;

        for i in range(26):
            count[i] /= 2;

        int valid = 0;
        for i in range(26):
            valid += count[i];

        # System.out.println(Arrays.toString(count));

        long sum = facts[valid];
        for i in range(26):
            sum /= facts[count[i]];

        print(sum);