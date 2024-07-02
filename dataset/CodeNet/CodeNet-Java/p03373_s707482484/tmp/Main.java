import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
System.out.println("[INST]5;a;sc.nextInt();"+a);
        int b = sc.nextInt();
System.out.println("[INST]6;b;sc.nextInt();"+b);
        int c = sc.nextInt();
System.out.println("[INST]7;c;sc.nextInt();"+c);
        int x = sc.nextInt();
System.out.println("[INST]8;x;sc.nextInt();"+x);
        int y = sc.nextInt();
System.out.println("[INST]9;y;sc.nextInt();"+y);
        sc.close();

        int nc = c*2;
        long price = Long.MAX_VALUE;
        long tmpPrice = 0;
        for(int i=0; i<=100000; i++) {
            tmpPrice = i*nc + a*Math.max(0,x-i) + b*Math.max(0,y-i);
System.out.println("[INST]16;None;Math.max(0,x-i);"+Math.max(0,x-i));
System.out.println("[INST]16;None;Math.max(0,y-i);"+Math.max(0,y-i));
            if(price > tmpPrice) {
                price = tmpPrice;
            }
        }
        System.out.println(price);
    }
}
