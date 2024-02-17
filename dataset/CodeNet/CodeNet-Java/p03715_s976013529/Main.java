
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
        	ans = (long)Math.min(ans, (long)Math.max(s1, (long)Math.max(s2, s3))-(long)Math.min(s1, (long)Math.min(s2, s3)));
        }
        for(int i=0;i<h;i++){
        	h2 = h - i;
        	w2 = w;
        	s1 = i*w;
        	s2 = w2/2*h2;
        	s3 = (w2-w2/2)*h2;
        	ans = (long)Math.min(ans, (long)Math.max(s1, (long)Math.max(s2, s3))-(long)Math.min(s1, (long)Math.min(s2, s3)));
        }

        if(true){
        	h2 = h;
        	w2 = w - w/3;
        	s1 = w/3 * h;
        	s2 = w2/2*h;
        	s3 = (w2-w2/2)*h;
			ans = (long)Math.min(ans, (long)Math.max(s1, (long)Math.max(s2, s3))-(long)Math.min(s1, (long)Math.min(s2, s3)));        	
        }
        if(true){
        	h2 = h - h/3;
        	w2 = w;
        	s1 = h/3*w;
        	s2 = h2/2*w;
        	s3 = (h2-h2/2)*w;
        	ans = (long)Math.min(ans, (long)Math.max(s1, (long)Math.max(s2, s3))-(long)Math.min(s1, (long)Math.min(s2, s3)));
        }

        System.out.println(ans);
    }
}