def codeforces_59_A(word):
    uppercase = 0
    lowercase = 0

    for ch in word:
        if ch.isupper():
            uppercase += 1
        else:
            lowercase += 1

    if uppercase > lowercase:
        return word.upper()
    elif lowercase > uppercase:
        return word.lower()
    else:
        return word.lower()

# Test input
word = "CDOZDPBVVVHNBJVBYHEOXWFLJKRWJCAJMIFCOZWWYFKVWOGTVJcuusigdqfkumewjtdyitveeiaybwrhomrwmpdipjwiuxfnwuz"

# Test output
print(codeforces_59_A(word))