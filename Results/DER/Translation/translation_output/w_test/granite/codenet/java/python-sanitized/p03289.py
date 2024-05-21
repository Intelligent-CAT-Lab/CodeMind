import re

def main():
    S = input()
    if not S.startswith('A'):
        print('WA')
        return
    if S.count('C')!= 1:
        print('WA')
        return
    if re.search(r'[A-Z]', S):
        print('WA')
        return
    print('AC')

if __name__ == '__main__':
    main()