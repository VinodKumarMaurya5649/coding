def minJugRequire(W):
    # jagcapicity 1000ml1
    jagCapicity = 1000
    return (W+jagCapicity -1)//jagCapicity
#input
W =0
while True:
    try:
        W = int(input("enter the requed water"))
        # constraints 1<=W<=10000
        if(1<=W<=10000):
            break
    except ValueError:
        print("enter valid input")
#output
print(minJugRequire(W))