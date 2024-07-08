import java.util.*;
import java.util.Arrays;

public class Main{
  static int sum(int a,int b){
    int sum= 0;
    while(a!=0){
      sum += a%10;
      a /=10;
    }
    while(b!=0){
      sum += b%10;
      b /=10;
    }
    return sum;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int [] a = new int[N];
    int [] b = new int[N];
    for(int i=1;i<N;i++){
      a[i] = i;
      b[i] = N-i;
    }
    int [] c = new int[N];
    for(int i=1;i<N;i++){
      c[i] = sum(a[i],b[i]);
    }
    Arrays.sort(c);

    System.out.println(c[1]);
    
    
  }
}
                          
                         
                    
    
    
    
    
    
    
