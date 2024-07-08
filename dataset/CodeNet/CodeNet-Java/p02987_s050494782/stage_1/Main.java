import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        Map<Character,Integer> m = new HashMap<>();
var newVariable_0 = S.length();        for (int i = 0; i < newVariable_0; i++) {
            char c = S.charAt(i);
var newVariable_1 = m.containsKey(c);            if(!newVariable_1){
var newVariable_2 = m.put(c,1);            }else{
var newVariable_3 = m.put(c,m.get(c)+1);var newVariable_4 = m.get(c);                m.put(c,newVariable_4+1);
            }
        }
var newVariable_5 = m.size();        if(newVariable_5 ==2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}
