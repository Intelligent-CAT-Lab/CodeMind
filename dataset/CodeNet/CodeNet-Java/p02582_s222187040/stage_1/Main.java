import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String r = "R";
    int count = s.indexOf(r);
    int lastcount = s.lastIndexOf(r);
var newVariable_0 = s.contentEquals("RRR");    if(newVariable_0){
      System.out.println("3");
var newVariable_1 = s.contentEquals("SSR");    }else if(newVariable_1){
      System.out.println("1");
var newVariable_2 = s.contentEquals("SRS");    }else if(newVariable_2){
      System.out.println("1"); 
var newVariable_3 = s.contentEquals("RSS");    }else if(newVariable_3){
      System.out.println("1");
    }else if(count == 0 && lastcount == 1 || count == 1 && lastcount == 2){
      System.out.println("2");
    }else if(count == 0 && lastcount == 2 || count == 2 && lastcount == -1|| count == 0 && lastcount == -1|| count == 1 && lastcount == -1 ){
      System.out.println("1");
var newVariable_4 = s.contentEquals("SSS");    }else if(newVariable_4){
      System.out.println("0");

    }
  }
}

