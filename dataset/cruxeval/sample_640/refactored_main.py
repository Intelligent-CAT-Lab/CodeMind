text = "3eeeeeeoopppppppw14film3oee3"
a = 0
if text[0] in text[1:]:
    a += 1
for i in range(0, len(text)-1):
    if text[i] in text[i+1:]:
        a += 1
print(a)