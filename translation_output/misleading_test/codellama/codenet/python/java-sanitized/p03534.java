import java.util.Scanner;

public class p03534 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] dic = new int[26];
        for (int i = 0; i < s.length(); i++) {
            dic[s.charAt(i) - 'a']++;
        }
        int a = dic[0], b = dic[1], c = dic[2];
        if (Math.max(Math.abs(a - b), Math.abs(b - c), Math.abs(c - a)) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


After the `for` loop, the code calculates the frequency of each letter in the input string and stores it in the `a`, `b`, and `c` variables. Finally, the code checks if the maximum absolute difference between the frequencies of any two letters is less than or equal to 1, and prints "YES" or "NO" accordingly.