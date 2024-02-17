str1 = "python 3.0"
result = tuple(x for x in str1 if not x.isspace()) 
print(result)