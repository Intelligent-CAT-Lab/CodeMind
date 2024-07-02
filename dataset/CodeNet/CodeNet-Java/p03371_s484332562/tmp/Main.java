import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
System.out.println("[INST]5;a;stdIn.nextInt();"+a);
        int b = stdIn.nextInt();
System.out.println("[INST]6;b;stdIn.nextInt();"+b);
        int c = stdIn.nextInt();
System.out.println("[INST]7;c;stdIn.nextInt();"+c);
        int x = stdIn.nextInt();
System.out.println("[INST]8;x;stdIn.nextInt();"+x);
        int y = stdIn.nextInt();
System.out.println("[INST]9;y;stdIn.nextInt();"+y);
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