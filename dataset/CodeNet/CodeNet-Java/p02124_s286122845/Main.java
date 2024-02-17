import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int number = year / 100;
        StringBuilder sb = new StringBuilder();
        sb.append("ai1333");
        for(int i = 0; i < number;i++){
            sb.append("3");
        }
        System.out.println(new String(sb));
        
    }
}

