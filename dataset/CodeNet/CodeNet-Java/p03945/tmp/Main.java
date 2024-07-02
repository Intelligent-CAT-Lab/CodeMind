import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
System.out.println("[INST]4;s;sc.next();"+s);
    sc.close();
    String[] str=new String[s.length()];
System.out.println("[INST]6;None;s.length();"+s.length());
    int counter=0;
    for(int i=0;i<str.length;i++){
      str[i]=s.substring(i, i+1);
System.out.println("[INST]9;None;s.substring(i, i+1);"+s.substring(i, i+1));
    }
    for(int i=0;i<str.length-1;i++){
      if(!str[i].equals(str[i+1])){
System.out.println("[INST]12;None;str[i].equals(str[i+1]);"+str[i].equals(str[i+1]));
        counter++;
      }
    }
    System.out.println(counter);
  }
}