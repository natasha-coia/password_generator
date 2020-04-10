import random

def generate_password(length,spec):
    password = ""
    chars = 3
    if spec == "Y":
        chars = 4
    for i in range(length):
        password += str(generate_char(chars))
    return password

def generate_char(chars):
    ABC = ["A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"]
    abc = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
    num = ["0","1","2","3","4","5","6","7","8","9"]
    spec_char = ["!","£","$","%","&","*","#","?"]
    lists = [ABC,abc,num,spec_char]
    list = lists[random.randint(0,chars)]
    length = len(list)
    index = random.randint(0,length)
    return list[index]

spec = input("Special characters allowed? Y/N : ")
length = int(input("Length of password: "))
print(generate_password(length,spec))