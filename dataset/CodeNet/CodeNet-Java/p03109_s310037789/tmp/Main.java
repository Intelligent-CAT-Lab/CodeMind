import java.util.*;
class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String S = scan.next();
System.out.println("[INST]5;S;scan.next();"+S);

        String[] s = S.split("/",0);
System.out.println("[INST]7;s;S.split('/',0);"+s);

        int year = Integer.parseInt(s[0]);
System.out.println("[INST]9;year;Integer.parseInt(s[0]);"+year);
        int month = Integer.parseInt(s[1]);
System.out.println("[INST]10;month;Integer.parseInt(s[1]);"+month);
        int day = Integer.parseInt(s[2]);
System.out.println("[INST]11;day;Integer.parseInt(s[2]);"+day);

        if(year<2019){
            System.out.println("Heisei");
        }else if(year==2019){
            if(month>=5){
                System.out.println("TBD");
            }else{
                System.out.println("Heisei");
            }
        }else{
            System.out.println("TBD");
        }

    }
}