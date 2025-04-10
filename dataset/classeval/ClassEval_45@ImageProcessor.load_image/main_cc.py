from PIL import Image, ImageEnhance, ImageChops
class ImageProcessor: 
    def __init__(self):
        """
        Initialize self.image
        """
        self.image = None

    def load_image(self, image_path):
        self.image = Image.open(image_path)