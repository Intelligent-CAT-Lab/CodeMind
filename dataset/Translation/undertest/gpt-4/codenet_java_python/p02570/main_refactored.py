class main:
    import sys
    from io import StringIO
    
    class p02570:
        @staticmethod
        def main(args):
            # Buffered reader setup for standard input capture.
            input_buffer = StringIO(sys.stdin.read())
            
            # Read the input from the buffer instead of direct IO calls.
            d, t, s = map(int, input_buffer.readline().strip().split())
            ans = d *