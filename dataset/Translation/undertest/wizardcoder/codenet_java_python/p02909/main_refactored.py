class main:
    import java.util.*;
    
    public class p02909 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
    
            if(str.equals("Sunny"))
            {
                System.out.println("Cloudy");
            }
            if(str.equals("Cloudy")){
                System.out.println("Rainy");
            }
            if(str.equals("Rainy")){
                System.out.println("Sunny");
            }
        }
    }