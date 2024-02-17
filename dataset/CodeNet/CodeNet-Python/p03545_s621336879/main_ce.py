from itertools import product
S = "1222"
for string in product(["+","-"],repeat = 3):
    string = list(string)
    string.append("")
    sum_ = [a + b for a,b in zip(S,string)]
    if eval("".join(sum_)) == 7:
        print("".join(sum_)+"=7")
        break