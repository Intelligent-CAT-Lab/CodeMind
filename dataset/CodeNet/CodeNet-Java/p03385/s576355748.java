import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char s[] = sc.next().toCharArray();
        boolean abc[] = new boolean[3];
        for(int i = 0; i < 3; i++) {
            if( s[i] == 'a' ) abc[0] = true;
            if( s[i] == 'b' ) abc[1] = true;
            if( s[i] == 'c' ) abc[2] = true;
        }
        
        boolean isOK = true;
        for(int i = 0; i < 3; i++) {
            isOK &= abc[i];
        }
        
        System.out.println( (isOK) ? "Yes" : "No" );
    }
}
