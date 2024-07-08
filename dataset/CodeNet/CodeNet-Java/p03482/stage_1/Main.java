import java.util.Scanner;
 
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    int ans = 0;
var newVariable_0 = S.length();    if(newVariable_0%2==0){
var newVariable_1 = S.charAt(S.length() /2 -1);var newVariable_2 = S.length();var newVariable_3 = S.charAt(S.length() /2);var newVariable_4 = S.length();      if(S.charAt(newVariable_4 /2 -1) != S.charAt(newVariable_4 /2)){
        System.out.println(S.length() /2);
        return;
      }else{
var newVariable_5 = S.substring(0, S.length() /2);var newVariable_6 = S.length();var newVariable_7 = S.substring(S.length() /2 +1);var newVariable_8 = S.length();        S = S.substring(0, newVariable_8 /2) + S.substring(newVariable_8 /2 +1);
        ans =1;
      }
    }
var newVariable_9 = S.length();    int mid = newVariable_9 /2;
var newVariable_10 = S.length();    for(int i=1;i+mid <= newVariable_10;++i){
var newVariable_11 = S.length();var newVariable_12 = S.charAt(mid+i);var newVariable_13 = S.charAt(mid);var newVariable_14 = S.charAt(mid-i);var newVariable_15 = S.charAt(mid);      if(i+mid==S.length() || S.charAt(mid+i)!=newVariable_15 || S.charAt(mid-i)!=newVariable_15){
        ans += mid + i;
        break;
      }
    }
    System.out.println(ans);
  }
}
      