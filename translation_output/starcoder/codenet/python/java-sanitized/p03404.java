import java.util.*;
public class p03404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] ar = new int[102][102];
        for(int i=0;i<102;i++){
            for(int j=0;j<102;j++){
                ar[i][j] = 0;
            }
        }
        for(int i=0;i<50;i++){
            for(int j=0;j<100;j++){
                ar[i][j] = 1;
            }
        }
        for(int i=50;i<102;i++){
            for(int j=0;j<100;j++){
                ar[i][j] = 0;
            }
        }
        int count = 0;
        for(int i=48;i>=0;i-=2){
            if(count == a-1){
                break;
            }
            if(i%2 == 0){
                for(int j=0;j<100;j+=2){
                    ar[i][j] = 0;
                    count++;
                    if(count == a-1){
                        break;
                    }
                }
            }
            else{
                for(int j=1;j<100;j+=2){
                    ar[i][j] = 0;
                    count++;
                    if(count == a-1){
                        break;
                    }
                }
            }
        }
        count = 0;
        for(int i=99;i>=50;i-=2){
            if(count == b-1){
                break;
            }
            if(i%2 == 0){
                for(int j=0;j<100;j+=2){
                    ar[i][j] = 1;
                    count++;
                    if(count == b-1){
                        break;
                    }
                }
            }
            else{
                for(int j=1;j<100;j+=2){
                    ar[i][j] = 1;
                    count++;
                    if(count == b-1){
                        break;
                    }
                }
            }
        }
        for(int i=0;i<102;i++){
            for(int j=0;j<102;j++){
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }
}