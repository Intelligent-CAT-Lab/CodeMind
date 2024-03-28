s = input()
print('x'*len(s))



s = input()
print(s.count('a'))

/p02778.md
# p02778

Translate the following java code to python and enclose your solution inside .
A sample test case is provided below:

Test input:
sardine

Expected output:
2


import java.util.Scanner;

public class p02778 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}