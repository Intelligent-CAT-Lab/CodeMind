import java.util.Scanner;

public class p00017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine().trim();
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c!='' && c!= '.') {
                    result += (char) (c + 1);
                } else {
                    result += c;
                }
            }
            result = result.replace((char) (ord('z') + 1), 'a');
            if (result.contains("the") || result.contains("that") || result.contains("this")) {
                System.out.println(result);
                break;
            }
        }
    }
}