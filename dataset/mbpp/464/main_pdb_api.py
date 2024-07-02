def check_value(dict, n):
    result = all(x == n for x in dict.values()) 
    return result
check_value({'Cierra Vega': 12, 'Alden Cantrell': 12, 'Kierra Gentry': 12, 'Pierre Cox': 12},10)