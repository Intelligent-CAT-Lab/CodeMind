import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p00322 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();
        int F = scanner.nextInt();
        int G = scanner.nextInt();
        int H = scanner.nextInt();
        int I = scanner.nextInt();

        List<Integer> a_list = make_list(A);
        List<Integer> b_list = make_list(B);
        List<Integer> c_list = make_list(C);
        List<Integer> d_list = make_list(D);
        List<Integer> e_list = make_list(E);
        List<Integer> f_list = make_list(F);
        List<Integer> g_list = make_list(G);
        List<Integer> h_list = make_list(H);
        List<Integer> i_list = make_list(I);

        int cnt = 0;
        for (int a : a_list) {
            for (int b : b_list) {
                if (b != a) {
                    for (int c : c_list) {
                        if (c != a && c != b) {
                            for (int d : d_list) {
                                if (d != a && d != b && d != c) {
                                    for (int e : e_list) {
                                        if (e != a && e != b && e != c && e != d) {
                                            for (int f : f_list) {
                                                if (f != a && f != b && f != c && f != d && f != e) {