class Items:
    '''
    @parms Items(name,quantity,price)
    adding name,quantity and price
    '''
    def __init__(self,name,quantity,price):
        self.name = name
        self.quantity = quantity
        self.price = price
    def veiw_item():
        return "item"+ self.name

# item1 = Items("pencil",1000,5)
# item1 = Items("paper",10000,0.35)
# def fib(n):
#     ans = [0,1]
#     for i in range(2,n+1):
#         ans.append(ans[i-1]+ans[i-2])


class Inventory:
    def __init__(self):
         self.items = []
def add_items(self,name,quantity,price):
    self.items.append(Items(name,quantity,price))
inventory1 = Inventory()
Inventory1.add_items('pencil',10.5)
print(len(inventory1.items))
        