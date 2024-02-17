import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
//recode
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
        String[] Aa = line.split(" ");
        long A = Long.parseLong(Aa[0]);
        long B = Long.parseLong(Aa[1]);
        long C = Long.parseLong(Aa[2]);
        long K = Long.parseLong(Aa[3]);
        long var = 1000000000000000000L;
        if(Math.abs(A-B)>var){
        	System.out.println("Unfair");
        }
        else{
        	if(K%2==0){
        		System.out.println(A-B);
        	}
        	else{
        		System.out.println(B-A);
        	}
        }
        
    }
		
		

}


