import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
System.out.println("[INST]5;str;sc.next();"+str);
        System.out.println(str.matches("[A-Z]") ? "A" : "a");
    }
}