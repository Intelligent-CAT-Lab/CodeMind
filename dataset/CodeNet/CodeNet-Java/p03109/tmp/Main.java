import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String time=scn.next().substring(5);
System.out.println("[INST]4;time;scn.next().substring(5);"+time);
System.out.println("[INST]4;None;scn.next();"+scn.next());
        if(time.charAt(0)=='1'||Character.getNumericValue(time.charAt(1))>4) {
System.out.println("[INST]5;None;time.charAt(0);"+time.charAt(0));
System.out.println("[INST]5;None;Character.getNumericValue(time.charAt(1));"+Character.getNumericValue(time.charAt(1)));
System.out.println("[INST]5;None;time.charAt(1);"+time.charAt(1));
            System.out.println("TBD");
        }else{
            System.out.println("Heisei");
        }
    }
}
