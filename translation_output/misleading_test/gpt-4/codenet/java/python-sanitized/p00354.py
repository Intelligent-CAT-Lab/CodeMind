def print_day_of_week():
    day_index = int(input())
    print("thu:fri:sat:sun:mon:tue:wed".split(":")[day_index % 7])

# Sample test case
print_day_of_week()