import java.util.Scanner;
 
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
System.out.println("[INST]5;S;scan.next();"+S);
    int ans = 0;
    if(S.length()%2==0){
System.out.println("[INST]7;None;S.length();"+S.length());
      if(S.charAt(S.length() /2 -1) != S.charAt(S.length() /2)){
System.out.println("[INST]8;None;S.charAt(S.length() /2 -1);"+S.charAt(S.length() /2 -1));
System.out.println("[INST]8;None;S.length();"+S.length());
System.out.println("[INST]8;None;S.charAt(S.length() /2);"+S.charAt(S.length() /2));
System.out.println("[INST]8;None;S.length();"+S.length());
        System.out.println(S.length() /2);
        return;
      }else{
        S = S.substring(0, S.length() /2) + S.substring(S.length() /2 +1);
System.out.println("[INST]12;None;S.substring(0, S.length() /2);"+S.substring(0, S.length() /2));
System.out.println("[INST]12;None;S.length();"+S.length());
System.out.println("[INST]12;None;S.substring(S.length() /2 +1);"+S.substring(S.length() /2 +1));
System.out.println("[INST]12;None;S.length();"+S.length());
        ans =1;
      }
    }
    int mid = S.length() /2;
System.out.println("[INST]16;None;S.length();"+S.length());
    for(int i=1;i+mid <= S.length();++i){
System.out.println("[INST]17;None;S.length();"+S.length());
      if(i+mid==S.length() || S.charAt(mid+i)!=S.charAt(mid) || S.charAt(mid-i)!=S.charAt(mid)){
System.out.println("[INST]18;None;S.length();"+S.length());
System.out.println("[INST]18;None;S.charAt(mid+i);"+S.charAt(mid+i));
System.out.println("[INST]18;None;S.charAt(mid);"+S.charAt(mid));
System.out.println("[INST]18;None;S.charAt(mid-i);"+S.charAt(mid-i));
System.out.println("[INST]18;None;S.charAt(mid);"+S.charAt(mid));
        ans += mid + i;
        break;
      }
    }
    System.out.println(ans);
  }
}
      