package Zadachi.codforces

fun main(args: Array<String>){
    val weight = readLine()!!.toInt();
    if (weight>2 && weight%2==0)
        println("YES")
    else
        println("NO")
}