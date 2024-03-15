def debt_hell(total, weeks):
    sum = total
    for i in range(weeks):
        yield_amount = sum * 0.05
        if yield_amount % 1000 == 0:
            sum += yield_amount
        else:
            sum += (int(yield_amount // 1000) + 1) * 1000
    print(sum)

def main():
    weeks = int(input())
    debt_hell(100000, weeks)

if __name__ == "__main__":
    main()