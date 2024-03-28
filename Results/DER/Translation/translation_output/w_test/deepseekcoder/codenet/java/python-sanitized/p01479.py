def find_word(s):
    s = s.replace("egg", "e").replace("chicken", "c")
    s = s.replace("ee", "e e").replace("ee", "e e")
    s = s.replace("cc", "c c").replace("cc", "c c")
    words = s.split(" ")
    max_len = 0
    ans = ""
    for word in words:
        if max_len < len(word):
            max_len = len(word)
            ans = word[-1]
    return ans

print(find_word("eggchickenegg"))