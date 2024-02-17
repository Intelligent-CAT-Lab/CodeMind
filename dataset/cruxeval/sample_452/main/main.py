def f(text):
    counter = 0
    for char in text:
        if char.isalpha():
            counter += 1
    return counter