import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        int x = stdIn.nextInt();
        int y = stdIn.nextInt();
        int price = 0;
        
        if((a + b + 1) / 2 > c){
            if(x > y){
                price = c * y * 2;
                if(a > c * 2)
                    price += c * (x - y) * 2;
                else
                    for(int i = 0; i < x - y; i++)
                        price += a;
            }
            else{
                price = c * x * 2;
                if(b > c * 2)
                    price += c * (y - x) * 2;
                else
                    for(int i = 0; i < y - x; i++)
                        price += b;
            }
        }
        else{
            for(int i = 0; i < x; i++)
                price += a;
         
            for(int i = 0; i < y; i++)
                price += b;
        }
            
        System.out.println(price);
    }
}