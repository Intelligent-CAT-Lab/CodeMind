import java.util.*;

class Main{
    int val(char ch){ return ch-'0';}

    int sub(String maxs, String mins){
var newVariable_0 = maxs.length();        for ( int i = 0; i < newVariable_0; i++ ){
var newVariable_1 = maxs.charAt(i);var newVariable_2 = mins.charAt(i);            if ( maxs.charAt(i) != newVariable_2 ) {
var newVariable_3 = maxs.length();                if ( i == newVariable_3-1 )
var newVariable_4 = maxs.charAt(i);var newVariable_5 = mins.charAt(i);                    return val(maxs.charAt(i)) - val(newVariable_5);
var newVariable_6 = maxs.length();                if ( i == newVariable_6-2 )
var newVariable_7 = maxs.charAt(i);var newVariable_8 = maxs.charAt(i+1);var newVariable_9 = mins.charAt(i);var newVariable_10 = mins.charAt(i+1);                    return (10*val(maxs.charAt(i))+val(maxs.charAt(i+1))) - (10*val(mins.charAt(i))+val(newVariable_10));
                return 10;
            }
        }
        return 0;
    }

  int checkEqual(String S){
        String mins, maxs;
        int ans = 8;
var newVariable_11 = S.length();        for ( int k = 1; k < newVariable_11; k++ ){
var newVariable_12 = S.length();            if ( newVariable_12%k != 0 ) continue;
            mins = maxs = S.substring(0, k);
var newVariable_13 = S.length();            for ( int s = 0; s < newVariable_13; s += k ){
                String tmp = S.substring(s, s + k);
var newVariable_14 = tmp.compareTo(maxs);                if ( newVariable_14 > 0 ) maxs = tmp;
var newVariable_15 = tmp.compareTo(mins);                if ( newVariable_15 < 0 ) mins = tmp;
            }
            ans = Math.min(ans, sub(maxs, mins));
        }
        return ans;
    }

    int check12(String S){
        int maxv = 0;
        int minv = 10;
var newVariable_16 = S.length();        for( int p = 0; p < newVariable_16; p++){
var newVariable_17 = S.charAt(p);            int v = val(newVariable_17);
var newVariable_18 = S.charAt(p);var newVariable_19 = S.length();            if ( S.charAt(p) == '1' && p+1 < newVariable_19) {
var newVariable_20 = S.charAt(p+1);                v = 10 + val(newVariable_20);
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


