def debt_hell(total, weeks):
    sum = total
    for i in range(weeks):
        yield_ = sum * 0.05
        if yield_ % 1000 == 0:
            sum += yield_
        else:
            sum += int(yield_ / 1000 + 1) * 1000
    print(sum)

if __name__ == "__main__":
    weeks = int(input())
    debt_hell(100000, weeks)