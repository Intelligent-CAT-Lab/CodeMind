import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String A = sc.next();
System.out.println("[INST]4;A;sc.next();"+A);
      if(A.contains("a")&&A.contains("c")&&A.contains("b")){
System.out.println("[INST]5;None;A.contains('a');"+A.contains("a"));
System.out.println("[INST]5;None;A.contains('c');"+A.contains("c"));
System.out.println("[INST]5;None;A.contains('b');"+A.contains("b"));
      System.out.println("Yes");
      }
      else {
      System.out.println("No");
      }
   }
 }