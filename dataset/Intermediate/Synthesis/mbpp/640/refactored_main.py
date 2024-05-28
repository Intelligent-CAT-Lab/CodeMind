items = ["python (chrome)"]
for item in items:
    print(re.sub(r" ?\([^)]+\)", "", item))