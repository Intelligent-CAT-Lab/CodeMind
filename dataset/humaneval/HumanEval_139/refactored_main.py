n = 4
fact_i = 1
special_fact = 1
for i in range(1, n+1):
    fact_i *= i
    special_fact *= fact_i
print(special_fact)