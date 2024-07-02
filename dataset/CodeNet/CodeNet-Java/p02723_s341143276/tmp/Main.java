import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      String S =sc.next();
System.out.println("[INST]6;S;sc.next();"+S);
      
 if( S.charAt(2)==S.charAt(3)&&S.charAt(4)==S.charAt(5)){
System.out.println("[INST]8;None;S.charAt(2);"+S.charAt(2));
System.out.println("[INST]8;None;S.charAt(3);"+S.charAt(3));
System.out.println("[INST]8;None;S.charAt(4);"+S.charAt(4));
System.out.println("[INST]8;None;S.charAt(5);"+S.charAt(5));
   System.out.println("Yes");
 }else{
   System.out.println("No");
     }
    }
}
     