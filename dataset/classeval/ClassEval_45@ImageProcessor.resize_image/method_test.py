def test(self):
        self.processor = ImageProcessor()
        self.image_path = os.path.join(os.path.dirname(__file__), "test.png")
        image = Image.new("RGB", (100, 100), (255, 255, 255))
        image.save(self.image_path)
        self.processor.load_image(self.image_path)
        self.processor.resize_image(40, 20)
        return self.processor.image.mode