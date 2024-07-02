import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
System.out.println("[INST]5;a;scan.nextInt();"+a);
        int b = scan.nextInt();
System.out.println("[INST]6;b;scan.nextInt();"+b);
        if(a > b) System.out.println("a > b");
        else if(a < b) System.out.println("a < b");
        else System.out.println("a == b");
        scan.close();
    }
}
