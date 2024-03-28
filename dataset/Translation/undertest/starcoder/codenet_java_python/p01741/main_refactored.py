class main:
    import math
    
    def run(in_stream, out_stream):
        d = float(in_stream.readline())
        if d < 1:
            out_stream.write(str(d * math.sqrt(2)))
        elif d < math.sqrt(2):
            out_stream.write("2")
        elif d < 2:
            out_stream.write(str(d * math.sqrt(2)))
        elif d < math.sqrt(2) *