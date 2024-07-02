import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
System.out.println("[INST]5;None;sc.hasNext();"+sc.hasNext());
      String str = sc.nextLine();
System.out.println("[INST]6;str;sc.nextLine();"+str);
      str = str.replace("apple","temp");
System.out.println("[INST]7;str;str.replace('apple','temp');"+str);
      str = str.replace("peach","apple");
System.out.println("[INST]8;str;str.replace('peach','apple');"+str);
      str = str.replace("temp","peach");
System.out.println("[INST]9;str;str.replace('temp','peach');"+str);
      System.out.println(str);
    }
  }
}