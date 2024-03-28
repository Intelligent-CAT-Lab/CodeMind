import sys
import threading

def main():
    # read integers n and k from input
    n, k = map(int, input().split())

    # output result based on comparison
    if n <= k:
        print(1)
    else:
        print(0)

# Using threading to increase the stack size if needed
if __name__ == "__main__":
    threading.stack_size(16 * 1024 * 1024)  # 16MB stack
    thread = threading.Thread(target=main)
    thread.start()
    thread.join()