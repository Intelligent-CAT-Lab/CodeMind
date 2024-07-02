import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
System.out.println("[INST]4;S;sc.next();"+S);
        String replaced = S.replace("eraser", "").replace("erase", "").replace("dreamer", "").replace("dream", "");
System.out.println("[INST]5;replaced;S.replace('eraser', '').replace('erase', '').replace('dreamer', '').replace('dream', '');"+replaced);
System.out.println("[INST]5;None;S.replace('eraser', '').replace('erase', '').replace('dreamer', '');"+S.replace("eraser", "").replace("erase", "").replace("dreamer", ""));
System.out.println("[INST]5;None;S.replace('eraser', '').replace('erase', '');"+S.replace("eraser", "").replace("erase", ""));
System.out.println("[INST]5;None;S.replace('eraser', '');"+S.replace("eraser", ""));
        if(replaced.length() == 0) System.out.println("YES");
System.out.println("[INST]6;None;replaced.length();"+replaced.length());
        else System.out.println("NO");
    }
}
