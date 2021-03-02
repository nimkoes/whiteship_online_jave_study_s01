let gender = 'male';

function myPureFunction (param){
    return "성별 : " + param;
}

function myFunction (param) {
    let result = "성별 : ";
    if(param === 'male') {
        result += "남성";
    } else {
        result += "여성";
    }
    return result;
}

(function(){
    console.log(myPureFunction("남성"));
    console.log(myFunction(gender));
})();