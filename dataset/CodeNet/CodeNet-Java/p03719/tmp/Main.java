import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
System.out.println("[INST]6;a;sc.nextInt();"+a);
        int b = sc.nextInt();
System.out.println("[INST]7;b;sc.nextInt();"+b);
        int c = sc.nextInt();
System.out.println("[INST]8;c;sc.nextInt();"+c);
        
        String result = "No";
        if (a <= c && c <= b) result ="Yes";
        
        System.out.println(result);
      
    }
}
