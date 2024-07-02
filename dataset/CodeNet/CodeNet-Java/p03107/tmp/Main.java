import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
System.out.println("[INST]5;S;sc.next();"+S);
        sc.close();
        char S0 = '0';
        int S0mas = 0;
        for(char str : S.toCharArray()){
System.out.println("[INST]9;None;S.toCharArray();"+S.toCharArray());
            if(str == S0){
                ++S0mas;
            }
        }
        int S1mas = S.length() - S0mas;
System.out.println("[INST]14;None;S.length();"+S.length());
        if(S0mas < S1mas){
            System.out.println(S0mas * 2);
        }else{
            System.out.println(S1mas * 2);
        }
    }
}