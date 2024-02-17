import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = Integer.parseInt(sc.next());
int m = Integer.parseInt(sc.next());
long nk=1;
long mk=1;
for (int i = 1; i <= n; i++) {
    nk*=i;
    nk=nk%1000000007;
}
for (int i = 1; i <= m; i++) {
    mk*=i;
    mk=mk%1000000007;
}
long ans;

if(n==m){
    ans=(2*(nk*mk))%1000000007;
    out.println(ans);
}else if(n-m==1||n-m==-1){
    ans=(nk*mk)%1000000007;
    out.println(ans);
}else{
    ans=0;
    out.println(ans);}
}
}