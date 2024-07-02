import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
System.out.println("[INST]6;s;sc.next();"+s);
        char [] word = new char[s.length()];
System.out.println("[INST]7;None;s.length();"+s.length());
        int len = s.length()-2;
System.out.println("[INST]8;None;s.length();"+s.length());
        for(int i=0;i<s.length();i++){
System.out.println("[INST]9;None;s.length();"+s.length());
            word[i] = s.charAt(i);
System.out.println("[INST]10;None;s.charAt(i);"+s.charAt(i));
        }
        System.out.println(String.valueOf(word[0])+len+String.valueOf(word[s.length()-1]));
    }
}