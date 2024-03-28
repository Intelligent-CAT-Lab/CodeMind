class main:
    import sys
    
    def p02873():
        n = int(input())
        cnt = 0
        curr = 0
        sum = 0
        for i in range(n):
            if i == 0:
                cnt = int(input())
            elif i == 1:
                curr = int(input())
            elif i == n-1:
                sum += curr
            elif input() == '>':
                while input() == '>':
                    cnt += 1
            else:
                sum += curr
                curr += 1
        if cnt > 1:
            sum += (cnt*(cnt-1))//2
        print(sum)
    
    if __name__ == "__main__":
        p02873()