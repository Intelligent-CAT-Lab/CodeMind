import sys

def solve(board, nums, used, count, idx, cnt):
    if idx == len(nums):
        return cnt

    for i in range(len(nums)):
        for j in range(len(nums[0])):
            if board[i][j] == '-':
                for k in range(1, 10):
                    if not used[k]:
                        nums[i][j] = k
                        used[k] = True
                        cnt += solve(board, nums, used, count, idx+1, cnt)
                        nums[i][j] = '-'
                        used[k] = False

    return cnt

def main():
    board = [['0', '2', '-', '-', '-', '9', '2', '3', '4'],
              ['1', '1', '2', '-', '-', '-', '6', '7', '8'],
              ['-', '-', '-', '1', '1', '-', '5', '4', '3'],
              ['2', '0', '-', '-', '-', '-', '1', '9', '5'],
              ['3', '0', '-', '-', '-', '-', '6', '7', '8'],
              ['4', '0', '-', '-', '-', '-', '8', '9', '1'],
              ['5', '2', '-', '-', '-', '-', '6', '8', '7'],
              ['6', '1', '-', '-', '-', '-', '2', '3', '4'],
              ['7', '0', '-', '-', '-', '-', '1', '9', '5']]

    nums = [[-1 for x in range(3)] for y in range(4)]
    used = [False for x in range(10)]
    count = 0

    for i in range(len(board)):
        for j in range(len(board[0])):
            if board[i][j] == ' ':
                nums[i][j] = -1
            elif board[i][j] == '-':
                count += 1
            else:
                nums[i][j] = int(board[i][j])
                used[nums[i][j]] = True

    result = solve(board, nums, used, count, 0, 0)
    print(result)

if __name__ == '__main__':
    main()