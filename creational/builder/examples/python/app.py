from CarBuilder import CarBuilder

if __name__ =="__main__":
    CarBuilder = CarBuilder()
    CarBuilder.build_name("Tesla")
    CarBuilder.build_engine("electric")
    CarBuilder.build_wheels("steel")
    CarBuilder.build_color("red")
    car = CarBuilder.get_car()
    print(car)