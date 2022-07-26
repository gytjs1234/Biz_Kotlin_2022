fun main() {
        
        //num1변수를 정수형으로 선언하고 10 으로 초기화
        var num1=10;
        
        //num2 변수를 정수형으로 선언하고 20 으로 초기화
        var num2=20;
        var sum =num1+num2;
        
        //문자열 Template :문자열 내에 변수를 직접 사용하여 
        //결과를 출력하는 방법
        println("$num1 + $num2 = $sum")

        //이미 num1이 정수형으로 선언이 되었는데
        //문자열을 저장하려고 시도하니 type 오류가 발생
       // num1 ="String"

        //변수를 선언할때 초기화 없이 강제 형 지정하여 선언하기
        //코틀린에서는 이 방법을 별로 권장하지 않는다.

        var num3 : Int;
        num3 = 10;
        var nation :String;
        nation = "대한민국"

        //final ,const 상수형 변수 선언
        val Korea ="대한민국"


        //val 로 선언된 변수는 다시 값을 저장할수 없다.
        //Korea ="Korea"

        println("$Korea 은 Republic of Korea")

        for(i in 0..10){
                print("반복문으로 $i 만들기")

        }
        println()
        
        //0~10 까지 반복하는데 2씩 증가하기
        for(i in 0..10 step(2)){
                println("$i 값")
        }
        for(i in 10 downTo 0){
                println("$i 값")
        }
        
        //10부터 0 방향으로 작아지게 2씩
        for(i in 10 downTo  0 step(2)){
                println("$i 값")
        }
        var bYes =true
        if(bYes){
                println("$bYes 는 참")
        }else{
                println("$bYes 는 거짓")
        }
        
        //정수형 요소를 포함하는 배열 선언
        val array1 = intArrayOf(10,20,30,40,50,60,70)
        //배열 요소 0부터 전체 리스트하기
        for(ar in array1){
                println("$ar")
        }

        //배열요소 끝에서 부터 0 방향으로 리스트하기
        for(ar in array1.reversed()){
                println("$ar")

        }

        println()
        //0부터 배열의 개수 -1 :until
        for(i in 0 until array1.count()){
                println("${array1[i]}")
        }

        println()

        var num4 =1;
        while (num4 <10){
                print("${num4 ++},")
        }


}