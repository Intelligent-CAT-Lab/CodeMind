import java.util.Scanner;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        
        System.out.println((n / k + 1) * k);
    }
}



import sys

n, k = map(int, sys.stdin.readline().split())
print((n // k + 1) * k)