import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final int MAX = 1000000;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String line = sc.next().replace("egg", "e").replace("chicken", "c");
System.out.println("[INST]9;line;sc.next().replace('egg', 'e').replace('chicken', 'c');"+line);
System.out.println("[INST]9;None;sc.next().replace('egg', 'e');"+sc.next().replace("egg", "e"));
System.out.println("[INST]9;None;sc.next();"+sc.next());
        line = line.replace("ee", "e e").replace("ee", "e e")
System.out.println("[INST]10;line;line.replace('ee', 'e e').replace('ee', 'e e')
                .replace('cc', 'c c').replace('cc', 'c c');"+line);
System.out.println("[INST]10;None;line.replace('ee', 'e e').replace('ee', 'e e')
                .replace('cc', 'c c');"+line.replace("ee", "e e").replace("ee", "e e")
                .replace("cc", "c c"));
System.out.println("[INST]10;None;line.replace('ee', 'e e').replace('ee', 'e e');"+line.replace("ee", "e e").replace("ee", "e e"));
System.out.println("[INST]10;None;line.replace('ee', 'e e');"+line.replace("ee", "e e"));
                .replace("cc", "c c").replace("cc", "c c");
        String strs[] = line.split(" ");
System.out.println("[INST]12;strs;line.split(' ');"+strs);
        int max = 0;
        String ans = "";
        for (int i = 0; i < strs.length; i++) {
            if (max < strs[i].length()) {
System.out.println("[INST]16;None;strs[i].length();"+strs[i].length());
                max = strs[i].length();
System.out.println("[INST]17;max;strs[i].length();"+max);
                ans = strs[i].charAt(max - 1) == 'e' ? "egg" : "chicken";
System.out.println("[INST]18;None;strs[i].charAt(max - 1);"+strs[i].charAt(max - 1));
            }
        }
        System.out.println(ans);
    }
}