text = 'happy'
prefix = 'ha'
prefix_length = len(prefix)
if text.startswith(prefix):
    print(text[(prefix_length - 1) // 2:
                (prefix_length + 1) // 2 * -1:-1])
else:
    print(text)