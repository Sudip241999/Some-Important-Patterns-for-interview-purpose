l=6
for i in range(l):
    for j in range(l-i):
        print(" ",end=" ")
    for k in range(2*i+1):
        print("* ",end="")
    print()

