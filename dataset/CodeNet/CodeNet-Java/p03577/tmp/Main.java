import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
System.out.println("[INST]4;line;sc.next();"+line);
        int length = line.length();
System.out.println("[INST]5;length;line.length();"+length);
        System.out.println(line.substring(0,line.length()-8));
    }
}
