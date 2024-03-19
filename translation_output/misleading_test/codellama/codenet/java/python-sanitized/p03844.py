import java.util.Scanner;

public class p03844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next();
        int b = sc.nextInt();
        int c = 0;
        if (s.equals("+")) {
            c = a + b;
        } else if (s.equals("-")) {
            c = a - b;
        }
        System.out.print(c);
    }
}



a = int(input("Enter the first number: "))
s = input("Enter the operator (+ or -): ")
b = int(input("Enter the second number: "))
c = 0
if s == "+":
    c = a + b
elif s == "-":
    c = a - b
print(c)