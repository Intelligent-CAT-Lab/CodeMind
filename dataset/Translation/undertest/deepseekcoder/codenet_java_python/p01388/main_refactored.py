class main:
    def run(s):
        c = [0]*4
        for i in s:
            if i=='K':
                c[0]+=1
            if i=='U':
                c[1]+=1
            if i=='P':
                c[2]+=1
            if i=='C':
                c[3]+=1
        return min(c)
    
    s = input()
    print(run(s))