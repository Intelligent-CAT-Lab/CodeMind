import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

def main():
    a = int(input())
    l = []
    solve(a, l)
    print(len(l))
    for s in l:
        print(s)

def solve(a, l):
    if a % 2 == 0:
        for i in range(1, a//2+1):
            for j in range(i+1, a//2+1):
                l.append(str(i) + " " + str(j))
                l.append(str(i) + " " + str(a-j))
                l.append(str(a-i) + " " + str(j))
                l.append(str(a-i) + " " + str(a-j))
    else:
        solve(a-1, l)
        for i in range(1, a):
            l.append(str(a) + " " + str(i))

if __name__ == '__main__':
    main()