import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
var newVariable_0 = str.length();        for(int i = 0; i < newVariable_0; i++){
            char c = str.charAt(i);
var newVariable_1 = Character.isUpperCase(c);            if(newVariable_1){
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
