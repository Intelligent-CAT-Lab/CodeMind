import java.util.Scanner;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}



import sys

x = int(sys.stdin.readline())
if x == 0:
    print("1")
else:
    print("0")