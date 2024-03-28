class main:
    import sys
    
    def main():
        a = [int(x) for x in sys.stdin.readline().split()]
        b = a[0] + a[1]*5 + a[2]*10 + a[3]*50 + a[4]*100 + a[5]*500
        if b >= 1000:
            print(1)
        else:
            print(0)
    
    if __name__ == '__main__':
        main()