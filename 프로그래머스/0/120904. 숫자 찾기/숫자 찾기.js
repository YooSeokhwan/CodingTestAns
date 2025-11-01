function solution(num, k) {
    console.log(num)
    let string = String(num)
    let arr = string.split('')
    let target = -1;
    
    for (let i = 1; i <=arr.length; i++) {
        if(arr[i-1] == k) {
            target = i
        }
        
        console.log("target", target)
        console.log("i", i)
        if(target !== -1) {
            return target;
        }
        
    }
    console.log(target)
    let answer = target;
    return answer;
}