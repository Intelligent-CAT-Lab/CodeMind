import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
System.out.println("[INST]5;x;sc.nextInt();"+x);
        int y = sc.nextInt();
System.out.println("[INST]6;y;sc.nextInt();"+y);
        int x1 = x;
        int y1 = y;
        while (x1 != y1){
            if(x1 < y1)y1 -= x1;
            else x1 -= y1;
        }
        System.out.println(x + y + 1 - x1);



    }







}
