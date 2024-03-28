class main:
    import sys
    
    def solve(in_, out_):
        out_.write(in_.readline().strip() == 'ani' and'square1001' or 'e869120')
    
    if __name__ == '__main__':
        in_ = sys.stdin
        out_ = sys.stdout
        solve(in_, out_)