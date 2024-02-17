a,b,c,d = list(map(int,input().split()))
def A_win():
    print("Alice")
def B_win():
    print("Bob")
def Draw():
    print("Draw")
if c == -1 or d == -1:
    if a < b:
        A_win()
    elif a > b:
        B_win()
    else:
        Draw()
elif c > d:
    A_win()
elif c < d:
    B_win()
elif c == d:
    Draw()
