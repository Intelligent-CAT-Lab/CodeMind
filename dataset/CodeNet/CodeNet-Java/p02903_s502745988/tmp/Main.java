import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
System.out.println("[INST]8;h;Integer.parseInt(sc.next());"+h);
System.out.println("[INST]8;None;sc.next();"+sc.next());
        int w = Integer.parseInt(sc.next());
System.out.println("[INST]9;w;Integer.parseInt(sc.next());"+w);
System.out.println("[INST]9;None;sc.next();"+sc.next());
        int a = Integer.parseInt(sc.next());
System.out.println("[INST]10;a;Integer.parseInt(sc.next());"+a);
System.out.println("[INST]10;None;sc.next();"+sc.next());
        int b = Integer.parseInt(sc.next());
System.out.println("[INST]11;b;Integer.parseInt(sc.next());"+b);
System.out.println("[INST]11;None;sc.next();"+sc.next());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < b; i++){
            for(int j = 0; j < a; j++){
                sb.append("0");
System.out.println("[INST]16;None;sb.append('0');"+sb.append("0"));
            }
            for(int j = 0; j < (w-a); j++){
                sb.append("1");
System.out.println("[INST]19;None;sb.append('1');"+sb.append("1"));
            }
            sb.append(System.lineSeparator());
System.out.println("[INST]21;None;sb.append(System.lineSeparator());"+sb.append(System.lineSeparator()));
System.out.println("[INST]21;None;System.lineSeparator();"+System.lineSeparator());
        }
        for(int i = 0; i < (h-b); i++){
            for(int j = 0; j < a; j++){
                sb.append("1");
System.out.println("[INST]25;None;sb.append('1');"+sb.append("1"));
            }
            for(int j = 0; j < (w-a); j++){
                sb.append("0");
System.out.println("[INST]28;None;sb.append('0');"+sb.append("0"));
            }
            sb.append(System.lineSeparator());
System.out.println("[INST]30;None;sb.append(System.lineSeparator());"+sb.append(System.lineSeparator()));
System.out.println("[INST]30;None;System.lineSeparator();"+System.lineSeparator());
        }
        
        System.out.println(sb);
    }
}