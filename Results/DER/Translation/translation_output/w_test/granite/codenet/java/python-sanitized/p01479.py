def find_longest_word(s):
    s = s.replace("egg", "e").replace("chicken", "c")
    s = s.replace("ee", "e e").replace("ee", "e e")
    s = s.replace("cc", "c c").replace("cc", "c c")
    words = s.split(" ")
    max_length = 0
    longest_word = ""
    for word in words:
        if len(word) > max_length:
            max_length = len(word)
            longest_word = word[-1]
    if longest_word == "e":
        return "egg"
    else:
        return "chicken"

test_input = "eggchickenegg"
print(find_longest_word(test_input))