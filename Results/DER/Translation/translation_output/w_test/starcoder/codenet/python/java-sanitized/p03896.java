import java.util.*;
public class p03896 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n-2;i++){
            System.out.println(Arrays.stream(new int[n-1]).mapToObj(j->(i-~(j^(n%2<(j+2<n>i*2))))%n+1).collect(Collectors.joining(" ")));
        }
    }
}