class main:
    import java.io.BufferedOutputStream
    import java.io.PrintWriter
    import java.util.Scanner
    
    class p03644:
        out = None
    
        @staticmethod
        def main(args):
            p03644.run()
    
        @staticmethod
        def run():
            p03644.out = PrintWriter(BufferedOutputStream(System.out))
            sc = Scanner(System.in)
            p03644.out.println(p03644.count(int(sc.next())))
            p03644.out.close()
            sc.close()
    
        @staticmethod
        def count(pnum):
            result = 0
            for i in range(0, int(math.log2(pnum))+1):
                result = int(math.pow(2, i))
            return result
    
    p03644.main(None)