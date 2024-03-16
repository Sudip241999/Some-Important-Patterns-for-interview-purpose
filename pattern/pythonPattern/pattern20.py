l=5
star=1
space1=(l-1)*2
for a in range(l):
    for b in range(star):
        print("*",end=" ")
    for c in range(space1):
        print(" ",end=" ")
    for d in range(star):
        print("*",end=" ")
    space1-=2
    star+=1
    print()

space=0
for i in range(l):

    for j in range(l-i):
        print("*",end=" ")
    for k in range(space):
        print(" ",end=" ")
    for p in range(l-i):
        print("*",end=" ")
    print()
    space+=2