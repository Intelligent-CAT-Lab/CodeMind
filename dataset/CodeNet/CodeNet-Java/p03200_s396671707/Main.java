import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    long ans = 0;
    long count = 0;
    boolean b = false;
    for(int i = 0; i < S.length(); i++){
      char c = S.charAt(i);
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