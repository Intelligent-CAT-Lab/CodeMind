import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        int nc = c*2;
        long price = Long.MAX_VALUE;
        long tmpPrice = 0;
        for(int i=0; i<=100000; i++) {
            tmpPrice = i*nc + a*Math.max(0,x-i) + b*Math.max(0,y-i);
            if(price > tmpPrice) {
                price = tmpPrice;
            }
        }
        System.out.println(price);
    }
}
