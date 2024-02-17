import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		int i;
		
		for(i = 0; i < 100; i++){
			if(num >= Math.pow(2, i)-1){
				continue;
			}else{
				break;
			}
		}
		
		System.out.println(i-1);
	}
}

