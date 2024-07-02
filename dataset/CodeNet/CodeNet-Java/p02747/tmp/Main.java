import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
System.out.println("[INST]7;S;sc.next();"+S);

        String ans = "Yes";


        if(S.length() % 2 == 1){
System.out.println("[INST]12;None;S.length();"+S.length());
            ans = "No";
        } else {
            for(int i=0;i < S.length()/2;i+=2){
System.out.println("[INST]15;None;S.length();"+S.length());
                if(!S.substring(i,i+2).equals("hi")){
System.out.println("[INST]16;None;S.substring(i,i+2).equals('hi');"+S.substring(i,i+2).equals("hi"));
System.out.println("[INST]16;None;S.substring(i,i+2);"+S.substring(i,i+2));
                  ans = "No";
                }
            }
        }
        System.out.println(ans);

    }

}







