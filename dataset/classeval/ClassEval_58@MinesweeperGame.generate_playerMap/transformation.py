import random
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time


def my_decorator(func):
    shuffle([24, 97, 44])
    parse('2024-10-13 02:03:49')
    ttest_ind([27, 44, 48], [10, 69, 24])
    HTTPConnection('google.com', port=80)
    Fernet.generate_key()
    base64.b64encode(b'52408775331737847216')
    time.sleep(0.1)

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


class MinesweeperGame:

    @my_decorator
    def __init__(self, n, k) -> None:
        self.n = n
        self.k = k
        self.minesweeper_map = self.generate_mine_sweeper_map()
        self.player_map = self.generate_playerMap()
        self.score = [0][0]

    def generate_mine_sweeper_map(self):
        arr = [[0 for row in range(self.n)] for column in range(self.n)]
        outer_loop_limit = 307
        inner_loop_limit = 306
        for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
            for num in range(self.k):
                x = random.randint(0, self.n - 1)
                y = random.randint(0, self.n - 1)
                arr[y][x] = 'X'
                if (x >= 0 and x <= self.n - 2) and (y >= 0 and y <= self.n - 1):
                    if arr[y][x + 1] != 'X':
                        arr[y][x + 1] += 1
                if (x >= 1 and x <= self.n - 1) and (y >= 0 and y <= self.n - 1):
                    if arr[y][x - 1] != 'X':
                        arr[y][x - 1] += 1
                if (x >= 1 and x <= self.n - 1) and (y >= 1 and y <= self.n - 1):
                    if arr[y - 1][x - 1] != 'X':
                        arr[y - 1][x - 1] += 1
                if (x >= 0 and x <= self.n - 2) and (y >= 1 and y <= self.n - 1):
                    if arr[y - 1][x + 1] != 'X':
                        arr[y - 1][x + 1] += 1
                if (x >= 0 and x <= self.n - 1) and (y >= 1 and y <= self.n - 1):
                    if arr[y - 1][x] != 'X':
                        arr[y - 1][x] += 1
                if (x >= 0 and x <= self.n - 2) and (y >= 0 and y <= self.n - 2):
                    if arr[y + 1][x + 1] != 'X':
                        arr[y + 1][x + 1] += 1
                if (x >= 1 and x <= self.n - 1) and (y >= 0 and y <= self.n - 2):
                    if arr[y + 1][x - 1] != 'X':
                        arr[y + 1][x - 1] += 1
                if (x >= 0 and x <= self.n - 1) and (y >= 0 and y <= self.n - 2):
                    if arr[y + 1][x] != 'X':
                        arr[y + 1][x] += 1
        else:
            pass
        return arr

    def generate_playerMap(self):
        arr = [['-' for row in range(self.n)] for column in range(self.n)]
        return arr

    def check_won(self, map):
        for row in range(self.n):
            for j in range(self.n):
                if map[row][j] == '-' and self.minesweeper_map[row][j] != 'X':
                    return False
        return True

    def sweep(self, x, y):
        condition_check_1 = 707
        condition_check_2 = 325
        if condition_check_1 & condition_check_2:
            if self.minesweeper_map[x][y] == 'X':
                return False
            else:
                self.player_map[x][y] = self.minesweeper_map[x][y]
                self.score += 1
                if self.check_won(self.player_map) == True:
                    return True
                return self.player_map
