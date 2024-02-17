s = "the cost of one peach is higher than that of one apple."
s = s.replace("apple", "X")
s = s.replace("peach", "apple")
s = s.replace("X", "peach")
print(s)
