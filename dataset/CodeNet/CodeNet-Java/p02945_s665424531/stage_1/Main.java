import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int max = a+b;
    if(max<a-b)max = a-b;   
    if(max<a*b)max = a*b;
    System.out.println(max);
  } 
}