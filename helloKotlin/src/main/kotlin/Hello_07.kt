
fun main() {

    //정수형 배열 100개를 선언하고 1부터 1씩 증가하면서 배열 요소 채우기
    val list = IntArray(100,{i->i+5})
    
    //each 반복문
    //list 의 전체 요소를 반복하면서 각 요소를 it 변수에 담아 내부로 전달
    //it 변수 값을 console에 출력
    list.map{it->println(it)}

    //List 의 요소개수만큼 반복하면서
    // 각 요소가 %2연산 결과가  0인 요소들만 간추려서
    //list 로 다시만든다음 map에게 전달
    //map 은 요소들을 console에 출력
    list.filter { item->item%2==0 }
        .map{it->println(it)}

    //lambda(람다), 간소화된 코드

    val map =mapOf("김" to "김모찌 " , "임" to "임모카","이" to "이몽룡" )
            println(map["임"])
        println(map["이"])

    println()
    //map 에 담긴 전체 데이터를 key,value 로 분해하여 출력하기
        for((key,value)in map){
            println("$key=$value")
        }
}