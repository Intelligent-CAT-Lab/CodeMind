import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc =new Scanner(System.in);
        
        int ab = sc.nextInt();
System.out.println("[INST]7;ab;sc.nextInt();"+ab);
        int bc = sc.nextInt();
System.out.println("[INST]8;bc;sc.nextInt();"+bc);
        int ca = sc.nextInt();
System.out.println("[INST]9;ca;sc.nextInt();"+ca);
        int cal = (ab * bc) /2;

        System.out.println(cal);
    }
}
