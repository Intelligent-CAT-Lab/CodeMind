class main:
    import java.awt.geom.*;
    import java.io.*;
    import java.math.*;
    import java.text.*; 
    import java.util.*;
    import java.util.regex.*;
    
    class p03856:
        def __init__(self):
            self.br = BufferedReader(InputStreamReader(System.in))
            self.pw = PrintWriter(BufferedWriter(OutputStreamWriter(System.out)))
    
        def main(self):
            try:
                qq = Integer.MAX_VALUE
                for casenum in range(1, qq+1):
                    s = self.readLine()
                    good = ["dream", "dreamer", "erase", "eraser"]
                    poss = [False]*(len(s)+1)
                    poss[0] = True
                    for i in range(len(s)):
                        if not poss[i]: continue
                        for out in good:
                            if i+len(out) > len(s): continue
                            match = 0
                            for a in range(len(out)):
                                if out[a] == s[i+a]:
                                    match += 1
                            if match == len(out):
                                poss[i+match] = True
                    self.pw.println("YES" if poss[len(s)] else "NO")
            except Exception as e:
                print(e)
            finally:
                self.pw.close()
                System.exit(0)
    
        def readLong(self):
            return long(self.readToken())
    
        def readDouble(self):
            return float(self.readToken())
    
        def readInt(self):
            return int(self.readToken())
    
        def readLine(self):
            s = self.br.readLine()
            if s == None:
                self.exitImmediately()
            self.st = None
            return s
    
        def readToken(self):
            while self.st == None or not self.st.hasMoreTokens():
                self.st = StringTokenizer(self.readLine().trim())
            return self.st.nextToken()
    
        def exitImmediately(self):
            self.pw.close()
            System.exit(0)
    
    p03856().main()