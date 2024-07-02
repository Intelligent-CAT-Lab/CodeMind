import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
System.out.println("[INST]7;line;br.readLine();"+line);
        
        String[] tmpArray = line.split(" ");
System.out.println("[INST]9;tmpArray;line.split(' ');"+tmpArray);
        
        int overLimit = Integer.parseInt(tmpArray[0]);
System.out.println("[INST]11;overLimit;Integer.parseInt(tmpArray[0]);"+overLimit);
        int prevDay = Integer.parseInt(tmpArray[1]);
System.out.println("[INST]12;prevDay;Integer.parseInt(tmpArray[1]);"+prevDay);
        int overDay = Integer.parseInt(tmpArray[2]);
System.out.println("[INST]13;overDay;Integer.parseInt(tmpArray[2]);"+overDay);
        
        if(prevDay >= overDay){
            System.out.println("delicious");
        }
        else if(prevDay + overLimit < overDay){
            System.out.println("dangerous");
        }
        else {
            System.out.println("safe");
        }
    }
}
