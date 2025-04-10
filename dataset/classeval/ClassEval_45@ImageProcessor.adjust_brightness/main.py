import unittest
from PIL import Image, ImageEnhance, ImageChops


class ImageProcessor:
    def __init__(self):
        self.image = None

    def load_image(self, image_path):
        self.image = Image.open(image_path)

    def save_image(self, save_path):
        if self.image:
            self.image.save(save_path)

    def resize_image(self, width, height):
        if self.image:
            self.image = self.image.resize((width, height))

    def rotate_image(self, degrees):
        if self.image:
            self.image = self.image.rotate(degrees)

    def adjust_brightness(self, factor):
        if self.image:
            enhancer = ImageEnhance.Brightness(self.image)
            self.image = enhancer.enhance(factor)
class Test(unittest.TestCase):
    def test(self):
            self.processor = ImageProcessor()
            self.image_path = os.path.join(os.path.dirname(__file__), "test.png")
            image = Image.new("RGB", (100, 100), (255, 255, 255))
            image.save(self.image_path)
            self.processor.load_image(self.image_path)
            enhancer = ImageEnhance.Brightness(Image.open(self.image_path))
            expected_image = enhancer.enhance(0.5)
            self.processor.adjust_brightness(0.5)
            return (ImageChops.difference(expected_image, self.processor.image).getbbox() is None)