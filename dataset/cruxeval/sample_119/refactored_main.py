text = "vsnlygltaw"
result = ""
for i in range(len(text)):
    if i % 2 == 0:
        result += text[i].swapcase()
    else:
        result += text[i]
print(result)