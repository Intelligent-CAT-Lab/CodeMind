import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
        long c=0;
        for(int i=0;i<s.length();i++){
System.out.println("[INST]7;None;s.length();"+s.length());
            c+=(s.charAt(i)-'0');
System.out.println("[INST]8;None;s.charAt(i);"+s.charAt(i));
        }
        if(c%9 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
