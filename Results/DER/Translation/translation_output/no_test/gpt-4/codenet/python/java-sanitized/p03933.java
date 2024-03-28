import java.io.*;
import java.util.Scanner;
import static java.lang.Math.*;

public class p03933 {
    public static double pi = Math.PI;
    
    public static boolean test(int N, long K, double x) {
        double theta = pi/N;
        long cnt = 0;
        for (int A = 1; A <= N - 2; A++) {
            double sA = sin(A * theta);
            double diff = acos(Math.max(-