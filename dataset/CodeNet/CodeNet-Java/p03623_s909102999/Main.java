import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        String ans ="A";
        if(Math.abs(x - a) > Math.abs(x - b)) ans = "B";
        System.out.println(ans);
        }
}