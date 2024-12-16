fun main() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    val doubledList = mutableList.map { it * 2 }
    println(doubledList)

    mutableList.add(6) //This is now allowed
    println(mutableList)
    
    val evenNumbers = mutableList.filter { it % 2 == 0 }
    println(evenNumbers)

    val sum = mutableList.fold(0) { acc, i -> acc + i }
    println(sum)

    val firstEvenNumber = mutableList.find { it % 2 == 0 }
    println(firstEvenNumber)
}