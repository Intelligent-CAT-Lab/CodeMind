import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      // 取得
	  String s = sc.next();
      if(check(s)){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
    //キーエンスかな
    static boolean check(String s){
var newVariable_0 = s.equals("keyence");        if(newVariable_0){
          return true;
        }else{
var newVariable_1 = s.length();          for(int i=0;i<newVariable_1;i++){
var newVariable_2 = s.length();          	for(int j=i+1;j<=newVariable_2;j++){
var newVariable_3 = s.substring(0,i);var newVariable_4 = s.substring(j);            	 String str = s.substring(0,i)+newVariable_4;
var newVariable_5 = str.equals("keyence");                 if(newVariable_5){
                   return true;
                 }
          	}
          }
        }
      return false;
    } 
}