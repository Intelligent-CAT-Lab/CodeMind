import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
System.out.println("[INST]7;a;scan.nextInt();"+a);
        int b = scan.nextInt();
System.out.println("[INST]8;b;scan.nextInt();"+b);
        int hannpenn;
        
        hannpenn=(a+b)/2;
        System.out.println(hannpenn);
        
        }
    }

