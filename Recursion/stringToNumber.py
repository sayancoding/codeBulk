def stringToInt(str):
  if(len(str) == 1):
    return int(str)
  curr = int(str[0])
  return curr*pow(10,len(str)-1) + stringToInt(str[1:])

if __name__ == "__main__":
  print(stringToInt("1235"))
