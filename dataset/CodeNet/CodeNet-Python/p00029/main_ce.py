a = list("Thank you for your mail and your lectures".split())
print(max(a, key=a.count), max(a, key=len))
