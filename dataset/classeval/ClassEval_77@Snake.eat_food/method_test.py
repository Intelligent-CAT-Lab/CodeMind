def test(self):

        snake = Snake(100, 100, 1, (51, 51))
        snake.eat_food()
        snake.eat_food()
        snake.eat_food()
        snake.eat_food()
        return snake.length,snake.score,snake.length,snake.score