function solution(array, n) {
    let count = 0;
    for (let i = 0; i < array.length; i++) {
        if (array[i] == n) {
            count++;
        }
    }
    let answer = 0;
    answer = count;
    return answer;
}