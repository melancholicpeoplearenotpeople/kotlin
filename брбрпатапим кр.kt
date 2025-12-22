import kotlin.random.Random
// 1.1 Россия не проиграет
// 1.2 а)Однозначно а иначе то не как
// 1.3 1) Br + Br = BrBrPatapim 2) Tra + La = Tralalelo tralala
fun main(){
    var playerTimurHealth = 100
    var enemyYriyHealth = 80

    println("Start bitva")

    while (playerTimurHealth > 0 && enemyYriyHealth > 0) {
        var timurDamage = Random.nextInt(10,26)
        var yriyDamage = Random.nextInt(5,31)

        enemyYriyHealth -= timurDamage
        println("fofo shenle yron polychai ${timurDamage}")

        if (enemyYriyHealth <= 0) break

        playerTimurHealth -= yriyDamage
        println("fofo shneli mne vmazali ${yriyDamage}")

        if (playerTimurHealth <= 0) break
    }
    when{
        playerTimurHealth > 0 -> println("fafa im vin")
        else -> println("pepe im lose")
    }
}
