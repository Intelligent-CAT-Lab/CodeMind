import java.util.*;

class Main{
  	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String name = sc.next();
System.out.println("[INST]5;name;sc.next();"+name);
      System.out.print(name.substring(0,3));
    }
}