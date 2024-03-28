import java.util.*;

class Main {
    static final double PI = 3.1415926535897932384626433832795;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(N*Math.sin(PI/N)*Math.cos(K*PI/N)/Math.cos((K-1)*PI/N));
    }
}