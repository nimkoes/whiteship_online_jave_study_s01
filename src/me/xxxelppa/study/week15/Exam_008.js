function myFunc() {
    console.log("문자열을 출력 합니다.");
}

(function myMainFunc(param) {
    // 매개변수로 사용 가능
    console.log("매개변수로 전달 된 함수 실행");
    param();
    console.log("");


    // 변수에 할당 가능
    let myVal = param;
    console.log("변수에 담긴 함수 실행");
    myVal();
    console.log("");

    let returnVal = (function () { return param; })();
    console.log("반환 결과 변수에 담긴 함수 실행");
    returnVal();
    console.log("");

})(myFunc);