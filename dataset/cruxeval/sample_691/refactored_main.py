text = 'rpyttc'
suffix = 'cyt'
while suffix and suffix[-1] in text:
    text = text.rstrip(suffix[-1])
    suffix = suffix[:-1]
print(text)