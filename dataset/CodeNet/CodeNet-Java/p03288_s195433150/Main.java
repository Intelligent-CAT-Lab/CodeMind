import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    String s = "";
    if(r<1200){
      s="ABC";
    }else if(r<2800){
      s="ARC";
    }else{
      s="AGC";
    }
    System.out.println(s);
  }
  

  
}