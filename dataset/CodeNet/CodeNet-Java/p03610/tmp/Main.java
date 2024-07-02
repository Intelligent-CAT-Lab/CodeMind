import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
        String[] array = s.split("");
System.out.println("[INST]6;array;s.split('');"+array);

        for(int i = 0; i < s.length(); i += 2){
System.out.println("[INST]8;None;s.length();"+s.length());
            System.out.print(array[i]);
        }
        
    }
}