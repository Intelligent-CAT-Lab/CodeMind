import java.util.*;
public class p02423 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mask = (1<<32)-1;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(~n & mask));
        System.out.println(Integer.toBinaryString((n<<1)& mask));
        System.out.println(Integer.toBinaryString((n>>1)& mask));
    }
}