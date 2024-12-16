fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers)

    val sum = list.fold(0) { acc, i -> acc + i }
    println(sum)

    val firstEvenNumber = list.find { it % 2 == 0 }
    println(firstEvenNumber)
}