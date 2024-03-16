import java.io.IOException; 
import java.io.InputStream; 
import java.io.PrintWriter; 
import java.util.*; 
 
class p03892: 
    def gcd(self, a, b):
        if(b==0):
            return a
        return self.gcd(b, a%b)

    def solve(self): 
        a = self.ni()
        b = self.ni()
        a = abs(self.ni()-a)
        b = abs(self.ni()-b)
        g = self.gcd(a, b)
        ans = a//g + b//g -1
        self.out.println(ans*g)

    def __init__(self): 
        self.in = System.in
        self.out = PrintWriter(System.out)

    def ni(self):
        res=0
        b=self.readByte()
        while(b!='-' and (b<'0' or b>'9')):
            b=self.readByte()
        if(b=='-'):
            minus=True
            b=self.readByte()
        else:
            minus=False
        for i in range(0,10):
            if(b=='0'+str(i)):
                res=res*10+i
        if(minus):
            res=-res
        return res

    def nl(self):
        res=0
        b=self.readByte()
        while(b!='-' and (b<'0' or b>'9')):
            b=self.readByte()
        if(b=='-'):
            minus=True
            b=self.readByte()
        else:
            minus=False
        for i in range(0,10):
            if(b=='0'+str(i)):
                res=res*10+i
        if(minus):
            res=-res
        return res

    def readByte(self):
        if(self.ptr<self.buflen):
            return self.buffer[self.ptr]
        self.ptr=0
        try:
            self.buflen = self.in.read(self.buffer)
        except IOException as e:
            e.printStackTrace()
        if(self.buflen>0):
            return self.buffer[self.ptr]
        else:
            return -1

    def isSpaceChar(self, c):
        return not(33<=c and c<=126)

    def skip(self):
        res=self.readByte()
        while(res!=-1 and self.isSpaceChar(res)):
            res=self.readByte()
        return res

    def __del__(self):
        self.out.flush()

p03892().solve()