a,b=map(int,input().split())
d=".#"*(a-1)
s=".#"*(b-1)
print(100,100)
for i in range(100):
    if i<50:
        if i%2==0:
            if len(d)>0:
                if len(d)>99:
                    print(d[:100])
                    d=d[100:]
                else:
                    print(d+"#"*(100-len(d)))
                    d=""
            else:
                print("#"*100)
        else:
            print("#"*100)
    else:
        if i%2==1:
            if len(s)>0:
                if len(s)>99:
                    print(s[:100])
                    s=s[100:]
                else:
                    print(s+"."*(100-len(s)))
                    s=""
            else:
                print("."*100)
        else:
            print("."*100)