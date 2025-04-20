function solution(n) {
    
    function calEven (n) {
        let total = 0;
        for (let i = 0; i <= n; i++) {
            if(i % 2 == 0) {
                total += i;
                console.log(total)
            }
        }
        return total;
    }
    let answer = 0;
    answer = calEven(n);
    return answer;
}