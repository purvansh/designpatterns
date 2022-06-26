from Car import Car
class CarBuilder:
    def __init__(self):
        self.car = Car()

    def build_name(self,name):
        self.car.name = name

    def build_engine(self,engine):
        self.car.engine = engine

    def build_wheels(self,wheels):
        self.car.wheels = wheels

    def build_color(self,color):
        self.car.color = color

    def get_car(self):
        return self.car