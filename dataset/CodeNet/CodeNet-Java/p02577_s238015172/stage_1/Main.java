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
var newVariable_0 = n.length();    char[] work = new char[newVariable_0];
    int num = 0;

var newVariable_1 = n.length();    for(int i = 0; i < newVariable_1; i++){
var newVariable_2 = n.charAt(i);            work[i] = newVariable_2;

            //切り出した文字列を一文字ずつ出力
            //System.out.println(work[i]);
            }

var newVariable_3 = n.length();    for(int i = 0; i < newVariable_3; i++){
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