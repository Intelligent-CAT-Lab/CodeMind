import java.util.Scanner;

public class p00084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        code = code.replaceAll(",","");
        code = code.replaceAll("\\.","");
        String[] words = code.split("\\s+");
        
        for(String word : words) {
            if(word.length() >= 3 && word.length() <= 6) {
                System.out.print(word + " ");
            }
        }
    }
}