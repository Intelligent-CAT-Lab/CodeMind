import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());
System.out.println("[INST]6;None;br.readLine();"+br.readLine());

        int A = Integer.parseInt(st.nextToken());
System.out.println("[INST]8;A;Integer.parseInt(st.nextToken());"+A);
System.out.println("[INST]8;None;st.nextToken();"+st.nextToken());
        int B = Integer.parseInt(st.nextToken());
System.out.println("[INST]9;B;Integer.parseInt(st.nextToken());"+B);
System.out.println("[INST]9;None;st.nextToken();"+st.nextToken());
        int H = Integer.parseInt(st.nextToken());
System.out.println("[INST]10;H;Integer.parseInt(st.nextToken());"+H);
System.out.println("[INST]10;None;st.nextToken();"+st.nextToken());
        int M = Integer.parseInt(st.nextToken());
System.out.println("[INST]11;M;Integer.parseInt(st.nextToken());"+M);
System.out.println("[INST]11;None;st.nextToken();"+st.nextToken());

        int mins = 60*H+M;

        double M_angle = M*6;
        double H_angle = mins*0.5;

        double x1 = A*Math.cos(Math.toRadians(H_angle));
System.out.println("[INST]18;None;Math.cos(Math.toRadians(H_angle));"+Math.cos(Math.toRadians(H_angle)));
System.out.println("[INST]18;None;Math.toRadians(H_angle);"+Math.toRadians(H_angle));
        double y1 = A*Math.sin(Math.toRadians(H_angle));
System.out.println("[INST]19;None;Math.sin(Math.toRadians(H_angle));"+Math.sin(Math.toRadians(H_angle)));
System.out.println("[INST]19;None;Math.toRadians(H_angle);"+Math.toRadians(H_angle));
        double x2 = B*Math.cos(Math.toRadians(M_angle));
System.out.println("[INST]20;None;Math.cos(Math.toRadians(M_angle));"+Math.cos(Math.toRadians(M_angle)));
System.out.println("[INST]20;None;Math.toRadians(M_angle);"+Math.toRadians(M_angle));
        double y2 = B*Math.sin(Math.toRadians(M_angle));
System.out.println("[INST]21;None;Math.sin(Math.toRadians(M_angle));"+Math.sin(Math.toRadians(M_angle)));
System.out.println("[INST]21;None;Math.toRadians(M_angle);"+Math.toRadians(M_angle));

        System.out.println(Math.sqrt((x2-x1)*(x2-x1)  + (y2-y1)*(y2-y1)));



    }

}