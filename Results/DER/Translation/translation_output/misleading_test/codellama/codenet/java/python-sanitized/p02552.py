import java.util.Scanner;

public class p02552 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}



import sys

n = int(sys.stdin.readline())
if n == 0:
    print(1)
else:
    print(0)