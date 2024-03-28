def transform_string(s):
    return s.replace(",", " ")

if __name__ == "__main__":
    s = input()
    print(transform_string(s))