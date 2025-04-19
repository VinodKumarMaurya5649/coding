def addItem(name, quantity, price):
    if name in inventory:
        print("Item already exists")
    elif 1 <= quantity <= 1000 and 0.01 <= price <= 10000:
        inventory[name] = {"quantity": quantity, "price": price}
        print("Item added successfully")
    else:
        print("Invalid quantity or price")

def updateItem(name, quantity):
    if name in inventory:
        if 1 <= quantity <= 1000:
            inventory[name]["quantity"] += quantity 
            print("Quantity updated")
        else:
            print("Invalid quantity")
    else:
        print("Item not found")

def deleteItem(name):
    if name in inventory:
        del inventory[name]
        print("Item deleted")
    else:
        print("Item not found")

def total():
    total = sum(item["quantity"] * item["price"] for item in inventory.values())
    print(f"{total:.2f}")
    
inventory={}   
n = int(input("Enter the number of operations: "))
print("Enter operation, name, quantity, price")
for i in range(n):
    operation = input().split()
    print(operation)
    command = operation[0] 
    if command == "ADD":
        name, quantity, price = operation[1], int(operation[2]), float(operation[3])
        addItem(name, quantity, price)
    elif command == "UPDATE":
        name, quantity = operation[1], int(operation[2])
        updateItem(name, quantity)
    elif command == "DELETE":
        name = operation[1]
        deleteItem(name)
    elif command == "TOTAL":
        total()
    else:
        print("Invalid operation")