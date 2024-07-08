import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        String S =sc.next();
        String word[] =S.split("");
        
        String result ="";
        
        
var newVariable_0 = word[0].equals("A");var newVariable_1 = word[1].equals("A");var newVariable_2 = word[2].equals("A");            if(word[0].equals("A") &&word[1].equals("A")&&newVariable_2){
                result ="No";
var newVariable_3 = word[0].equals("B");var newVariable_4 = word[1].equals("B");var newVariable_5 = word[2].equals("B");            }else if(word[0].equals("B") &&word[1].equals("B")&&newVariable_5){
                result ="No";
            }else{
                result ="Yes";
            }
            
        
        System.out.println(result);
        
    }
    
    
}
