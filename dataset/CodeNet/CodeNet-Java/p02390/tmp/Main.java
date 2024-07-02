import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
System.out.println("[INST]5;S;scan.nextInt();"+S);
        int h = S / 3600;
        int hi = S % 3600;
        int m = hi / 60;
        int s = S % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}
