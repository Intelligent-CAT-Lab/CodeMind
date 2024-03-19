import java.util.*;
public class p03897 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Pair> ans=new ArrayList<Pair>();
        for(int i=0;i<n-1;i++){
            if(i%2==1){
                ans.add(new Pair(i,0));
            }
        }
        for(int i=0;i<n-1;i++){
            if(i%6==1){
                for(int j=2;j<n;j++){
                    if(j%2==0){
                        ans.add(new Pair(i,j));
                    }
                }
            }
            if(i%6==4){
                for(int j=0;j<n;j++){
                    if(j%2==1){
                        ans.add(new Pair(i,j));
                    }
                }
            }
        }
        for(int j=0;j<n;j++){
            if((n-1+j)%2==1){
                ans.add(new Pair(n-1,j));
            }
        }
        System.out.println(ans.size());
        for(Pair p:ans){
            System.out.println(p.x+" "+p.y);
        }
    }
}
class Pair{
    int x,y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}