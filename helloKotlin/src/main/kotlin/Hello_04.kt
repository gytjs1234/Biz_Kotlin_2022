//fun :Function 의 약자 함수를 선언하는 키워드
//java 에서는 method 를 Kotlin 에서는 함수로 지정한다
// 2개의 정수형 매개변수를 갖고
//결과를 정수로 return 하는 함수 선언
//JS의 typeScript 문법과 매우 유사
fun sum(num1 :Int,num2:Int) :Int{
    var sum =num1+num2
    return  sum

}

/*

 */
fun minus(num1:Int,num2:Int)=num1-num2;

/*
두개의 정수값을 매개변수로 받아서
큰수를 return 하는 코드
 */
fun max(num1:Int,num2:Int):Int{
    if(num1>num2)return num1
    else return num2
    
}
fun max2(num1:Int,num2:Int)=if(num1>num2)num1 else num2


/*
변수선언은 어디에서나 가능하다

실행하는 코드는 반드시 main()내에서 작성
 */
fun main() {

    //type을 강제 지정하기
    var num1:Int=0;

    //초기화되는 값에 따라 자동으로 type이 지정
    var num2=0


    //var 로 선언된 변수는 값을 언제든지 할당, 변경할수 있다



    var num3 =100
    //val로 선언된 변수는 최초에 한번 값이 할당되면
    //다시 값을 할당 변경 할수 없다.
    //java의 final , JS 의 const 와 같다. C/C++ 의 const
    //num3=100;
    
    num1++
    ++num1
    
    //기존의 num1 변수 값에 10을 더하여 증가하기
    num1 +=10

    num1=100;
   num2=200;

    var sum =sum(num1,num2)
    print("$num1+$num2=$sum")



}