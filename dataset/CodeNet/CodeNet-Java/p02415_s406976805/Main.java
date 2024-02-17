import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            }
            else{
                c = Character.toUpperCase(c);
            }
            System.out.print(c);
        }
        System.out.println("");
    }
}
