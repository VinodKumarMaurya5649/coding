def get_Valid_input(prompt,validation):
    while True:
        user_input =input(prompt)
        if validation(user_input):
            return user_input
        else:
            print('enter valid input')
def validation(s):
    return s.isalpha()
get_Valid_input(input("enter the name"),validation)