import sys

def main():
    str = sys.stdin.readline().strip()
    #0ãåã¨ãã
    dir = 0

    #ä¸å¨ãããã®å¤å®ã«ã¹ã¿ãã¯ãä½¿ã
    #Rã§push, Lã§popã¨ãããã¨ã§
    #sizeã5ã«ãªã£ãã1å¨å®äºã0ãªãåè»¢å¤±æã¨å¤æ­
    stack = [0]
    result = 0

    for i in range(len(str)):

        command = str[i]

        #ã³ãã³ãã«å¿ãã¦æ¹åãè¨ç®ãã
        if command == 'R':
            dir += 1
        else:
            dir += 3
        dir %= 4

        #åãåãã¦ããã¨ã
        #ãããåè»¢ã®èµ·ç¹ãªã®ã§ã¹ã¿ãã¯çæ
        if dir == 0 and stack is None:
            stack = [0]
        elif stack is not None:
            #å·¦åè»¢
            if command == 'L':
                stack.pop()
                if len(stack) == 0:
                    stack = None
            #å³åè»¢
            else:
                stack.append(0)
                if len(stack) == 5