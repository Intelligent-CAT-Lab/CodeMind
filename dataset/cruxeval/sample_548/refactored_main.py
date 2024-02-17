text = 'spider'
suffix = 'ed'
if suffix and text and text.endswith(suffix):
    print(text.removesuffix(suffix))
else:
    print(text)