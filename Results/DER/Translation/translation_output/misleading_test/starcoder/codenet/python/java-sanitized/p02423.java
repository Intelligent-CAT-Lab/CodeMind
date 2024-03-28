import java.util.*;
public class p02423 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(~n & (1<<32)-1));
        System.out.println(Integer.toBinaryString((n<<1) & (1<<32)-1));
        System.out.println(Integer.toBinaryString((n>>1) & (1<<32)-1));
    }
}