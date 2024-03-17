import sys

def count_groups(commands):
    #0ãåã¨ãã
    dir = 0

    #ä¸å¨ãããã®å¤å®ã«ã¹ã¿ãã¯ãä½¿ã
    #Rã§push, Lã§popã¨ãããã¨ã§
    #sizeã5ã«ãªã£ãã1å¨å®äºã0ãªãåè»¢å¤±æã¨å¤æ­
    stack = [0]
    result = 0

    for command in commands:

        #ã³ãã³ãã«å¿ãã¦æ¹åãè¨ç®ãã
        if command == 'R':
            dir = (dir + 1) % 4
        else:
            dir = (dir + 3) % 4

        #åãåãã¦ããã¨ã
        #ãããåè»¢ã®èµ·ç¹ãªã®ã§ã¹ã¿ãã¯çæ
        if dir == 0 and not stack:
            stack = [0]
        elif stack:
            #å·¦åè»¢
            if command == 'L':
                stack.pop()
                if not stack:
                    stack = []
            #å³åè»¢
            else:
                stack.append(0)
                if len(stack) == 5:
                    result += 1
                    stack = [0]

    return result

if __name__ == "__main__":
    commands = sys.stdin.readline().strip()
    print(count_groups(commands))