import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        String S =sc.next();
System.out.println("[INST]7;S;sc.next();"+S);
        String word[] =S.split("");
System.out.println("[INST]8;word;S.split('');"+word);
        
        String result ="";
        
        
            if(word[0].equals("A") &&word[1].equals("A")&&word[2].equals("A")){
System.out.println("[INST]13;None;word[0].equals('A');"+word[0].equals("A"));
System.out.println("[INST]13;None;word[1].equals('A');"+word[1].equals("A"));
System.out.println("[INST]13;None;word[2].equals('A');"+word[2].equals("A"));
                result ="No";
            }else if(word[0].equals("B") &&word[1].equals("B")&&word[2].equals("B")){
System.out.println("[INST]15;None;word[0].equals('B');"+word[0].equals("B"));
System.out.println("[INST]15;None;word[1].equals('B');"+word[1].equals("B"));
System.out.println("[INST]15;None;word[2].equals('B');"+word[2].equals("B"));
                result ="No";
            }else{
                result ="Yes";
            }
            
        
        System.out.println(result);
        
    }
    
    
}
