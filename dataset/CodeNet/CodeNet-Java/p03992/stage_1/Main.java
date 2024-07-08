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
var newVariable_0 = X.length();        for(int i=0;i<newVariable_0;i++){
            if(i==4){
var newVariable_1 = sb.append(" ").append(X.charAt(i));var newVariable_2 = sb.append(" ");var newVariable_3 = X.charAt(i);                sb.append(" ").append(newVariable_3);
            }
            else{
var newVariable_4 = sb.append(X.charAt(i));var newVariable_5 = X.charAt(i);                sb.append(newVariable_5);
            }
        }
        
        pr.println(sb.toString());
        pr.close();
        
    }
    
}
