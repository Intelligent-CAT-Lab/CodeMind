import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Set<Character> table = new HashSet<Character>();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

var newVariable_0 = str.length();var newVariable_1 = table.add(str.charAt(i));var newVariable_2 = str.charAt(i);        for(int i = 0; i < str.length(); i++) table.add(newVariable_2);

        for(char c = 'a'; c <= 'z'; c++){
var newVariable_3 = table.contains(c);            if(!newVariable_3){
                System.out.println(c);
                return;
            }
        }
        System.out.println("None");
    }

}