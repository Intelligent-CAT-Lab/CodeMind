import math

def debt_hell(total, weeks):
    sum = total
    for i in range(weeks):
        yield = sum * 0.05
        if yield % 1000 == 0:
            sum += yield
        else:
            sum += math.ceil(yield / 1000) * 1000
    return sum

print(debt_hell(100000, 5))