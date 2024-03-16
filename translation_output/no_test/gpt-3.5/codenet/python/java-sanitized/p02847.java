import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p02847 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine().trim();
        
        int result = 7 - week(a);
        
        System.out.println(result);
    }
    
    public static int week(String a) {
        switch(a) {
            case "SUN": return 0;
            case "MON": return 1;
            case "TUE": return 2;
            case "WED": return 3;
            case "THU": return 4;
            case "FRI": return 5;
            case "SAT": return 6;
        }
        return -1; // handle case when input value is not valid
    }
}