function solution(n) {
    let answer = 0;
    let pizza = 0;
    
    function getPizzaQuantity (n , pizza) {
        for (let i = 0; i < n; i++) {
            pizza = Math.ceil(n / 7);
        }
        
        console.log(pizza)
        return pizza;
    }
    answer = getPizzaQuantity(n, pizza);
    return answer;
}