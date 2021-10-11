data class Date(val year:Int, val month:Int, val day:Int): Comparable<Date>{
    override operator fun compareTo(other: Date): Int {
        if (this.year > other.year) return 1
        if (this.year < other.year) return -1
        if (this.month > other.month) return 1
        if (this.month < other.month) return -1
        if (this.day > other.day) return 1
        if (this.day < other.day) return -1
        return 0
    }
}

fun isleap_year(year:Int):Boolean{
    var leap = false

    if (year % 4 == 0) {
        if (year % 100 == 0) {
            // year is divisible by 400, hence the year is a leap year
            leap = year % 400 == 0
        } else
            leap = true
    } else
        leap = false
    return leap
}

fun dateIsValid(date: Date):Boolean{
    var valid = false

    if(date.month == 1 || date.month == 3 || date.month == 5 || date.month == 7 || date.month == 8 || date.month == 9 || date.month == 12 ){
        if(date.day >=1 || date.day <= 31)
            valid = true
    }
    else if(date.month == 2){
        if(isleap_year(date.year) && date.day <= 29 && date.day >=1){
            valid = true
        }
        else if(date.day <= 28 && date.day >=1){
            valid = true
        }
    }
    else if (date.month == 4 || date.month == 6 || date.month == 9 || date.month == 11){
        if(date.day >=1 || date.day <= 30)
            valid = true
    }
    else valid = false

    return valid
}