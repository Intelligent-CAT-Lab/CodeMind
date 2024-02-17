import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        String S =sc.next();
        String word[] =S.split("");
        
        String result ="";
        
        
            if(word[0].equals("A") &&word[1].equals("A")&&word[2].equals("A")){
                result ="No";
            }else if(word[0].equals("B") &&word[1].equals("B")&&word[2].equals("B")){
                result ="No";
            }else{
                result ="Yes";
            }
            
        
        System.out.println(result);
        
    }
    
    
}
