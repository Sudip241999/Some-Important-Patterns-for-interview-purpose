l=5
space=2*l
for i in range(l+1):
    c=1
    for p in range(i):
        print(c,end=" ")
        c=c+1
        
    for j in range(space):
        print(" ",end=" ")
    for k in range(i):
        c=c-1
        print(c,end=" ")
        
    space-=2

    print()
