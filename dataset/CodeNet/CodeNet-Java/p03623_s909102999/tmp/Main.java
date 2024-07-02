import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
System.out.println("[INST]6;x;sc.nextInt();"+x);
System.out.println("[INST]6;a;sc.nextInt();"+a);
System.out.println("[INST]6;b;sc.nextInt();"+b);
        String ans ="A";
        if(Math.abs(x - a) > Math.abs(x - b)) ans = "B";
System.out.println("[INST]8;None;Math.abs(x - a);"+Math.abs(x - a));
System.out.println("[INST]8;None;Math.abs(x - b);"+Math.abs(x - b));
        System.out.println(ans);
        }
}