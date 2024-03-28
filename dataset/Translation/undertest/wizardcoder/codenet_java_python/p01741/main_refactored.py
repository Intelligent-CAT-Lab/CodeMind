class main:
    import math
    
    class p01741:
        def run(self, in_, out_):
            sc = java.util.Scanner(in_)
            d = sc.nextDouble()
            if d < 1:
                out_.println(d * math.sqrt(2))
            elif d < math.sqrt(2):
                out_.println("2")
            elif d < 2:
                out_.println(d * math.sqrt(2))
            elif d < math.sqrt(2) *