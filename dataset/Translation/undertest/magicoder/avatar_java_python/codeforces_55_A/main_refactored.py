class main:
    import sys
    
    def is_power_of_two(n):
        return (n & (n - 1)) == 0
    
    if __name__ == "__main__":
        n = int(sys.stdin.readline())
        if is_power_of_two(n):
            print("YES")
        else:
            print("NO")
    
    
    
    We then read the input number `n` from the standard input, and print "YES" if `n` is a power of two, and "NO" otherwise.