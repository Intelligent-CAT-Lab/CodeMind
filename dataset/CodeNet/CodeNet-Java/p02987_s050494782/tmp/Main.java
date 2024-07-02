import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
System.out.println("[INST]8;S;sc.next();"+S);

        Map<Character,Integer> m = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
System.out.println("[INST]11;None;S.length();"+S.length());
            char c = S.charAt(i);
System.out.println("[INST]12;c;S.charAt(i);"+c);
            if(!m.containsKey(c)){
System.out.println("[INST]13;None;m.containsKey(c);"+m.containsKey(c));
                m.put(c,1);
System.out.println("[INST]14;None;m.put(c,1);"+m.put(c,1));
            }else{
                m.put(c,m.get(c)+1);
System.out.println("[INST]16;None;m.put(c,m.get(c)+1);"+m.put(c,m.get(c)+1));
System.out.println("[INST]16;None;m.get(c);"+m.get(c));
            }
        }
        if(m.size() ==2){
System.out.println("[INST]19;None;m.size();"+m.size());
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}
