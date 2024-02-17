text = "25000   $"
for i in range(10, 0, -1):
    text = text.lstrip(str(i))
print(text)