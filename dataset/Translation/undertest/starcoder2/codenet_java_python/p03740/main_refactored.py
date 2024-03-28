class main:
    a,b = map(int,input().split())
    print("Brown" if abs(a-b)<=1 else "Alice")