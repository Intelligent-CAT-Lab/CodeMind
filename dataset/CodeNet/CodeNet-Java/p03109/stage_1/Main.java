import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
var newVariable_0 = scn.next();        String time=newVariable_0.substring(5);
var newVariable_1 = time.charAt(0);var newVariable_2 = Character.getNumericValue(time.charAt(1));var newVariable_3 = time.charAt(1);        if(time.charAt(0)=='1'||Character.getNumericValue(newVariable_3)>4) {
            System.out.println("TBD");
        }else{
            System.out.println("Heisei");
        }
    }
}
