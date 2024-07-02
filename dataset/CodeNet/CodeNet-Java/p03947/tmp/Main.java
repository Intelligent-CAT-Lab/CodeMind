import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
System.out.println("[INST]5;input;scan.nextLine();"+input);
        
        char[] input_char = input.toCharArray();
System.out.println("[INST]7;input_char;input.toCharArray();"+input_char);
        
        char current_char = input_char[0];
        int count = 0;
        for (int i=1;i<input_char.length;i++) {
            if (input_char[i]!=current_char) {
                count++;
                current_char = input_char[i];
            }
        }
        
        System.out.println(count);
    }
}
