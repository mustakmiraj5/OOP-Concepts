class Car:
    def __init__(self, make, model, year):
        self.make = make
        self.model = model
        self.year = year

    def display(self):
        print(f"Make: {self.make}, Model: {self.model}, Year: {self.year}")
    def start(self):
        print(f"{self.model} has started")
    def stop(self):
        print(f"{self.model} has stopped")

# creating instance
car1 = Car("Toyota", "Corolla", 2015)
car2 = Car("Honda", "Civic", 2016)
car3 = Car("BMW", "X5", 2017)

car1.display()
car1.start()
car1.stop()

