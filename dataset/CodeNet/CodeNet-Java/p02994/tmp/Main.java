import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
System.out.println("[INST]8;n;scanner.nextInt();"+n);
        int l = scanner.nextInt();
System.out.println("[INST]9;l;scanner.nextInt();"+l);

        List<Integer> diff = new ArrayList<Integer>();
        
        for(int i = 1; i < n+1; i++) {
          int value = l+i-1;
          if(value < 0) {
            value = value * -1;
          }
          diff.add(value);
System.out.println("[INST]18;None;diff.add(value);"+diff.add(value));
          }
        
        Integer removeK = diff.indexOf(Collections.min(diff)) + 1;
System.out.println("[INST]21;None;diff.indexOf(Collections.min(diff));"+diff.indexOf(Collections.min(diff)));
System.out.println("[INST]21;None;Collections.min(diff);"+Collections.min(diff));
        
        
        System.out.println(n*l + n*(n+1)/2 - n - (l+ removeK -1));
    }
}