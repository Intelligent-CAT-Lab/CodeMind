import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ans=0;

        int a=sc.nextInt();
System.out.println("[INST]9;a;sc.nextInt();"+a);
        int b=sc.nextInt();
System.out.println("[INST]10;b;sc.nextInt();"+b);
        
        ans=Math.abs(a-b);
System.out.println("[INST]12;ans;Math.abs(a-b);"+ans);

        System.out.println(ans);
    }
}
