import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < b; i++){
            for(int j = 0; j < a; j++){
                sb.append("0");
            }
            for(int j = 0; j < (w-a); j++){
                sb.append("1");
            }
            sb.append(System.lineSeparator());
        }
        for(int i = 0; i < (h-b); i++){
            for(int j = 0; j < a; j++){
                sb.append("1");
            }
            for(int j = 0; j < (w-a); j++){
                sb.append("0");
            }
            sb.append(System.lineSeparator());
        }
        
        System.out.println(sb);
    }
}