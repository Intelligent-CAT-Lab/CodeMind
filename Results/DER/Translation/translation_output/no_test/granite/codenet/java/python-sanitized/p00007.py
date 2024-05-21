import math

def debt_hell(total, weeks):
    sum = total
    for i in range(weeks):
        yield_ = sum * 0.05
        if yield_ % 1000 == 0:
            sum += yield_
        else:
            sum += math.ceil(yield_ / 1000) * 1000
    return sum

total = 100000
weeks = int(input("Enter the number of weeks: "))
result = debt_hell(total, weeks)
print(result)