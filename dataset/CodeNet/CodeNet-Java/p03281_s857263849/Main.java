import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int cnt = 0;
    int temp =0;
    for(int i = 1; i <= N ; i+=2){
      for(int j = 1; j<=i ; j++){
        if(i%j == 0){
          temp++;
        }
      }
      if(temp==8){
        cnt++;
      }
      temp=0;
    }
    System.out.println(cnt);
  }
}

