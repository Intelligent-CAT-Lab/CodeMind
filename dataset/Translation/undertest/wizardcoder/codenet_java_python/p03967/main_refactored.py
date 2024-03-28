class main:
    import java.io.*;
    
    public class p03967 {
    
    	public static void main(String[] args) throws IOException {
    		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    		String top = r.readLine();
    		boolean cpp = False;
    		int score = 0;
    		for (int j = 0; j < top.length(); j++) {
    			if (cpp) {
    				if (top.charAt(j) == 'g')
    					score++;
    				cpp = False;
    			}
    			else {
    				if (top.charAt(j) == 'p')
    					score--;
    				cpp = True;
    			}
    		}
    		System.out.println(score);
    	}
    
    }