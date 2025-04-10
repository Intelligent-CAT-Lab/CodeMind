import math
class AreaCalculator: 
    def __init__(self, radius):
        """
        Initialize the radius for shapes.
        :param radius: float
        """
        self.radius = radius

    def calculate_annulus_area(self, inner_radius, outer_radius):
        return math.pi * (outer_radius ** 2 - inner_radius ** 2)