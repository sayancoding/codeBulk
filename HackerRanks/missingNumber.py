# def missingNUmber(arr,brr):
#   p = 0 
#   q = 0
#   result = []
#   while(p < len(arr) and q < len(brr)):
#     if(arr[p] == brr[q]):
#       q += 1
#       p += 1
#     elif(arr[p] != brr[q]):
#       if(brr[q] not in result):
#         result.append(brr[q])
#       q += 1
#   if(q < len(brr)):
#     if(brr[q] not in result):
#       result.append(brr[q])
#   result.sort()
#   print(result)

# def missingNumber(arr,brr):
#   hashSet = {}
#   for el in brr:
#     hashSet.setdefault(el : 1)



if __name__ == "__main__":
    arr = [11,4,11,7,13,4,12,11,10,14]
    brr = [11,4,11,7,3,7,10,13,4,8,12,11,10,14,12]
    missingNumber(arr,brr)