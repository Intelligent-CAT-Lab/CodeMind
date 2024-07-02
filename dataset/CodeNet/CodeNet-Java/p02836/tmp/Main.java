import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
System.out.println("[INST]6;s;sc.next();"+s);
        int length = s.length();
System.out.println("[INST]7;length;s.length();"+length);

        int count =0;
        for(int i=0;i<length/2;i++){
            char a = s.charAt(i);
System.out.println("[INST]11;a;s.charAt(i);"+a);
            char b = s.charAt(length - 1 -i );
System.out.println("[INST]12;b;s.charAt(length - 1 -i );"+b);
            if(a != b){
                count++;
            }

//            System.out.println(String.valueOf(a) + String.valueOf(b));

        }
        System.out.println(count);






    }
}