import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
var newVariable_0 = s.length();        char [] word = new char[newVariable_0];
var newVariable_1 = s.length();        int len = newVariable_1-2;
var newVariable_2 = s.length();        for(int i=0;i<newVariable_2;i++){
var newVariable_3 = s.charAt(i);            word[i] = newVariable_3;
        }
        System.out.println(String.valueOf(word[0])+len+String.valueOf(word[s.length()-1]));
    }
}