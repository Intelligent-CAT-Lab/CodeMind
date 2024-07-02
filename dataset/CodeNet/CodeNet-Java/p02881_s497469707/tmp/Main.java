import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
System.out.println("[INST]7;n;sc.nextLong();"+n);
        long max = (long) Math.ceil(Math.sqrt(n));
System.out.println("[INST]8;None;Math.ceil(Math.sqrt(n));"+Math.ceil(Math.sqrt(n)));
System.out.println("[INST]8;None;Math.sqrt(n);"+Math.sqrt(n));
        for (long i = max; i >= 1; i--) {
            if (n % i == 0) {
                long x = n / i;
                System.out.println((i - 1) + (x - 1));
                return;
            }
        }
    }
}
