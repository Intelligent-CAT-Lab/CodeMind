import java.util.*;
public class p03139 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(Math.min(A,B));
        System.out.println(Math.max(A+B-N,0));
    }
}