import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Set<Character> table = new HashSet<Character>();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
System.out.println("[INST]10;str;sc.nextLine();"+str);

        for(int i = 0; i < str.length(); i++) table.add(str.charAt(i));
System.out.println("[INST]12;None;str.length();"+str.length());
System.out.println("[INST]12;None;table.add(str.charAt(i));"+table.add(str.charAt(i)));
System.out.println("[INST]12;None;str.charAt(i);"+str.charAt(i));

        for(char c = 'a'; c <= 'z'; c++){
            if(!table.contains(c)){
System.out.println("[INST]15;None;table.contains(c);"+table.contains(c));
                System.out.println(c);
                return;
            }
        }
        System.out.println("None");
    }

}