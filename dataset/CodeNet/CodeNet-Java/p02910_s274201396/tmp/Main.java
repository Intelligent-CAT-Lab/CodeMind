import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
System.out.println("[INST]4;S;sc.next();"+S);
    String li[] = S.split("");
System.out.println("[INST]5;li;S.split('');"+li);
    int count = 0;
    
    for(int i=0;i<li.length;i++){
      if(i%2==0){
        if (li[i].equals("R") || li[i].equals("U") || li[i].equals("D")){
System.out.println("[INST]10;None;li[i].equals('R');"+li[i].equals("R"));
System.out.println("[INST]10;None;li[i].equals('U');"+li[i].equals("U"));
System.out.println("[INST]10;None;li[i].equals('D');"+li[i].equals("D"));
        }else{
          count++;
          break;
        }
      }else{
        if(li[i].equals("L") || li[i].equals("U") || li[i].equals("D")){
System.out.println("[INST]16;None;li[i].equals('L');"+li[i].equals("L"));
System.out.println("[INST]16;None;li[i].equals('U');"+li[i].equals("U"));
System.out.println("[INST]16;None;li[i].equals('D');"+li[i].equals("D"));
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