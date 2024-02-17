students = {'Cierra Vega': (6.2, 70), 'Alden Cantrell': (5.9, 65), 'Kierra Gentry': (6.0, 68), 'Pierre Cox': (5.8, 66)}
h = 6.0
w = 70
result = {k: s for k, s in students.items() if s[0] >= h and s[1] >= w}
print(result)