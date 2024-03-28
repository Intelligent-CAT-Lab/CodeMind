class main:
    def debt_hell(total, weeks):
        sum = total
        for i in range(weeks):
            yield = sum * 0.05
            if yield % 1000 == 0:
                sum += yield
            else:
                sum += int(yield / 1000 + 1) * 1000
        return sum
    
    weeks = int(input())
    print(debt_hell(100000, weeks))