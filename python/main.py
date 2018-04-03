
'''
    Logic gate simulation in Python
    
    Author: Harshit Joshi
'''

def andgate(a, b):
    if (a == 1 or a == 0) and (b==1 or b==0):
        if a == 1 and b == 1:
            return 1
        else:
            return 0
    else:
        print("IllegalCharacter")


def orgate(a, b):
    if (a == 1 or a == 0) and (b == 1 or b == 0):
        if a == 1 or b == 1:
            return 1
        else:
            return 0
    else:
        print("IllegalCharacter")


def notgate(a):
    if (a == 1 or a == 0):
        if a == 1:
            return 0
        else:
            return 1
    else:
        print("IllegalCharacter")


def nandgate(a, b):
    if (a == 1 or a == 0) and (b == 1 or b == 0):
        if a == 1 and b == 1:
            return 0
        else:
            return 1
    else:
        print("IllegalCharacter")


def norgate(a, b):
    if (a == 1 or a == 0) and (b == 1 or b == 0):
        if a == 1 or b == 1:
            return 0
        else:
            return 1
    else:
        print("IllegalCharater")


if __name__ == '__main__':
    print("1. AND gate\n2. OR gate\n3. NOT gate\n4. NAND gate\n5. NOR gate\n6. ALl Above Operations\n7. Exit\n")
    rerun = True
    while rerun:
        print("Enter your choice: ")
        n = int(input())
        if n == 1:
            print("\nEnter a and b for AND operation")
            a = int(input())
            b = int(input())
            print("AND gate: " + str(andgate(a, b)) + "\n")
            # rerun = False
        elif n == 2:
            print("\nEnter a and b for OR operation")
            a = int(input())
            b = int(input())
            print("OR gate: " + str(orgate(a, b)) + "\n")
            # rerun = False
        elif n == 3:
            print("\nEnter a for NOT operation")
            a = int(input())
            print("NOT gate: " + str(notgate(a)) + "\n")
            # rerun = False
        elif n == 4:
            print("\nEnter a and b for NAND operation")
            a = int(input())
            b = int(input())
            print("NAND gate: " + str(nandgate(a, b)) + "\n")
            # rerun = False
        elif n == 5:
            print("\nEnter a and b for NOR operation")
            a = int(input())
            b = int(input())
            print("NOR gate: " + str(norgate(a, b)) + "\n")
            # rerun = False
        elif n == 6:
            print("\nEnter a and b for All the operations")
            a = int(input())
            b = int(input())
            print("AND gate: "+str(andgate(a, b))+"\n")
            print("OR gate: " + str(orgate(a, b)) + "\n")
            print("NOT gate for a: " + str(notgate(a)) + "\n")
            print("NOT gate for b: " + str(notgate(b)) + "\n")
            print("NAND gate: " + str(nandgate(a, b)) + "\n")
            print("NOR gate: " + str(norgate(a, b)) + "\n")
        elif n == 7:
            rerun = False
            exit(0)
        else:
            print("IllegalChoice")
            rerun = True
