import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
System.out.println("[INST]5;line;sc.nextLine();"+line);
        String[] line1 = line.split(" ");
System.out.println("[INST]6;line1;line.split(' ');"+line1);
        int a = Integer.parseInt(line1[0]);
System.out.println("[INST]7;a;Integer.parseInt(line1[0]);"+a);
        int b = Integer.parseInt(line1[1]);
System.out.println("[INST]8;b;Integer.parseInt(line1[1]);"+b);
        if(a > 2 * b)   System.out.println(a - 2 * b);
        else System.out.println(0);
    }
}