import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        int result = 0;
        int p = 0;
        int g = 1;
        
        for (int i = 1; i < input.length; i++) {
            if (input[i] == 'g') {
                if (p + 1 <= g) {
                    result++;
                    p++;
                } else {
                    g++;
                }
            } else {
                if (p + 1 <= g) {
                    p++;
                } else {
                    g++;
                    result--;
                }
            }
        }
        
        System.out.println(result);
    }
}