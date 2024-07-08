import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        String ans ="A";
var newVariable_0 = Math.abs(x - a);var newVariable_1 = Math.abs(x - b);        if(Math.abs(x - a) > newVariable_1) ans = "B";
        System.out.println(ans);
        }
}