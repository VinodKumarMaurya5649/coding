def min_block(G):
    capicity =6
    return (G+ capicity -1)//capicity

#input
G=0
while True:
    try:
        G = int(input("enter the no of people"))
        # constraints 1<=G<=500
        if(1<=G<=500):
            break
    except ValueError:
        print("enter valid input")
#output
print(min_block(G))