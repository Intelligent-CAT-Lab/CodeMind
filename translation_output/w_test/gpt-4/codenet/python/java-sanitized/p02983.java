import java.util.Scanner;

public class p02983 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int L = sc.nextInt();
        int R = sc.nextInt();
        
        if (R - L > 2019) {
            System.out.println(0);
        } else {
            int minVal = Integer.MAX_VALUE;
            for (int i = L; i <= R; i++) {
                for (int j = i + 1; j <= R; j++) {
                    minVal = Math.min(minVal, (i * j) % 2019);
                }
            }
            System.out.println(minVal);
        }
        
        sc.close();
    }
}