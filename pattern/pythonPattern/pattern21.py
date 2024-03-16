l=4
for i in range(l):
    if i==0 or i==l-1:
        for j in range(l):
            print("*",end=" ")
    else:
        print("*",end=" ")
        for i in range(l-2):
            print(" ",end=" ")
        print("*",end=" ")
    print()