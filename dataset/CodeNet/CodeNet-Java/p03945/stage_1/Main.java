import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    sc.close();
var newVariable_0 = s.length();    String[] str=new String[newVariable_0];
    int counter=0;
    for(int i=0;i<str.length;i++){
var newVariable_1 = s.substring(i, i+1);      str[i]=newVariable_1;
    }
    for(int i=0;i<str.length-1;i++){
var newVariable_2 = str[i].equals(str[i+1]);      if(!newVariable_2){
        counter++;
      }
    }
    System.out.println(counter);
  }
}