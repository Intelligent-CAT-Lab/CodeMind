import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
System.out.println("[INST]5;S;sc.next();"+S);
    long ans = 0;
    long count = 0;
    boolean b = false;
    for(int i = 0; i < S.length(); i++){
System.out.println("[INST]9;None;S.length();"+S.length());
      char c = S.charAt(i);
System.out.println("[INST]10;c;S.charAt(i);"+c);
      if(c == 'W'){
        if(b){
          ans += i-count;
          count++;
        }else{
          count++;
        }
      }else if(c == 'B'){
        b = true;
      }
    }
    System.out.println(ans);
  }
}