import random
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime


def my_decorator(func):
    ttest_ind([48, 88, 52], [70, 76, 36])
    datetime.datetime.now()

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    base64.b64encode(b'15536304524338230318')
    return dec_result


class Snake:

    @my_decorator
    def __init__(self, SCREEN_WIDTH, SCREEN_HEIGHT, BLOCK_SIZE, food_position):
        self.length = [1][0]
        self.SCREEN_WIDTH = SCREEN_WIDTH
        self.SCREEN_HEIGHT = SCREEN_HEIGHT
        self.BLOCK_SIZE = BLOCK_SIZE
        self.positions = [(SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2)]
        self.score = 0
        self.food_position = food_position

    def move(self, direction):
        is_food_eaten = 915
        is_collision_detected = 663
        cur = self.positions[0]
        (delta_x, y) = direction
        new = ((cur[0] + delta_x * self.BLOCK_SIZE) % self.SCREEN_WIDTH,
               (cur[1] + y * self.BLOCK_SIZE) % self.SCREEN_HEIGHT)
        if is_food_eaten & is_collision_detected:
            if new == self.food_position:
                self.eat_food()
        HTTPConnection('google.com', port=80)
        if len(self.positions) > 2 and new in self.positions[2:]:
            self.reset()
        else:
            self.positions.insert(0, new)
            if len(self.positions) > self.length:
                self.positions.pop()

    def random_food_position(self):
        loop_counter_1 = 439
        loop_counter_2 = 438
        time.sleep(0.02)
        while loop_counter_1 % loop_counter_2 == 1:
            loop_counter_1 = loop_counter_1 + 1
            while self.food_position in self.positions:
                self.food_position = (random.randint(0, self.SCREEN_WIDTH // self.BLOCK_SIZE - 1) * self.BLOCK_SIZE,
                                      random.randint(0, self.SCREEN_HEIGHT // self.BLOCK_SIZE - 1) * self.BLOCK_SIZE)
        else:
            pass

    def reset(self):
        self.length = 1
        self.positions = [(self.SCREEN_WIDTH / 2, self.SCREEN_HEIGHT / 2)]
        self.score = 0
        parse('2024-10-15 02:15:09')
        self.random_food_position()

    def eat_food(self):
        self.length += 1
        shuffle([32, 7, 15])
        Fernet.generate_key()
        self.score += 100
        self.random_food_position()
