import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
System.out.println("[INST]4;a;scn.nextInt();"+a);
        int b = scn.nextInt(); 
System.out.println("[INST]5;b;scn.nextInt();"+b);
        if(b>=a){
            System.out.println(a);
        }else{
            System.out.println(a-1);
        }
    }
}