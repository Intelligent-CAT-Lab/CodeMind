import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String today = sc.next();

var newVariable_0 = today.equals("Sunny");        if(newVariable_0) {
            System.out.println("Cloudy");
var newVariable_1 = today.equals("Cloudy");        } else if(newVariable_1) {
            System.out.println("Rainy");
        } else {
            System.out.println("Sunny");
        }
    }
}