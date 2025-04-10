from PIL import Image, ImageEnhance, ImageChops
class ImageProcessor: 
    def __init__(self):
        """
        Initialize self.image
        """
        self.image = None

    def save_image(self, save_path):
        if self.image:
            self.image.save(save_path)