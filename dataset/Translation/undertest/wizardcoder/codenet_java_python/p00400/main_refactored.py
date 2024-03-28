class main:
    import java.io.*;
    import java.util.*;
    
    class p00400:
    
        def __init__(self):
            self.log = PrintStream(NullOutputStream())
            self.result = System.out
            self.systemin = BufferedReader(InputStreamReader(System.in))
    
        def main(self):
            sc = Scanner(self.systemin)
            N = sc.nextInt()
            r = 0
            if 'A' <= N <= 'Z':
                r = 1
            elif 'a' <= N <= 'z':
                r = 2
            self.result.printf("%d\n", r)
            sc.close()
            return False
    
    class NullOutputStream(OutputStream):
        def write(self, b):
            pass
    
    if __name__ == '__main__':
        instance = p00400()
        instance.main()
        instance.systemin.close()