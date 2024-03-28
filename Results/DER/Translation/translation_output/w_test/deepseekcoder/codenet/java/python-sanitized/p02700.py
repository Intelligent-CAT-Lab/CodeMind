def main():
    insn = GetInput.getArrayInt()
    a = insn[0]
    b = insn[1]
    c = insn[2]
    d = insn[3]

    while a >= 0 and c >= 0:
        c = c - b
        if c <= 0:
            print("Yes")
            return
        a = a - d
        if a <= 0:
            print("No")
            return


class GetInput:
    import sys
    import io

    @staticmethod
    def getCharArray():
        try:
            string = GetInput.getInputString()
            charArray = [char for char in string]
            return charArray
        except Exception as e:
            e.printStackTrace()
        charArray = []
        return charArray

    @staticmethod
    def getArrayInt():
        try:
            string = GetInput._input().split()
            array = [int(num) for num in string]
            return array
        except Exception as e:
            e.printStackTrace()
        array = []
        return array

    @staticmethod
    def getInt():
        try:
            num = int(GetInput._input())
            return num
        except Exception as e:
            e.printStackTrace()
        return 0

    @staticmethod
    def getInputString():
        try:
            string = GetInput._input()
            return string
        except Exception as e:
            e.printStackTrace()
        return ""

    @staticmethod
    def getLongInput():
        try:
            num = long(GetInput._input())
            return num
        except Exception as e:
            e.printStackTrace()
        return 0

    @staticmethod
    def getLongArrayInput():
        try:
            string = GetInput._input().split()
            array = [long(num) for num in string]
            return array
        except Exception as e:
            e.printStackTrace()
        array = []
        return array

    @staticmethod
    def _input():
        return sys.stdin.readline().rstrip('\n')


if __name__ == "__main__":
    main()