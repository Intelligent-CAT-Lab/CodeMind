def debtHell(total, weeks):
    sum = total
    for _ in range(weeks):
        yield = sum * 0.05
        if yield % 1000 == 0:
            sum += yield
        else:
            sum += int((yield / 1000 + 1) * 1000)
    return sum

if __name__ == "__main__":
    weeks = int(input())
    result = debtHell(100000, weeks)
    print(result)