import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String today = sc.next();
System.out.println("[INST]6;today;sc.next();"+today);

        if(today.equals("Sunny")) {
System.out.println("[INST]8;None;today.equals('Sunny');"+today.equals("Sunny"));
            System.out.println("Cloudy");
        } else if(today.equals("Cloudy")) {
System.out.println("[INST]10;None;today.equals('Cloudy');"+today.equals("Cloudy"));
            System.out.println("Rainy");
        } else {
            System.out.println("Sunny");
        }
    }
}