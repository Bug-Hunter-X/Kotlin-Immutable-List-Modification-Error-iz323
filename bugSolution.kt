fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)
    //This is the correct way to modify the list
    doubledList[0] = 10
    println(doubledList)
}