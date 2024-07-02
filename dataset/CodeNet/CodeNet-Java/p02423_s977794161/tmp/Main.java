import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long n = stdIn.nextLong();
System.out.println("[INST]9;n;stdIn.nextLong();"+n);
		String nishin = Long.toBinaryString(n);
System.out.println("[INST]10;nishin;Long.toBinaryString(n);"+nishin);
		char c[] = nishin.toCharArray();
System.out.println("[INST]11;c;nishin.toCharArray();"+c);
		int start = 32 - nishin.length();
System.out.println("[INST]12;None;nishin.length();"+nishin.length());
		for(int i = 0; i < 32; i++){
		    if(i < start){
		        System.out.print(0);
		    }else{
		        if(c[i - start] == '1'){
		            System.out.print(1);
		        }else{
		            System.out.print(0);
		        }
		    }
		}
		
		System.out.println();
		
		for(int i = 0; i < 32; i++){
		    if(i < start){
		        System.out.print(1);
		    }else{
		        if(c[i - start] == '1'){
		            System.out.print(0);
		        }else{
		            System.out.print(1);
		        }
		    }
		}
		
		System.out.println();
		
		for(int i = 1; i < 32; i++){
		    if(i < start){
		        System.out.print(0);
		    }else{
		        if(c[i - start] == '1'){
		            System.out.print(1);
		        }else{
		            System.out.print(0);
		        }
		    }
		}
		
		System.out.print(0);
		
		System.out.println();
		
		System.out.print(0);
		
		for(int i = 0; i < 31; i++){
		    if(i < start){
		        System.out.print(0);
		    }else{
		        if(c[i - start] == '1'){
		            System.out.print(1);
		        }else{
		            System.out.print(0);
		        }
		    }
		}
		
		System.out.println();
		
		
		
        
		stdIn.close();
	}

}



