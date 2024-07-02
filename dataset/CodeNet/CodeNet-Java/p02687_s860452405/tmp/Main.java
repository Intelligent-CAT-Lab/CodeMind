import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
        if(s.equals("ABC")){
System.out.println("[INST]6;None;s.equals('ABC');"+s.equals("ABC"));
            System.out.println("ARC");
        }else{
            System.out.println("ABC");
        }
    }
}
