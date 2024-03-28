class main:
    import java.lang.*;
    import java.io.*;
    import java.util.*;
    
    class p03264:
        def main(args):
            sc=FScanner()
            n=sc.readInt()
            o=0
            e=0
            for i in range(1,n+1):
                if i%2==1:
                    o+=1
                else:
                    e+=1
            print(o*e)
            
        def solve():
            pass
        
        def disp(data):
            for i in range(len(data)):
                print(data[i],end=" ")
            print()
            
        def disp(data):
            for i in range(len(data)):
                print(data[i],end=" ")
            print()
            
        class FScanner:
            def __init__(self):
                self.sc=Scanner(System.in)
            def hasNextLine(self):
                has=True
                if not self.sc.hasNextLine():
                    has=False
                return has
            def readInt(self):
                i=self.sc.nextInt()
                return i
            def readLong(self):
                i=Long.parseLong(self.sc.nextLine())
                return i
            def readIntL(self):
                buf=self.sc.nextLine().split(" ")
                num=[int(buf[i]) for i in range(len(buf))]
                return num
            def readString(self):
                return self.sc.nextLine()
            def readStringL(self,dlm):
                s=self.sc.nextLine().split(dlm)
                return s