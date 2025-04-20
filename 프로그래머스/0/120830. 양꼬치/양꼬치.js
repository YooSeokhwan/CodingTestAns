function solution(n, k) {
    let total = 0;
    let service = 0;
    let answer = 0;    
    let serviceCount = 0;
    
    function calService (n, k) {
        if ( n >= 10 ) {
           let i = n % 10;
            serviceCount = (n - i) / 10
        }
    }
    
    service = calService(n,k);
    total = (12000 * n) + (2000 * k) - (serviceCount * 2000)
    answer = total;
    return answer;
}