class animal:
    def show(self):
        print("show animal sound")
class cat(animal):
    def MakeSound(self):
        print ("meow")
c = cat()
c.show()
c.MakeSound()
class Dadaji:
    def show(self):
        print("show from dadaji =")
class Papaji(Dadaji):
    def output(self):
        print("Output from Papaji")
class Betaji(Papaji):
    def output(self):
        print("output from betaji")
b = Betaji()
b.output()
b.show()