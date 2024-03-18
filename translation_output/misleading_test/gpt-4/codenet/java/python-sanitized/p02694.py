def calculate_years(target_amount):
    current_amount = 100
    years = 0
    while current_amount < target_amount:
        current_amount += current_amount // 100
        years += 1
    return years

# Sample test case
x = int(input())
result = calculate_years(x)
print(result)