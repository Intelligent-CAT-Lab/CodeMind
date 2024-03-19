# Python code

def count_diff(s, correct):
    num = 0
    for i in range(16):
        if s[i] != correct[i]:
            num += 1
    return num

s = input()
correct = "CODEFESTIVAL2016"
print(count_diff(s, correct))



We then take an input string `s`, and the correct string `correct`, and print the result of `count_diff`.