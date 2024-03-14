import java.util.*;
public class p01078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.printf("%.2f", (N*Math.sin(Math.PI/N)*Math.cos(K*Math.PI/N)/Math.cos((K-1)*Math.PI/N)));
    }
}