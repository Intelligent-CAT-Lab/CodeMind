def dict_filter(dict,n):
 result = {key:value for (key, value) in dict.items() if value >=n}
 return result
dict_filter({'Cierra Vega': 175, 'Alden Cantrell': 180, 'Kierra Gentry': 165, 'Pierre Cox': 190},170)