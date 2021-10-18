import java.io.File

object ListDictionary: IDictionary {
    val list = mutableListOf<String>()

    init {
        val text = File(IDictionary.dictionary).readLines()
        for(i in 0 until text.size){
            list.add(text[i])
        }
    }

    override fun add(word:String ): Boolean{
        if(word == null){
            return false
        }
        list.plus(word);
        return true
    }

    override fun find(word:String): Boolean{
        for(i in list){
            if(i == word)
                return true
        }
        return false
    }

    override fun size(): Int{
        return list.size
    }
}
