import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class p02957:

    def __init__(self):
        pass

    def main(self):
        in = BufferedReader(InputStreamReader(System.in))
        a = int(in.readline())
        b = int(in.readline())
        k = a + b
        if k % 2 == 0:
            print(k / 2)
        else:
            print("IMPOSSIBLE")
        in.close()