import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
System.out.println("[INST]4;a;in.nextInt();"+a);
        int b=in.nextInt();
System.out.println("[INST]5;b;in.nextInt();"+b);
        double c=1.0*a/b;
        System.out.println(a/b+" "+a%b+" "+String.format("%.5f",c));
    }
}
