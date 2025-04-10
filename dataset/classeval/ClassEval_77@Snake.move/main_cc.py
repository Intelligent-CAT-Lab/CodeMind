import random
class Snake: 
    def __init__(self, SCREEN_WIDTH, SCREEN_HEIGHT, BLOCK_SIZE, food_position):
        """
        Initialize the length of the snake, screen width, screen height, block size, snake head position, score, and food position.
        :param SCREEN_WIDTH: int
        :param SCREEN_HEIGHT: int
        :param BLOCK_SIZE: int, Size of moving units
        :param food_position: tuple, representing the position(x, y) of food.
        """
        self.length = 1
        self.SCREEN_WIDTH = SCREEN_WIDTH
        self.SCREEN_HEIGHT = SCREEN_HEIGHT
        self.BLOCK_SIZE = BLOCK_SIZE
        self.positions = [((SCREEN_WIDTH / 2), (SCREEN_HEIGHT / 2))]
        self.score = 0
        self.food_position = food_position


    def move(self, direction):
        cur = self.positions[0]
        x, y = direction

        new = (
            ((cur[0] + (x * self.BLOCK_SIZE)) % self.SCREEN_WIDTH),
            (cur[1] + (y * self.BLOCK_SIZE)) % self.SCREEN_HEIGHT,
        )

        if new == self.food_position:
            self.eat_food()

        if len(self.positions) > 2 and new in self.positions[2:]:
            self.reset()
        else:
            self.positions.insert(0, new)
            if len(self.positions) > self.length:
                self.positions.pop()
    def reset(self):
        self.length = 1
        self.positions = [((self.SCREEN_WIDTH / 2), (self.SCREEN_HEIGHT / 2))]
        self.score = 0
        self.random_food_position()
    def eat_food(self):
        self.length += 1
        self.score += 100
        self.random_food_position()