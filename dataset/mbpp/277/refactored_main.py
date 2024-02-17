dict = {'Cierra Vega': 175, 'Alden Cantrell': 180, 'Kierra Gentry': 165, 'Pierre Cox': 190}
n = 170
result = {key:value for (key, value) in dict.items() if value >=n}
print(result)