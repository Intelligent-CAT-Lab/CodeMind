import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Set<Character> table = new HashSet<Character>();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++) table.add(str.charAt(i));

        for(char c = 'a'; c <= 'z'; c++){
            if(!table.contains(c)){
                System.out.println(c);
                return;
            }
        }
        System.out.println("None");
    }

}