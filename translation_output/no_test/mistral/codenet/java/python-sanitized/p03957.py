import sys

def task_a():
    s = sys.stdin.readline()
    c_index = s.find('C')
    f_index = s.rfind('F')
    if c_index < 0 or f_index < 0 or f_index < c_index:
        print("No")
    else:
        print("Yes")

def task_b():
    s = sys.stdin.readline()
    c_index = s.find('C')
    f_index = s.rfind('F')
    if c_index < 0 or f_index < 0 or f_index < c_index:
        print("No")
    else:
        print("Yes")

def main():
    task_a()
    task_b()

if __name__ == "__main__":
    main()