a = {15: "Qltuf", 12: "Rwrepny"}
s = dict(list(a.items())
[::-1])
print(" ".join([str(i) for i in s.items()]))