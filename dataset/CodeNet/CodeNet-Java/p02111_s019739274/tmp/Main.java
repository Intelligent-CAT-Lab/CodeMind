import java.util.Scanner;

public class Main {
    public static void main(String ar[]){
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
System.out.println("[INST]5;n;cin.nextInt();"+n);
        int ans1=n/30;
        n%=30;
        int ans2=n*2;
        System.out.println(ans1+" "+ans2);
    }
}