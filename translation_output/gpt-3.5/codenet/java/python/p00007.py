```python
def debt_hell(total, weeks):
    sum_val = total
    for i in range(weeks):
        yield_val = sum_val * 0.05
        if yield_val % 1000 == 0:
            sum_val += yield_val
        else:
            sum_val += int((yield_val / 1000 + 1) * 1000)
    print(sum_val)

if __name__ == "__main__":
    weeks = int(input())
    debt_hell(100000, weeks)
```
