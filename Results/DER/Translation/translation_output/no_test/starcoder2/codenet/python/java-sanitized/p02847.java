import java.util.Scanner;

public class p02847 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int[] week = {0,1,2,3,4,5,6};
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        for(int i=0;i<7;i++){
            if(a.equals(day[i])){
                System.out.println(7-week[i]);
            }
        }
    }
}