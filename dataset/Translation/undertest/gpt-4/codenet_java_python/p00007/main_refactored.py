class main:
    def debt_hell(total, weeks):
        sum = total
        for i in range(weeks):
            yield_value = sum * 0.05
            if yield_value % 1000 == 0:
                sum += yield_value
            else:
                sum += (int(yield_value / 1000) + 1) * 1000
        print(sum)
    
    weeks = int(input())
    debt_hell(100000, weeks)