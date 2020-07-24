def lenStr(str):
  if(len(str)) == 0:
    return 0;
  return 1 + lenStr(str[1:])

if __name__ == "__main__":
    print(lenStr("sayan"))

