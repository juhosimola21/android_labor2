import java.io.File
import java.util.*

object TreeSetDictionary:IDictionary {

    var list = TreeSet<String>()

    init {
        val text = File(IDictionary.dictionary).readLines()
        for(i in 0 until text.size){
            list.add(text[i])
        }
    }

    override fun add(word: String): Boolean {

        if(find(word)){
            return false
        }
        list.add(word)
        return true
    }

    override fun find(word: String): Boolean {
        for(i in list){
            if(word == i)
                return true
        }
        return false
    }

    override fun size(): Int {
        return list.size
    }

}
