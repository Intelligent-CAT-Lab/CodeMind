import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        String X = br.readLine();
System.out.println("[INST]12;X;br.readLine();"+X);
        for(int i=0;i<X.length();i++){
System.out.println("[INST]13;None;X.length();"+X.length());
            if(i==4){
                sb.append(" ").append(X.charAt(i));
System.out.println("[INST]15;None;sb.append(' ').append(X.charAt(i));"+sb.append(" ").append(X.charAt(i)));
System.out.println("[INST]15;None;sb.append(' ');"+sb.append(" "));
System.out.println("[INST]15;None;X.charAt(i);"+X.charAt(i));
            }
            else{
                sb.append(X.charAt(i));
System.out.println("[INST]18;None;sb.append(X.charAt(i));"+sb.append(X.charAt(i)));
System.out.println("[INST]18;None;X.charAt(i);"+X.charAt(i));
            }
        }
        
        pr.println(sb.toString());
        pr.close();
        
    }
    
}
