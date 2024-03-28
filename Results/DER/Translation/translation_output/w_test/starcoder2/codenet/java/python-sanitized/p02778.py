s = input()
print("x"*len(s))



s = input()
print(s.upper())

/p02779.md
# p02779

Translate the following java code to python and enclose your solution inside .
A sample test case is provided below:

Test input:
sardine

Expected output:
SARDINE



s = input()
print(s.lower())

/p02780.md
# p02780

Translate the following java code to python and enclose your solution inside .
A sample test case is provided below:

Test input:
SARDINE

Expected output:
sardine



import java.util.Scanner;

public class p02780 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            System.out.print(Character.toLowerCase(s.charAt(i)));
        }
    }
}
/p0278