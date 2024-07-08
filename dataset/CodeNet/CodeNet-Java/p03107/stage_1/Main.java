import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        char S0 = '0';
        int S0mas = 0;
var newVariable_0 = S.toCharArray();        for(char str : newVariable_0){
            if(str == S0){
                ++S0mas;
            }
        }
var newVariable_1 = S.length();        int S1mas = newVariable_1 - S0mas;
        if(S0mas < S1mas){
            System.out.println(S0mas * 2);
        }else{
            System.out.println(S1mas * 2);
        }
    }
}