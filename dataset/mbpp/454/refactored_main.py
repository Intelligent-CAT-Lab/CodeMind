text = "pythonz."
patterns = '\w*z.\w*'
if re.search(patterns, text):
    result = True
else:
    result = False
print(result)