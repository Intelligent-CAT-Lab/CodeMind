import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);

		
		
		BigDecimal a = sqrt(new BigDecimal(sc.nextInt()),50);
System.out.println("[INST]11;None;sc.nextInt();"+sc.nextInt());
		BigDecimal b = sqrt(new BigDecimal(sc.nextInt()),50);
System.out.println("[INST]12;None;sc.nextInt();"+sc.nextInt());
		BigDecimal c = sqrt(new BigDecimal(sc.nextInt()),50);
System.out.println("[INST]13;None;sc.nextInt();"+sc.nextInt());

		
		if (a.add(b).compareTo(c)==-1) {
System.out.println("[INST]16;None;a.add(b).compareTo(c);"+a.add(b).compareTo(c));
System.out.println("[INST]16;None;a.add(b);"+a.add(b));
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

      	sc.close();
    }
		
	   public static BigDecimal sqrt(BigDecimal a, int scale){

        BigDecimal x = new BigDecimal(Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
System.out.println("[INST]27;None;a.doubleValue();"+a.doubleValue());
        if(scale < 17){
             x = x.setScale(scale, BigDecimal.ROUND_HALF_EVEN);
System.out.println("[INST]29;x;x.setScale(scale, BigDecimal.ROUND_HALF_EVEN);"+x);
             return x;
        }

        BigDecimal b2 = new BigDecimal(2);
        for(int tempScale = 16; tempScale < scale; tempScale *= 2){
            x = x.subtract(
System.out.println("[INST]35;x;x.subtract(
                    x.multiply(x).subtract(a).divide(
                    x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN));"+x);
                    x.multiply(x).subtract(a).divide(
System.out.println("[INST]36;None;x.multiply(x).subtract(a).divide(
                    x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN);"+x.multiply(x).subtract(a).divide(
                    x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN));
System.out.println("[INST]36;None;x.multiply(x).subtract(a);"+x.multiply(x).subtract(a));
System.out.println("[INST]36;None;x.multiply(x);"+x.multiply(x));
                    x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN));
System.out.println("[INST]37;None;x.multiply(b2);"+x.multiply(b2));
        }
        return x;
    }

}