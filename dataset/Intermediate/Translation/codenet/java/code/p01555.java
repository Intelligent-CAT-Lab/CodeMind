import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
  
  
public class p01555{
     
    public static long count(long s){
        long p = 1;
        long cnt = 1;
        long res = 0;
         
        while(p * 10 < s){
            long less3 =  (p * 10 - 1)/3 - (p - 1)/3;
            long less5 =  (p * 10 - 1)/5 - (p - 1)/5;
            long less15 = (p * 10 - 1)/15 - (p - 1)/15;
             
            res += ((p * 10 - 1) - (p - 1) - less3 - less5 + less15) * cnt;
            res += (less3 - less15) * 4;
            res += (less5 - less15) * 4;
            res += less15 * 8;
             
            cnt++;
            p *= 10;
        }
         
         
        long less3 =  (s - 1)/3 - (p - 1)/3;
        long less5 =  (s - 1)/5 - (p - 1)/5;
        long less15 = (s - 1)/15 - (p - 1)/15;
         
        res += ((s - 1) - (p - 1) - less3 - less5 + less15) * cnt;
        res += (less3 - less15) * 4;
        res += (less5 - less15) * 4;
        res += less15 * 8;
         
        return res;
    }
     
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
         
        final long s = sc.nextLong();
         
        long upper = s;
        long lower = 1/*(long) Math.pow(10 ,(long)Math.log10(s))*/;
         
        while(upper - lower > 1){
            long med = (upper + lower)/2;
            long dist = count(med);
            //System.out.println(upper + " " + lower + " " + med + " " + dist + " " + s);
             
            if(dist > s){
                upper = med;
            }else if(dist < s){
                lower = med;
            }else{
                upper = med;
                lower = med-1;
            }
        }
         
         
        for(long i = lower, cur = count(lower) + 1; ; i++){
            String str = null;
             
            if(i % 15 == 0){
                str = "FizzBuzz";
            }else if(i % 5 == 0){
                str = "Buzz";
            }else if(i % 3 == 0){
                str = "Fizz";
            }else{
                str = Long.toString(i);
            }
             
            char[] ch = str.toCharArray();
            for(int j = 0; j < ch.length; j++, cur++){
                 
                if(cur < s){
                    //System.out.println(cur + " " + ch[j]);
                    continue;
                }else if(cur >= (s + 20)){
                    System.out.println();
                    return;
                }else{
                    System.out.print(ch[j]);
                }
            }
        }
         
    }
      
}