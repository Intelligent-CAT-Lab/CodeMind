def test(self):

        snake = Snake(100, 100, 1, (0, 0))
        snake.random_food_position()
        return snake.food_position,snake.food_position,snake.positions,snake.food_position[0],snake.food_position[1],snake.food_position[0],snake.food_position[1]