import kotlin.random.Random

fun main() {

    val randomNumbers = mutableListOf<Int>()


    repeat(1000) {
        randomNumbers.add(Random.nextInt(10, 1001))
    }


    println(randomNumbers)
}