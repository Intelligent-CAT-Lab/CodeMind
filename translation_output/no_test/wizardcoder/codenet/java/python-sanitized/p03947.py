import java.util.Scanner;

public class p03947 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        char[] input_char = input.toCharArray();
        
        char current_char = input_char[0];
        int count = 0;
        for i in range(1, len(input_char)):
            if input_char[i]!= current_char:
                count += 1
                current_char = input_char[i]
        
        System.out.println(count)
    }
}