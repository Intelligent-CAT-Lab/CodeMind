import java.util.Scanner;
 
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    int ans = 0;
    if(S.length()%2==0){
      if(S.charAt(S.length() /2 -1) != S.charAt(S.length() /2)){
        System.out.println(S.length() /2);
        return;
      }else{
        S = S.substring(0, S.length() /2) + S.substring(S.length() /2 +1);
        ans =1;
      }
    }
    int mid = S.length() /2;
    for(int i=1;i+mid <= S.length();++i){
      if(i+mid==S.length() || S.charAt(mid+i)!=S.charAt(mid) || S.charAt(mid-i)!=S.charAt(mid)){
        ans += mid + i;
        break;
      }
    }
    System.out.println(ans);
  }
}
      