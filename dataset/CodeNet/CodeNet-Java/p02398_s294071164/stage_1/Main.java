import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
var newVariable_0 = br.readLine();        String[] str = newVariable_0.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        int count = 0;

        for(; a <= b; a++){
            if( c % a == 0 )count++;
        }
        System.out.println(count);
    }
}