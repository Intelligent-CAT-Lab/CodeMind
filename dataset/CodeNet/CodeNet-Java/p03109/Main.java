import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String time=scn.next().substring(5);
        if(time.charAt(0)=='1'||Character.getNumericValue(time.charAt(1))>4) {
            System.out.println("TBD");
        }else{
            System.out.println("Heisei");
        }
    }
}
