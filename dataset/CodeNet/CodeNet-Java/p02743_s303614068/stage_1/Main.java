import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);

		
		
var newVariable_0 = sc.nextInt();		BigDecimal a = sqrt(new BigDecimal(newVariable_0),50);
var newVariable_1 = sc.nextInt();		BigDecimal b = sqrt(new BigDecimal(newVariable_1),50);
var newVariable_2 = sc.nextInt();		BigDecimal c = sqrt(new BigDecimal(newVariable_2),50);

		
var newVariable_3 = a.add(b).compareTo(c);var newVariable_4 = a.add(b);		if (newVariable_4.compareTo(c)==-1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

      	sc.close();
    }
		
	   public static BigDecimal sqrt(BigDecimal a, int scale){

var newVariable_5 = a.doubleValue();        BigDecimal x = new BigDecimal(Math.sqrt(newVariable_5), MathContext.DECIMAL64);
        if(scale < 17){
             x = x.setScale(scale, BigDecimal.ROUND_HALF_EVEN);
             return x;
        }

        BigDecimal b2 = new BigDecimal(2);
        for(int tempScale = 16; tempScale < scale; tempScale *= 2){
            x = x.subtract(
var newVariable_6 = x.multiply(x).subtract(a).divide(
                    x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN);var newVariable_7 = x.multiply(x).subtract(a);var newVariable_8 = x.multiply(x);                    newVariable_8.subtract(a).divide(
var newVariable_9 = x.multiply(b2);                    newVariable_9, scale, BigDecimal.ROUND_HALF_EVEN));
        }
        return x;
    }

}