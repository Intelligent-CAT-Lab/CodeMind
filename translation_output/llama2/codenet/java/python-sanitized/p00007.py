import java.util

def debtHell(total, weeks):
    sum = total
    for i in range(weeks):
        yield = sum * 0.05
        if yield % 1000 == 0:
            sum += yield
        else:
            sum += (int)(yield /1000 + 1) *1000
    return sum

if __name__ == '__main__':
    total = int(input())
    weeks = int(input())
    print(debtHell(total, weeks))