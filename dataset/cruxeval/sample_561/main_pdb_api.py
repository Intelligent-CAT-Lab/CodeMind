def f(text, digit):
    #different than previous? Just count instances digit
    count = text.count(digit)
    return int(digit) * count
f('7Ljnw4Lj', '7')