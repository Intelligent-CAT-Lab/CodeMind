import os
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
            original_image = self.processor.image
            self.processor.rotate_image(360)
            return (ImageChops.difference(original_image.rotate(360), self.processor.image).getbbox() is None)
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_45@ImageProcessor.rotate_image/output.txt', 'w') as wr:
    wr.write(str(a))
        