class main:
    import sys
    
    def intersect_time_ranges(input_line):
        a, b, c, d = map(int, input_line.split())
        start = max(a, c)
        end = min(b, d)
        return max(0, end - start)
    
    # Reading from standard input (stdin)
    for line in sys.stdin:
        print(intersect_time_ranges(line.strip()))