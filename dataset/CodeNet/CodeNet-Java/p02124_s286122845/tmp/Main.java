import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
System.out.println("[INST]5;year;sc.nextInt();"+year);
        int number = year / 100;
        StringBuilder sb = new StringBuilder();
        sb.append("ai1333");
System.out.println("[INST]8;None;sb.append('ai1333');"+sb.append("ai1333"));
        for(int i = 0; i < number;i++){
            sb.append("3");
System.out.println("[INST]10;None;sb.append('3');"+sb.append("3"));
        }
        System.out.println(new String(sb));
        
    }
}

