import java.util.*;
public class p04033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<=0 && b>=0){
            System.out.println("Zero");
        }
        else if(b<0){
            if((b-a+1)%2==1){
                System.out.println("Negative");
            }
            else if((b-a+1)%2==0){
                System.out.println("Positive");
            }
        }
        else if(0<a){
            System.out.println("Positive");
        }
    }
}


# C


# C
si = lambda: input()
ni = lambda: int(input())
nm = lambda: map(int, input().split())
nl = lambda: list(map(int, input().split()))
n=ni()
a=nl()

for i in range(n):
    if a[i]%2==0:
        a[i]=a[i]-1
print(sum(a))