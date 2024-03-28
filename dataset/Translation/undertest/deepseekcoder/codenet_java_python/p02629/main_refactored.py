class main:
    def convert_to_title(n):
        n -= 1
        out = []
        while n >= 0:
            n, remainder = divmod(n, 26)
            out.append(chr(ord('a') + remainder))
        return ''.join(out[::-1])
    
    print(convert_to_title(int(input())))