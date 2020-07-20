def expo(number,pow):
  if(pow == 0):
    return 1
  return number*expo(number,pow - 1)

if __name__ == "__main__":
    print(expo(5,2))