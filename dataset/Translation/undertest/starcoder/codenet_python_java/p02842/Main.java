import java.util.*;
public class p02842 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[50001];
        arr[0]=0;
        for(int i=1;i<=50000;i++){
            arr[i]=i*