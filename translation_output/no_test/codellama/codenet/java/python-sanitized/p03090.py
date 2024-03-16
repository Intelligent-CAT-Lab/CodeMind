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

def p03090():
    sc = Scanner(System.in)
    pps = System.getProperties()
    dbg = True

    a = ni()

    l = ArrayList[String]()
    solve(a, l)
    print(l.size())
    for str in l:
        out(str)

def solve(a, l):
    if a % 2 == 0:
        for i in range(1, a // 2 + 1):
            for j in range(i + 1, a // 2 + 1):
                l.add(str(i) + " " + str(j))
                l.add(str(i) + " " + str(a + 1 - j))
                l.add(str(a + 1 - i) + " " + str(j))
                l.add(str(a + 1 - i) + " " + str(a + 1 - j))
    else:
        solve(a - 1, l)
        for i in range(1, a):
            l.add(str(a) + " " + str(i))

def out(l):
    for i in l:
        print(i)

def out(b):
    for i in b:
        print(i)

def out(str):
    if dbg:
        print(str)

def out(str):
    if dbg:
        print(str)

def ni():
    return sc.nextInt()

def ns():
    return sc.nextLine()

def ni(k):
    res = [0] * k
    for i in range(k):
        res[i] = sc.nextInt()
    sc.nextLine()
    return res

def ns(k):
    res = [""] * k
    for i in range(k):
        res[i] = sc.nextLine()
    return res

def ni(a, b):
    res = [[0] * b for _ in range(a)]
    for i in range(a):
        for j in range(b):
            res[i][j] = sc.nextInt()
    sc.nextLine()
    return res