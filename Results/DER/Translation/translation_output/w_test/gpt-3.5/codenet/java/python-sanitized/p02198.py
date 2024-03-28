import sys

class p02198:
    
    def main(self):
        inputs = sys.stdin.readline().split()
        N = int(inputs[0])
        M = int(inputs[1])
        
        print(N * M)
        
        return False

    def __init__(self):
        self.log = open("/dev/null", "w")
        self.result = sys.stdout

if __name__ == "__main__":
    instance = p02198()
    instance.main()