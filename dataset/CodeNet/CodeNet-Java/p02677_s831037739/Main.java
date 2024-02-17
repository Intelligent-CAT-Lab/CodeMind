import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int mins = 60*H+M;

        double M_angle = M*6;
        double H_angle = mins*0.5;

        double x1 = A*Math.cos(Math.toRadians(H_angle));
        double y1 = A*Math.sin(Math.toRadians(H_angle));
        double x2 = B*Math.cos(Math.toRadians(M_angle));
        double y2 = B*Math.sin(Math.toRadians(M_angle));

        System.out.println(Math.sqrt((x2-x1)*(x2-x1)  + (y2-y1)*(y2-y1)));



    }

}