import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Main {
	public static void main(final String[] args){
    
    final Scanner sc = new Scanner(System.in);
    final List<Long> list = new ArrayList<>();
    //final List<Long> list2 = new ArrayList<>();

    String n = sc.next();
    char[] work = new char[n.length()];
    int num = 0;

    for(int i = 0; i < n.length(); i++){
            work[i] = n.charAt(i);

            //切り出した文字列を一文字ずつ出力
            //System.out.println(work[i]);
            }

    for(int i = 0; i < n.length(); i++){
        num += Character.getNumericValue(work[i]);
    }
    //System.out.println(num);

    if(num % 9 == 0){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }





}
}