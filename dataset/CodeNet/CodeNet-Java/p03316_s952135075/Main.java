import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long c= n;
    long s = 0;
    for(int i =0;i<11;i++){
      if(n==0){
        break;
      }
      s=s+n%10;
      n=(n-n%10)/10;

    }
    if(c%s==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
  

  
}