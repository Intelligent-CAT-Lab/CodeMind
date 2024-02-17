A, B, C, D, E, F=map(int, "1 2 10 20 15 200".split())
a=[[str(100*A),'0']]
for i in range(101):
    for j in range(101):
        for k in range(101):
            for l in range(101):
                x=100*A*i+100*B*j
                y=C*k+D*l
                if x+y>F or x==0:
                    break
                if 100*y/(x+y)<=(E*100)/(100+E):
                    a.append([str(x+y),str(y)])
print(' '.join(sorted(a, key=lambda x: (100*int(x[1]))/int(x[0]) if int(x[0])!=0 else 0)[-1]))
