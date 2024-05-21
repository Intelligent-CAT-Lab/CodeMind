import re

def main():
    str = input()
    ans = re.sub(r'apple', 'wwwp', str)
    ans = re.sub(r'peach', 'wwwa', ans)
    ans = re.sub(r'wwwp', 'peach', ans)
    ans = re.sub(r'wwwa', 'apple', ans)
    print(ans)

if __name__ == "__main__":
    main()