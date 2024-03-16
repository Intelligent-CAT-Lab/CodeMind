import java.util.Scanner

public class codeforces_678_A:
    public static void main(String[] args):
        input = Scanner(System.in)
        n = input.nextInt()
        k = input.nextInt()
        
        System.out.println((n // k + 1) * k)