contacts = {}

while True:
    print("\nContect Book App")
    print("1.  creat Contect ")
    print("2.  view Contect ")
    print("3.  update Contect ")
    print("4.  Delete Contect ")
    print("5.  search Contect ")
    print("7.  Exit")
    choice = input("enter your choice = ")
    if choice == "1":
        name  = input(" Enter your name")
        if name in contacts :
             print(f"contacts name {name} already exists")
        else:
            age = input("enter age = ")
            email = input('enter email =')
            mobile = input('enter mobile number =')
            contacts[name] = {"age":int(age),"email":email,"mobile":mobile}
            print(f"contacts name has been create sucessfully")
    elif choice == '2':
        name = input('enter contect name to view = ')
        if name in contacts:
            contacts = contacts[name]
            print(f'name: {name},Age:{age},mobile number :{mobile}')
        else:
            print("contacts not found !")
    elif choice == '3':
        name = input('enter contect name to update = ')
        if name in contacts:
            age = input("enter update age = ")
            email = input('enter update email =')
            mobile = input('enter update mobile number =')
            contacts[name] = {"age":int(age),"email":email,"mobile":mobile}
        else:
            print("contacts not found !")        
    elif choice == '4':
        name = input('enter concact name to deletion')
        if name in contacts:
            del contacts[name] 
            print(f"Contact name {name} has been delete sucecessfully")
        else:
            print("contacts not found")
            
    elif choice == "5":
           search_name = input("enter contect name to search") 
           found = False                  
           for name , contacts in contacts.items(): 
               if search_name.lower() in  name.lower():
                   print(f'Found - name: {name},Age:{age},mobile number :{mobile}')
                   found = True
           if not found:
                print('no contact found with that name')                  
                 
    elif choice == "6":
        print(f"total contact in  contacts : {len(contacts)}")
        
    elif choice == '7':
        print("good bye...Closing the program")
        break
    else:
        print("Invalid input")
