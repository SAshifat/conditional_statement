/*
fun main(){
    println("inter first number:")
    val a = readln().toInt()

    println("inter first number:")
    val b = readln().toInt()

    println("inter first number:")
    val c = readln().toInt()

    if (a > b && a > c){
        println("a = $a is greater than $b")
    }
    else if(b > a && b > c){
        println("b = $b is greater than $a and $c")
    }
    else{
        println("c= $c is greater than $a and $b")
    }


}

 */

fun main(){
    println("Enter your marks: ")
    var mark = readln().toInt()

    var grade = when (mark){
        in 80..100 -> ("A+")
        in 70 .. 79 -> ("A")
        in 60..69 -> ("A-")
        in 50..59 -> ("B")
        in 40..49 -> ("C")
        in 30..39 -> ("D")
        in 0..29 ->("F")
        else -> ("Invalid number")
    }
    println(grade)


}