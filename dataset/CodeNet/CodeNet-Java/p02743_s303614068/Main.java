import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);

		
		
		BigDecimal a = sqrt(new BigDecimal(sc.nextInt()),50);
		BigDecimal b = sqrt(new BigDecimal(sc.nextInt()),50);
		BigDecimal c = sqrt(new BigDecimal(sc.nextInt()),50);

		
		if (a.add(b).compareTo(c)==-1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

      	sc.close();
    }
		
	   public static BigDecimal sqrt(BigDecimal a, int scale){

        BigDecimal x = new BigDecimal(Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
        if(scale < 17){
             x = x.setScale(scale, BigDecimal.ROUND_HALF_EVEN);
             return x;
        }

        BigDecimal b2 = new BigDecimal(2);
        for(int tempScale = 16; tempScale < scale; tempScale *= 2){
            x = x.subtract(
                    x.multiply(x).subtract(a).divide(
                    x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN));
        }
        return x;
    }

}