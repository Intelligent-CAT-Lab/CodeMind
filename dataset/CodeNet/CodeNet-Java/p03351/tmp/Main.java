import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
System.out.println("[INST]4;a;sc.nextInt();"+a);
        int b = sc.nextInt();
System.out.println("[INST]5;b;sc.nextInt();"+b);
        int c = sc.nextInt();
System.out.println("[INST]6;c;sc.nextInt();"+c);
        int d = sc.nextInt();
System.out.println("[INST]7;d;sc.nextInt();"+d);
        int ab = Math.abs(a-b);
System.out.println("[INST]8;ab;Math.abs(a-b);"+ab);
        int ac = Math.abs(a-c);
System.out.println("[INST]9;ac;Math.abs(a-c);"+ac);
        int bc = Math.abs(b-c);
System.out.println("[INST]10;bc;Math.abs(b-c);"+bc);
        if(ac <= d || (ab <= d && bc <= d)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}