class Car:
    def __init__(self):
        self.name = "name"
        self.color = "color"
        self.engine = "engine"
        self.wheels = "wheels"

    def __str__(self):
        return f"{self.name} is a {self.color}  {self.engine} car with {self.wheels} wheels"