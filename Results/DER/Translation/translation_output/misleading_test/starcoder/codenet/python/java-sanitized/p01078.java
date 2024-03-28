import java.util.*;
public class p01078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.printf("%.6f", (n*Math.sin(Math.PI/n)*Math.cos(k*Math.PI/n)/Math.cos((k-1)*Math.PI/n)));
    }
}