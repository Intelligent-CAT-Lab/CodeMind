class P02730:

    def __init__(self):
        self.s = input()  # to read the input string

    def run(self):
        arr = list(self.s)  # converts string to a list of characters

        for i in range(len(self.s) // 2):
            if arr[i] != arr[len(self.s) - 1 - i]:
                print("No")
                return

        for i in range((len(self.s) // 2) - 1):
            if arr[i] != arr[(len(self.s) // 2) - 1 - i]:
                print("No")
                return

        print("Yes")


if __name__ == '__main__':
    p02730 = P02730()
    p02730.run()