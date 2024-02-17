import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        char [] word = new char[s.length()];
        int len = s.length()-2;
        for(int i=0;i<s.length();i++){
            word[i] = s.charAt(i);
        }
        System.out.println(String.valueOf(word[0])+len+String.valueOf(word[s.length()-1]));
    }
}