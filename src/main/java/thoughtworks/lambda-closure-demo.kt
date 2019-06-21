package thoughtworks

val square = { number: Int -> number * number }
val nine = square(3)  //returns an Integer

val that = { three: Int -> three }

val more: (String, Int) -> String = { str, int -> str + int }

val noReturn: (Int) -> Unit = { num -> println(num) }

fun x(): Int {
    var a = 1
    return 100
}

fun myFunction(): () -> Unit {
    var a = 1
    var lambda = { println(a); a += 1 }
    lambda()
    return lambda
}

fun main() {
    fun2()
    //
}

fun fun2() {
    val mylambda1 = myFunction()
    mylambda1() //prints 1
    mylambda1() //prints 2 -- lambda captures the value of ‘a’

//    val mylambda2 = myFunction()
//    mylambda2() //prints 1
//    mylambda2() //prints 2 -- lambda captures the value of ‘a’

}



