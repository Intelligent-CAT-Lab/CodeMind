def dict_filter(dict,n):
 result = {key:value for (key, value) in dict.items() if value >=n}
 return result