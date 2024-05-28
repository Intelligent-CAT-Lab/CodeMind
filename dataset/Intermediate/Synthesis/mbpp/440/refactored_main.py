text = "clearly!! we can see the sky"
for m in re.finditer(r"\w+ly", text):
    print((m.start(), m.end(), m.group(0)))