Here is the Python equivalent of your Java code:

```python
def debt_hell(total, weeks):
    sum = total
    for i in range(weeks):
        yield = sum * 0.05
        if yield % 1000 == 0:
            sum += yield
        else:
            sum += (int(yield / 1000) + 1) * 1000
    print(sum)

total = 100000
weeks = int(input("Enter the number of weeks: "))
debt_hell(total, weeks)
```

In this Python code, we define a function `debt_hell` that takes two arguments: `total` and `weeks`. Inside the function, we calculate the yield for each week and add it to the sum. If the yield is a multiple of 1000, we add it to the sum as is. Otherwise, we add the next multiple of 1000 to the sum. Finally, we print the sum.

In the main part of the code, we ask the user to enter the number of weeks and call the `debt_hell` function with the total amount and the number of weeks.
