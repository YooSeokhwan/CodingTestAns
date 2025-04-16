function solution(angle) {
    var answer = 0;
    
    if (angle < 90) {
        return answer = 1;
    } else if (angle === 90) {
        return answer = 2;
    } else if (90 < angle && angle < 180) {
        return answer = 3;        
    } else if (180 <= angle) {
        return answer = 4;
    } else {
        return false;
    }
    return answer;
}