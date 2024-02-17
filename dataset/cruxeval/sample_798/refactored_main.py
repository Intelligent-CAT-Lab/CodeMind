text = '@hihu@!'
pre = '@hihu'
if not text.startswith(pre):
    print(text)
else:
    print(text.removeprefix(pre))