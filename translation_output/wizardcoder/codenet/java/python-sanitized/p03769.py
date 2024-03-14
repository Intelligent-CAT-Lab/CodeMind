import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import java.io.PrintWriter
import java.util.ArrayList
import java.util.Arrays
import java.util.InputMismatchException
import java.util.List

def solve():
    n = nl()
    perm = permutationWhoseNumberOfIncreasingSequenceIsK(n)
    out.println(perm.size()*2)
    for i in range(1, perm.size()+1):
        if i > 1:
            out.print(" ")
        out.print(i)
    for i in range(perm.size()):
        out.print(" ")
        out.print(perm.get(i)+1)
    out.println()

def permutationWhoseNumberOfIncreasingSequenceIsK(K):
    cur = Long.highestOneBit(K+1)-1
    list = ArrayList()
    for i in range(Long.bitCount(cur)):
        list.add(i)
    p = Long.bitCount(cur)
    for d in range(Long.bitCount(cur)-1, -1, -1):
        x = 1L<<d
        if cur + x <= K:
            cur += x
            list.add(d, p)
            p += 1
    return list

if __name__ == '__main__':
    INPUT = ""
    is = INPUT.isEmpty() and System.in or ByteArrayInputStream(INPUT.getBytes())
    out = PrintWriter(System.out)
    solve()
    out.flush()