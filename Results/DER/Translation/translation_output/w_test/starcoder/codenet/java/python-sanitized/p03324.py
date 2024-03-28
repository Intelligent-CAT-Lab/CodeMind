import sys

def search(a,b):
    o = (a%1000000 == 0) and 3 or (a%(10000)==0) and 2 or (a%100==0) and 1 or 0
    if b == o:
        return True
    else:
        return False

def main():
    D = int(sys.stdin.readline().strip())
    A = (D==2) and 10000 or (D==1) and 100 or 1
    N = int(sys.stdin.readline().strip())
    ser = 0
    count = 0
    while ser < N:
        count += 1
        if search(count*A,D):
            ser += 1
    print(count*A)

if __name__ == '__main__':
    main()