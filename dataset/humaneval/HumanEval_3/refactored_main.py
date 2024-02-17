operations = [1, 2, -3, 1, 2, -3]
balance = 0

for op in operations:
    balance += op
    if balance < 0:
        print(True)
# no else statement so if balance never < 0, program just ends.