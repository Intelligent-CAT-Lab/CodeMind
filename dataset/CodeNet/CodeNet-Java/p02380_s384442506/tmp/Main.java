import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException{ 
    	InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(in);

        String line = read.readLine();
System.out.println("[INST]8;line;read.readLine();"+line);
        String [] spli = line.split(" ");
System.out.println("[INST]9;spli;line.split(' ');"+spli);
        double a = Double.parseDouble(spli[0]);
System.out.println("[INST]10;a;Double.parseDouble(spli[0]);"+a);
        double b = Double.parseDouble(spli[1]);
System.out.println("[INST]11;b;Double.parseDouble(spli[1]);"+b);
        double angle = Double.parseDouble(spli[2]);
System.out.println("[INST]12;angle;Double.parseDouble(spli[2]);"+angle);
        double rad = Math.toRadians(angle);    
System.out.println("[INST]13;rad;Math.toRadians(angle);"+rad);
        double area = 0;
        double circum = 0;
        double hight = 0;
        
        if(angle == 90){
        	area = a*b/2;
        	circum = Math.sqrt(a*a+b*b)+a+b;
System.out.println("[INST]20;None;Math.sqrt(a*a+b*b);"+Math.sqrt(a*a+b*b));
        	hight = b;
        }
        else{
        	area = a*b*Math.sin(rad)/2;
System.out.println("[INST]24;None;Math.sin(rad);"+Math.sin(rad));
            circum = a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(rad));
System.out.println("[INST]25;None;Math.sqrt(a*a+b*b-2*a*b*Math.cos(rad));"+Math.sqrt(a*a+b*b-2*a*b*Math.cos(rad)));
System.out.println("[INST]25;None;Math.cos(rad);"+Math.cos(rad));
            hight = b*Math.sin(rad);         
System.out.println("[INST]26;None;Math.sin(rad);"+Math.sin(rad));
        }
        System.out.println(area);
        System.out.println(circum);
        System.out.println(hight);         
    }
}