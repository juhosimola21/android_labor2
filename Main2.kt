

fun main(args: Array<String>) {
    //1 FELADAT
    println("1 FELADAT")
    val list = listOf("John Smith", "Juhos Imola", "Madaras Hunor")
    var name = list.map{it -> println(monogram(it))}

    //2 FELADAT
    println()
    println("2 FELADAT")
    println(listOf("apple", "pear", "melon").joinToString ("#"))

    //3 FELADAT
    println()
    println("3 FELADAT")
    val list2 = listOf("apple", "pear", "melon","strawberry")
    val longest = list2.maxOf {it}
    println("Longest word: $longest")

}

fun monogram(it:String):String{
    var first = it.first()
    var last = it[it.indexOf(" ")+1]
    var mono = ""+first + last
    return mono
}