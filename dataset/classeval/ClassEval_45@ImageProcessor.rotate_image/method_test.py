def test(self):
        self.processor = ImageProcessor()
        self.image_path = os.path.join(os.path.dirname(__file__), "test.png")
        image = Image.new("RGB", (100, 100), (255, 255, 255))
        image.save(self.image_path)
        self.processor.load_image(self.image_path)
        original_image = self.processor.image
        self.processor.rotate_image(360)
        return (ImageChops.difference(original_image.rotate(360), self.processor.image).getbbox() is None)