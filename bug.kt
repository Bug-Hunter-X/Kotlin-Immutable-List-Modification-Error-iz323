fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)
    //This code will run without errors, the problem is that the doubledList is immutable
    doubledList[0] = 10 // This will cause an error because the list is immutable
}