r = int(input("enter the radius "))
if (r < 0):
        print(f"{r} is not supported pls enter positive value\n")
else:
        print(3.14*pow(r,2))