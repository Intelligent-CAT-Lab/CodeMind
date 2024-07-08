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
var newVariable_0 = Math.sqrt(a*a+b*b);        	circum = newVariable_0+a+b;
        	hight = b;
        }
        else{
var newVariable_1 = Math.sin(rad);        	area = a*b*newVariable_1/2;
var newVariable_2 = Math.sqrt(a*a+b*b-2*a*b*Math.cos(rad));var newVariable_3 = Math.cos(rad);            circum = a+b+Math.sqrt(a*a+b*b-2*a*b*newVariable_3);
var newVariable_4 = Math.sin(rad);            hight = b*newVariable_4;         
        }
        System.out.println(area);
        System.out.println(circum);
        System.out.println(hight);         
    }
}