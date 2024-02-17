import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int  x=scn.nextInt();
        int  y=scn.nextInt();
        int  z=scn.nextInt();
        scn.close();
        int answer =0;
        while(true){
            if(answer==0){
                if(y+2*z>x)break;
                answer++;
                x-=y+2*z;
            }else{
                if(y+z>x)break;
                answer++;
                x-=y+z;
            }
        }
        System.out.println(answer);
    }
}