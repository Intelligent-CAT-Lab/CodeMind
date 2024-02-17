import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String r = "R";
    int count = s.indexOf(r);
    int lastcount = s.lastIndexOf(r);
    if(s.contentEquals("RRR")){
      System.out.println("3");
    }else if(s.contentEquals("SSR")){
      System.out.println("1");
    }else if(s.contentEquals("SRS")){
      System.out.println("1"); 
    }else if(s.contentEquals("RSS")){
      System.out.println("1");
    }else if(count == 0 && lastcount == 1 || count == 1 && lastcount == 2){
      System.out.println("2");
    }else if(count == 0 && lastcount == 2 || count == 2 && lastcount == -1|| count == 0 && lastcount == -1|| count == 1 && lastcount == -1 ){
      System.out.println("1");
    }else if(s.contentEquals("SSS")){
      System.out.println("0");

    }
  }
}

