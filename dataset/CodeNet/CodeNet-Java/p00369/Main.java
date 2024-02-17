import java.util.*;

class Main{
    int val(char ch){ return ch-'0';}

    int sub(String maxs, String mins){
        for ( int i = 0; i < maxs.length(); i++ ){
            if ( maxs.charAt(i) != mins.charAt(i) ) {
                if ( i == maxs.length()-1 )
                    return val(maxs.charAt(i)) - val(mins.charAt(i));
                if ( i == maxs.length()-2 )
                    return (10*val(maxs.charAt(i))+val(maxs.charAt(i+1))) - (10*val(mins.charAt(i))+val(mins.charAt(i+1)));
                return 10;
            }
        }
        return 0;
    }

  int checkEqual(String S){
        String mins, maxs;
        int ans = 8;
        for ( int k = 1; k < S.length(); k++ ){
            if ( S.length()%k != 0 ) continue;
            mins = maxs = S.substring(0, k);
            for ( int s = 0; s < S.length(); s += k ){
                String tmp = S.substring(s, s + k);
                if ( tmp.compareTo(maxs) > 0 ) maxs = tmp;
                if ( tmp.compareTo(mins) < 0 ) mins = tmp;
            }
            ans = Math.min(ans, sub(maxs, mins));
        }
        return ans;
    }

    int check12(String S){
        int maxv = 0;
        int minv = 10;
        for( int p = 0; p < S.length(); p++){
            int v = val(S.charAt(p));
            if ( S.charAt(p) == '1' && p+1 < S.length()) {
                v = 10 + val(S.charAt(p+1));
                p++;
            }
            maxv = Math.max(maxv, v);
            minv = Math.min(minv, v);
        }
        return maxv - minv;
    }

    void solve(){
        String S;
        Scanner sc = new Scanner(System.in);
        S = sc.next();
        System.out.println(Math.min(checkEqual(S), check12(S)));
    }

    public static void main(String[] args){
        new Main().solve();
    }
}


