import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String li[] = S.split("");
    int count = 0;
    
    for(int i=0;i<li.length;i++){
      if(i%2==0){
        if (li[i].equals("R") || li[i].equals("U") || li[i].equals("D")){
        }else{
          count++;
          break;
        }
      }else{
        if(li[i].equals("L") || li[i].equals("U") || li[i].equals("D")){
        }else{
          count++;
          break;
        }
      }
    }
    if(count == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}      