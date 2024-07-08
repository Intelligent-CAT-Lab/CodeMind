
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long w = sc.nextLong();
        long ans = 100000001;
        long h2;
        long w2;
        long h3;
        long w3;
        long s1;
        long s2;
        long s3;
        for(int i=0;i<w;i++){
        	h2 = h;
        	w2 = w - i;
        	s1 = i*h;
        	s2 = h2/2*w2;
        	s3 = (h2-h2/2)*w2;
var newVariable_0 = Math.min(ans, (long)Math.max(s1, (long)Math.max(s2, s3))-(long)Math.min(s1, (long)Math.min(s2, s3)));var newVariable_1 = Math.max(s1, (long)Math.max(s2, s3));var newVariable_2 = Math.max(s2, s3);var newVariable_3 = Math.min(s1, (long)Math.min(s2, s3));var newVariable_4 = Math.min(s2, s3);        	ans = (long)Math.min(ans, (long)Math.max(s1, (long)Math.max(s2, s3))-(long)Math.min(s1, (long)newVariable_4));
        }
        for(int i=0;i<h;i++){
        	h2 = h - i;
        	w2 = w;
        	s1 = i*w;
        	s2 = w2/2*h2;
        	s3 = (w2-w2/2)*h2;
var newVariable_5 = Math.min(ans, (long)Math.max(s1, (long)Math.max(s2, s3))-(long)Math.min(s1, (long)Math.min(s2, s3)));var newVariable_6 = Math.max(s1, (long)Math.max(s2, s3));var newVariable_7 = Math.max(s2, s3);var newVariable_8 = Math.min(s1, (long)Math.min(s2, s3));var newVariable_9 = Math.min(s2, s3);        	ans = (long)Math.min(ans, (long)Math.max(s1, (long)Math.max(s2, s3))-(long)Math.min(s1, (long)newVariable_9));
        }

        if(true){
        	h2 = h;
        	w2 = w - w/3;
        	s1 = w/3 * h;
        	s2 = w2/2*h;
        	s3 = (w2-w2/2)*h;
var newVariable_10 = Math.min(ans, (long)Math.max(s1, (long)Math.max(s2, s3))-(long)Math.min(s1, (long)Math.min(s2, s3)));var newVariable_11 = Math.max(s1, (long)Math.max(s2, s3));var newVariable_12 = Math.max(s2, s3);var newVariable_13 = Math.min(s1, (long)Math.min(s2, s3));var newVariable_14 = Math.min(s2, s3);			ans = (long)Math.min(ans, (long)Math.max(s1, (long)Math.max(s2, s3))-(long)Math.min(s1, (long)newVariable_14));        	
        }
        if(true){
        	h2 = h - h/3;
        	w2 = w;
        	s1 = h/3*w;
        	s2 = h2/2*w;
        	s3 = (h2-h2/2)*w;
var newVariable_15 = Math.min(ans, (long)Math.max(s1, (long)Math.max(s2, s3))-(long)Math.min(s1, (long)Math.min(s2, s3)));var newVariable_16 = Math.max(s1, (long)Math.max(s2, s3));var newVariable_17 = Math.max(s2, s3);var newVariable_18 = Math.min(s1, (long)Math.min(s2, s3));var newVariable_19 = Math.min(s2, s3);        	ans = (long)Math.min(ans, (long)Math.max(s1, (long)Math.max(s2, s3))-(long)Math.min(s1, (long)newVariable_19));
        }

        System.out.println(ans);
    }
}