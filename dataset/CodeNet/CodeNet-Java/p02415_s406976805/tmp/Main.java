import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
System.out.println("[INST]4;str;sc.nextLine();"+str);
        for(int i = 0; i < str.length(); i++){
System.out.println("[INST]5;None;str.length();"+str.length());
            char c = str.charAt(i);
System.out.println("[INST]6;c;str.charAt(i);"+c);
            if(Character.isUpperCase(c)){
System.out.println("[INST]7;None;Character.isUpperCase(c);"+Character.isUpperCase(c));
                c = Character.toLowerCase(c);
System.out.println("[INST]8;c;Character.toLowerCase(c);"+c);
            }
            else{
                c = Character.toUpperCase(c);
System.out.println("[INST]11;c;Character.toUpperCase(c);"+c);
            }
            System.out.print(c);
        }
        System.out.println("");
    }
}
