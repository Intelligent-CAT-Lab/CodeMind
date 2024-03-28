import java.io
import java.util
import java.util.regex

# br = new BufferedReader(new FileReader("input.txt"));
# pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
# br = new BufferedReader(new InputStreamReader(System.in));
# pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

def main():
    br = java.io.BufferedReader(java.io.FileReader("input.txt"))
    pw = java.io.PrintWriter(java.io.BufferedWriter(java.io.FileWriter("output.txt")))
    qq = int(input())
    for casenum in range(1, qq+1):
        s = input()
        good = ["dream", "dreamer", "erase", "eraser"]
        poss = [False] * (len(s)+1)
        poss[0] = True
        for i in range(len(s)):
            if not poss[i]:
                continue
            for out in good:
                if i + len(out) > len(s):
                    continue
                match = 0
                for a in range(len(out)):
                    if s[i+a] == out[a]:
                        match += 1
                if match == len(out):
                    poss[i+match] = True
        pw.write("YES\n" if poss[len(s)] else "NO\n")
    exitImmediately()

def exitImmediately():
    pw.close()
    sys.exit(0)

def input():
    return int(inputToken())

def readLong():
    return long(inputToken())

def readDouble():
    return float(inputToken())

def readInt():
    return int(inputToken())

def readLine():
    s = br.readLine()
    if s == None:
        exitImmediately()
    st = None
    return s

def readToken():
    while st == None or not st.hasMoreTokens():
        s = readLine().trim()
        st = StringTokenizer(s)
    return st.nextToken()

main()