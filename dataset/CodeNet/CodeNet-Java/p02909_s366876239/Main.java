import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String today = sc.next();

        if(today.equals("Sunny")) {
            System.out.println("Cloudy");
        } else if(today.equals("Cloudy")) {
            System.out.println("Rainy");
        } else {
            System.out.println("Sunny");
        }
    }
}