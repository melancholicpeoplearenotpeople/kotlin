import kotlin.random.Random


fun main () {
    val name: String = "Oleg"
    var health: Int = 100
    var attack: Int = 10
    var isAlive: Boolean = true
    val enemyName = "TUNTUNTUN Sahur"
    var enemyHealth = 50
    var enemyAttack = 5
    var end: Boolean = false
    while (end == false) {
        println("=== NA $name napal")
        health -= Random.nextInt(enemyAttack,20)
        if (health <= 0) {
            isAlive = false
            println("$name pogib ot $enemyName")
            end = true
        } else {
            println("$name polychil $enemyAttack yrona \n Ostalos zdorovia $health/100")
        }
        println("$name atackyet $enemyName")
        enemyHealth -= attack
        enemyHealth -= Random.nextInt(attack,20)



        if (enemyHealth <= 0) {
            println("yra pobeda, $enemyName poverjen")
            end = true
        } else {
            println("$name nanosit $enemyName $attack yrona")
        }
    }
}

