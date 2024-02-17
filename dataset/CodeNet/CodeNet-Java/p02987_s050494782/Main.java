import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        Map<Character,Integer> m = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(!m.containsKey(c)){
                m.put(c,1);
            }else{
                m.put(c,m.get(c)+1);
            }
        }
        if(m.size() ==2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}
