import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException{ 
    	InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(in);

        String line = read.readLine();
        String [] spli = line.split(" ");
        double a = Double.parseDouble(spli[0]);
        double b = Double.parseDouble(spli[1]);
        double angle = Double.parseDouble(spli[2]);
        double rad = Math.toRadians(angle);    
        double area = 0;
        double circum = 0;
        double hight = 0;
        
        if(angle == 90){
        	area = a*b/2;
        	circum = Math.sqrt(a*a+b*b)+a+b;
        	hight = b;
        }
        else{
        	area = a*b*Math.sin(rad)/2;
            circum = a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(rad));
            hight = b*Math.sin(rad);         
        }
        System.out.println(area);
        System.out.println(circum);
        System.out.println(hight);         
    }
}