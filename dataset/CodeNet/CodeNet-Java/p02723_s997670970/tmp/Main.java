import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    //scanner
        String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
        if(s.charAt(2)==s.charAt(3) && s.charAt(4)==s.charAt(5)){
System.out.println("[INST]6;None;s.charAt(2);"+s.charAt(2));
System.out.println("[INST]6;None;s.charAt(3);"+s.charAt(3));
System.out.println("[INST]6;None;s.charAt(4);"+s.charAt(4));
System.out.println("[INST]6;None;s.charAt(5);"+s.charAt(5));
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
