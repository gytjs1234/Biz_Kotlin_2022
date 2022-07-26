/*
public,private,protected 를 붙이지 않아도 기본값이 public 이다.
 */
class Korea {
    fun name():String ="대한"
}

fun main() {
    //Korea 클래스 타입의 name 객체를 선언하고
    //Korea()생성자를 호출하여 객체 생성하기
    val Korea :Korea = Korea()
    println(Korea.name())


    //생성자만 호출하여 객체 선언과 생성하기
    var Korea1 =Korea()
    println(Korea1.name())

}