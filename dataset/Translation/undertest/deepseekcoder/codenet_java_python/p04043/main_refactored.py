class main:
    def p04043():
        a, b, c = map(int, input().split())
    
        if(a== 5 and b == 7 and c ==5):
           print("YES")
        elif(a== 5 and b== 5 and c ==7):
           print("YES")
        elif(a == 7 and b == 5 and c ==5):
           print("YES")
        else:
           print("NO")
    
    p04043()