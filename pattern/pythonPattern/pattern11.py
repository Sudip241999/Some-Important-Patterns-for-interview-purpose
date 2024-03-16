i=1
while i<5:
    j=1
    while j<=i:
        if (i+j)%2==0:
            print("1",end=" ")
        else:
            print("0",end=" ")
        j+=1
    i+=1
    print()