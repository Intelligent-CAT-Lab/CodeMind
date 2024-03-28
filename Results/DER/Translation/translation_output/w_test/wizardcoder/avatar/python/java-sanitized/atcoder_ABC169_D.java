import java.util.*;
public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        List<List<Long>> l = factorization(x);
        l = sortByFirst(l);
        long ans = 0;
        for(int i=0;i<l.size();i++){
            if(l.get(i).get(0)==1){
                continue;
            }else{
                long s=0;
                long num=l.get(i).get(1);
                if(num==1){
                    long j=1;
                }else{
                    for(long j=1;j<=num;j++){
                        s+=j;
                        if(s==num){
                            break;
                        }else if(s>num){
                            j--;
                            break;
                        }
                    }
                }
                ans+=j;
            }
        }
        System.out.println(ans);
    }
    public static List<List<Long>> factorization(long n){
        List<List<Long>> arr = new ArrayList<>();
        long temp = n;
        for(long i=2;i<=Math.sqrt(temp);i++){
            if(temp%i==0){
                long cnt=0;
                while(temp%i==0){
                    cnt++;
                    temp/=i;
                }
                arr.add(Arrays.asList(i,cnt));
            }
        }
        if(temp!=1){
            arr.add(Arrays.asList(temp,1L));
        }
        if(arr.isEmpty()){
            arr.add(Arrays.asList(n,1L));
        }
        return arr;
    }
    public static List<List<Long>> sortByFirst(List<List<Long>> l){
        Collections.sort(l, new Comparator<List<Long>>() {
            @Override
            public int compare(List<Long> o1, List<Long> o2) {
                return o