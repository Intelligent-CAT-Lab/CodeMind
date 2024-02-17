text = 'mathematics'
suffix = 'example'
if suffix and text.endswith(suffix):
    print(text[:- len(suffix)])
else:
    print(text)