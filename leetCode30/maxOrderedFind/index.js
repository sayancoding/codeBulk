const givenNum = 291758;
const range = 4;
const arrOfNum = Array.from(String(givenNum))
const sortedArray = [...arrOfNum]
sortedArray.sort();
const maxDigit = sortedArray.slice(sortedArray.length-range,sortedArray.length)
result = 0;

for(el of arrOfNum)
{
  if(maxDigit.includes(el))
  {
    result = result*10 + Number(el);
  }
}
console.log(result)

