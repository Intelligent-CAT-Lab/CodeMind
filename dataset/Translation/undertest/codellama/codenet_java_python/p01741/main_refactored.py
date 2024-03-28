class main:
    import math
    
    def run(in_stream, out_stream):
        sc = Scanner(in_stream)
        d = sc.nextDouble()
        if d < 1:
            out_stream.println(d * math.sqrt(2))
        elif d < math.sqrt(2):
            out_stream.println("2")
        elif d < 2:
            out_stream.println(d * math.sqrt(2))
        elif d < math.sqrt(2) *