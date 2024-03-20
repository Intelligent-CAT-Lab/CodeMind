x = int(input())
if x>=3 and x<=10000:
    for i in range(1,x+1):
        if i%3==0:
            print(i,end=" ")
        else:
            if '3' in str(i):
                print(i,end=" ")