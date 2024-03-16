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

def main(args):
    # TODO Auto-generated method stub
    a = ni()

    l=ArrayList()
    solve(a,l)
    System.out.println(l.size())
    for str in l:
        out(str)

def solve(a,l):
    # TODO Auto-generated method stub
    
    if a%2==0:
        for i in range(1,a//2+1):
            for j in range(i+1,a//2+1):
                l.add(str(i)+" "+str(j))
                l.add(str(i)+" "+str(a-j))
                l.add(str(a-i)+" "+str(j))
                l.add(str(a-i)+" "+str(a-j))
    else:
        solve(a-1, l)
        for i in range(1,a):
            l.add(str(a)+" "+str(i))

def out(l):
    # TODO Auto-generated method stub
    for i in l:
        System.out.println(i)

def out(b):
    # TODO Auto-generated method stub
    for i in b:
        System.out.println(i)

def out(str):

    if dbg:
        System.out.println(str)

def out(str):

    if dbg:
        System.out.println(str)

def ni():

    return sc.nextInt()

def ns():

    return sc.nextLine()

def ni(k):
    res = [0]*k
    for i in range(k):
        res[i] = sc.nextInt()
    sc.nextLine()
    return res

def ns(k):
    res = [0]*k
    for i in range(k):
        res[i] = sc.nextLine()
    return res

def ni(a, b):
    res = [[0]*b for i in range(a)]
    for i in range(a):
        for j in range(b):
            res[i][j] = sc.nextInt()
    sc.nextLine()
    return res

if __name__ == '__main__':
    sc = Scanner(System.in)
    pps = System.getProperties()
    dbg = True
    main(None)