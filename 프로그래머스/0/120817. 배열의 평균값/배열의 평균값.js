function solution(numbers) {
    let answer = 0;
    let totalSum = 0;
    for (let i = 0; i <numbers.length; i++) {
        totalSum += numbers[i];
        answer = totalSum / numbers.length;
    }
    return answer;
}