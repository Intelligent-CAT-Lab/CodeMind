import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String li[] = S.split("");
    int count = 0;
    
    for(int i=0;i<li.length;i++){
      if(i%2==0){
var newVariable_0 = li[i].equals("R");var newVariable_1 = li[i].equals("U");var newVariable_2 = li[i].equals("D");        if (li[i].equals("R") || li[i].equals("U") || newVariable_2){
        }else{
          count++;
          break;
        }
      }else{
var newVariable_3 = li[i].equals("L");var newVariable_4 = li[i].equals("U");var newVariable_5 = li[i].equals("D");        if(li[i].equals("L") || li[i].equals("U") || newVariable_5){
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