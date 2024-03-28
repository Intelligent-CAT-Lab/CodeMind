class main:
    import sys
    
    def debtHell(total, weeks):
        sum = total
        for i in range(weeks):
            yield_ = sum * 0.05
            if yield_ % 1000 == 0:
                sum += yield_
            else:
                sum += (int)(yield_ /1000 + 1) *1000
        print(sum)
    
    if __name__ == '__main__':
        total = int(sys.stdin.readline())
        weeks = int(sys.stdin.readline())
        debtHell(total, weeks)