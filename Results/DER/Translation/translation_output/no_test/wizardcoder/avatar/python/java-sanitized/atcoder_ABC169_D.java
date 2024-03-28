import java.util.*;
public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        List<List<Integer>> l = factorization(x);
        l = sorted(l);
        int ans = 0;
        for(int i=0;i<l.size();i++){
            if(l.get(i).get(0)==1){
                continue;
            }else{
                int num = l.get(i).get(1);
                int j=1;
                int s=0;
                for(j=1;j<=num;j++){
                    s+=j;
                    if(s==num){
                        break;
                    }else if(s>num){
                        j--;
                        break;
                    }
                }
                ans+=j;
            }
        }
        System.out.println(ans);
    }
    public static List<List<Integer>> factorization(int n){
        List<List<Integer>> arr = new ArrayList<>();
        int temp = n;
        for(int i=2;i<=Math.sqrt(temp);i++){
            if(temp%i==0){
                int cnt=0;
                while(temp%i==0){
                    cnt++;
                    temp/=i;
                }
                arr.add(Arrays.asList(i,cnt));
            }
        }
        if(temp!=1){
            arr.add(Arrays.asList(temp,1));
        }
        if(arr.isEmpty()){
            arr.add(Arrays.asList(n,1));
        }
        return arr;
    }
    public static List<List<Integer>> sorted(List<List<Integer>> arr){
        Collections.sort(arr, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o