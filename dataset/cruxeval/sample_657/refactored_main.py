text = "djhasghasgdha"
for punct in '!.?,:;':
    if text.count(punct) > 1:
        print('no')
        break
    if text.endswith(punct):
        print('no')
        break
else:
    print(text.title())