class main:
    def p02910(N):
        for i in range(len(N)):
            c = N[i]
            if i % 2 == 0:
                if c =='L':
                    return "No"
            else:
                if c =='R':
                    return "No"
        return "Yes"
    
    print(p02910(input()))