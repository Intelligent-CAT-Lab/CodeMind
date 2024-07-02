import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[\n]+");
System.out.println("[INST]11;None;sc.useDelimiter('[\n]+');"+sc.useDelimiter("[\n]+"));
        while (sc.hasNext()) {
System.out.println("[INST]12;None;sc.hasNext();"+sc.hasNext());
            String S = sc.next();
System.out.println("[INST]13;S;sc.next();"+S);
            for (int i = 0; i < 26; i++) {
                String converted = "";
                for (int j = 0; j < S.length(); j++) {
System.out.println("[INST]16;None;S.length();"+S.length());
                    char c = S.charAt(j);
System.out.println("[INST]17;c;S.charAt(j);"+c);
                    if (c >= 'a' && c <= 'z') {
                        converted += (char) (c + i <= 'z' ? c + i : c + i - 26);
                    } else {
                        converted += (char) c;
                    }
                }
                if (converted.contains("the") || converted.contains("this") || converted.contains("that")) {
System.out.println("[INST]24;None;converted.contains('the');"+converted.contains("the"));
System.out.println("[INST]24;None;converted.contains('this');"+converted.contains("this"));
System.out.println("[INST]24;None;converted.contains('that');"+converted.contains("that"));
                    System.out.println(converted);
                    break;
                }
            }
        }
    }
}
