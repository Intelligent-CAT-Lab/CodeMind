import math
class AreaCalculator: 
    def __init__(self, radius):
        """
        Initialize the radius for shapes.
        :param radius: float
        """
        self.radius = radius

    def calculate_circle_area(self):
        return math.pi * self.radius ** 2