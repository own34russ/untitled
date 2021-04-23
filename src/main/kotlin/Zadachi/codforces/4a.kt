package Zadachi.codforces

fun main(args: Array<String>){
    val weight = readLine()!!.toInt();
    println( if (weight > 2 && weight % 2 == 0) "YES" else "NO" );
}
