import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      // 取得
	  String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
      if(check(s)){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
    //キーエンスかな
    static boolean check(String s){
        if(s.equals("keyence")){
System.out.println("[INST]14;None;s.equals('keyence');"+s.equals("keyence"));
          return true;
        }else{
          for(int i=0;i<s.length();i++){
System.out.println("[INST]17;None;s.length();"+s.length());
          	for(int j=i+1;j<=s.length();j++){
System.out.println("[INST]18;None;s.length();"+s.length());
            	 String str = s.substring(0,i)+s.substring(j);
System.out.println("[INST]19;None;s.substring(0,i);"+s.substring(0,i));
System.out.println("[INST]19;None;s.substring(j);"+s.substring(j));
                 if(str.equals("keyence")){
System.out.println("[INST]20;None;str.equals('keyence');"+str.equals("keyence"));
                   return true;
                 }
          	}
          }
        }
      return false;
    } 
}