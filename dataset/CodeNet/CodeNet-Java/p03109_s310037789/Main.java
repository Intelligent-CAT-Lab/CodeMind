import java.util.*;
class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String S = scan.next();

        String[] s = S.split("/",0);

        int year = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int day = Integer.parseInt(s[2]);

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