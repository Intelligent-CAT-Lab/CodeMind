def count_down(D):
    if D == 25:
        return "Christmas"
    elif D == 24:
        return "Christmas Eve"
    elif D == 23:
        return "Christmas Eve Eve"
    elif D == 22:
        return "Christmas Eve Eve Eve"

D = int(input())
print(count_down(D))