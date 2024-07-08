import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
var newVariable_0 = br.readLine();        StringTokenizer st  = new StringTokenizer(newVariable_0);

var newVariable_1 = st.nextToken();        int A = Integer.parseInt(newVariable_1);
var newVariable_2 = st.nextToken();        int B = Integer.parseInt(newVariable_2);
var newVariable_3 = st.nextToken();        int H = Integer.parseInt(newVariable_3);
var newVariable_4 = st.nextToken();        int M = Integer.parseInt(newVariable_4);

        int mins = 60*H+M;

        double M_angle = M*6;
        double H_angle = mins*0.5;

var newVariable_5 = Math.cos(Math.toRadians(H_angle));var newVariable_6 = Math.toRadians(H_angle);        double x1 = A*Math.cos(newVariable_6);
var newVariable_7 = Math.sin(Math.toRadians(H_angle));var newVariable_8 = Math.toRadians(H_angle);        double y1 = A*Math.sin(newVariable_8);
var newVariable_9 = Math.cos(Math.toRadians(M_angle));var newVariable_10 = Math.toRadians(M_angle);        double x2 = B*Math.cos(newVariable_10);
var newVariable_11 = Math.sin(Math.toRadians(M_angle));var newVariable_12 = Math.toRadians(M_angle);        double y2 = B*Math.sin(newVariable_12);

        System.out.println(Math.sqrt((x2-x1)*(x2-x1)  + (y2-y1)*(y2-y1)));



    }

}