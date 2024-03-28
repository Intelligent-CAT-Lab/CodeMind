class main:
    import java.util.Scanner;
    
    public class p02909 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
    
            if (str.equals("Sunny")) {
                System.out.println("Cloudy");
            } else if (str.equals("Cloudy")) {
                System.out.println("Rainy");
            } else if (str.equals("Rainy")) {
                System.out.println("Sunny");
            }
        }
    }
    
    
    
    
    import sys
    
    str = sys.stdin.readline().strip()
    
    if str == "Sunny":
        print("Cloudy")
    elif str == "Cloudy":
        print("Rainy")
    elif str == "Rainy":
        print("Sunny")