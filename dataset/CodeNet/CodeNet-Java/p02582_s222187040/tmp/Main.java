import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
System.out.println("[INST]5;s;sc.nextLine();"+s);
    String r = "R";
    int count = s.indexOf(r);
System.out.println("[INST]7;count;s.indexOf(r);"+count);
    int lastcount = s.lastIndexOf(r);
System.out.println("[INST]8;lastcount;s.lastIndexOf(r);"+lastcount);
    if(s.contentEquals("RRR")){
System.out.println("[INST]9;None;s.contentEquals('RRR');"+s.contentEquals("RRR"));
      System.out.println("3");
    }else if(s.contentEquals("SSR")){
System.out.println("[INST]11;None;s.contentEquals('SSR');"+s.contentEquals("SSR"));
      System.out.println("1");
    }else if(s.contentEquals("SRS")){
System.out.println("[INST]13;None;s.contentEquals('SRS');"+s.contentEquals("SRS"));
      System.out.println("1"); 
    }else if(s.contentEquals("RSS")){
System.out.println("[INST]15;None;s.contentEquals('RSS');"+s.contentEquals("RSS"));
      System.out.println("1");
    }else if(count == 0 && lastcount == 1 || count == 1 && lastcount == 2){
      System.out.println("2");
    }else if(count == 0 && lastcount == 2 || count == 2 && lastcount == -1|| count == 0 && lastcount == -1|| count == 1 && lastcount == -1 ){
      System.out.println("1");
    }else if(s.contentEquals("SSS")){
System.out.println("[INST]21;None;s.contentEquals('SSS');"+s.contentEquals("SSS"));
      System.out.println("0");

    }
  }
}

