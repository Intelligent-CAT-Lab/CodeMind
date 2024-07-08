import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final int MAX = 1000000;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

var newVariable_0 = sc.next().replace("egg", "e");var newVariable_1 = sc.next();        String line = newVariable_1.replace("egg", "e").replace("chicken", "c");
var newVariable_2 = line.replace("ee", "e e").replace("ee", "e e")
                .replace("cc", "c c");var newVariable_3 = line.replace("ee", "e e").replace("ee", "e e");var newVariable_4 = line.replace("ee", "e e");        line = newVariable_4.replace("ee", "e e")
                .replace("cc", "c c").replace("cc", "c c");
        String strs[] = line.split(" ");
        int max = 0;
        String ans = "";
        for (int i = 0; i < strs.length; i++) {
var newVariable_5 = strs[i].length();            if (max < newVariable_5) {
                max = strs[i].length();
var newVariable_6 = strs[i].charAt(max - 1);                ans = newVariable_6 == 'e' ? "egg" : "chicken";
            }
        }
        System.out.println(ans);
    }
}