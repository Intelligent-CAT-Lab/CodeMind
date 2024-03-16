import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class p00018:
    def main(self, args):
        sc = Scanner(System.in)
        ans = [1, 1, 1, 1, 1]
        count = 0
        while sc.hasNext():
            num = sc.nextInt()
            ans[count] = num
            count += 1
            if count == 5:
                print(strkn(ans))
                break
    def strkn(self, ans):
        ans.sort(reverse=True)
        result = ans[0] + " " + ans[1] + " " + ans[2] + " " + ans[3] + " " + ans[4]
        return result