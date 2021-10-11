import kotlin.random.Random

fun main(args: Array<String>) {
    val list = mutableListOf<Date>()
    println("Invalid dates: ")
    while(list.size < 10) {
        val date = Date(Random.nextInt(1000, 2021), Random.nextInt(1, 12), Random.nextInt(1, 31))

//        if (isleap_year(date.year)) {
//            println("Is leap year")
//        } else println("Is not leap year")

        if (dateIsValid(date)) {
            list.add(date)
        } else println(date)
    }
    println("Valid dates: ")
    list.forEach{
        println(it)
    }
    println(list.sorted())
    println(list.sortedDescending())

    val dayComparator = Comparator{day1:Date, day2:Date -> day1.day - day2.day}
    println(list.sortedWith(dayComparator))
}