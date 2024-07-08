import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.useDelimiter("[\n]+");var newVariable_1 = sc.hasNext();        while (newVariable_1) {
            String S = sc.next();
            for (int i = 0; i < 26; i++) {
                String converted = "";
var newVariable_2 = S.length();                for (int j = 0; j < newVariable_2; j++) {
                    char c = S.charAt(j);
                    if (c >= 'a' && c <= 'z') {
                        converted += (char) (c + i <= 'z' ? c + i : c + i - 26);
                    } else {
                        converted += (char) c;
                    }
                }
var newVariable_3 = converted.contains("the");var newVariable_4 = converted.contains("this");var newVariable_5 = converted.contains("that");                if (converted.contains("the") || converted.contains("this") || newVariable_5) {
                    System.out.println(converted);
                    break;
                }
            }
        }
    }
}
