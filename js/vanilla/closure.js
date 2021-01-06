

const foo = () => {
  let arr = [];
  const add = (num) => {
    arr.push(num)
  }
  return {
    add,
    arr
  }
}
