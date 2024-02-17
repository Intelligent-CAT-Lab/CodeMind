import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      String str = sc.nextLine();
      str = str.replace("apple","temp");
      str = str.replace("peach","apple");
      str = str.replace("temp","peach");
      System.out.println(str);
    }
  }
}