import java.util.*;
import java.io.*;

public class p03267 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int length = (int) Math.ceil(Math.log(L) / Math.log(2));
        int[][] edges = new int[length][3];
        for (int i = 0; i < length; i++) {
            edges[i][0] = i;
            edges[i][1] = i+1;
            edges[i][2] = (1 << (i-1)) & L!= 0? 2 : 0;
        }
        edges[length-1][1] = length;
        edges[length-1][2] = L;
        System.out.println(length + " " + edges.length);
        for (int[] edge : edges) {
            System.out.println(edge[0] + " " + edge[1] + " " + edge[2]);
        }
    }
}