fun main(){
    println("Bronza")
    var bronze = readLine()!!.toInt()
    println("silver")
    var silver = readLine()!!.toInt()
    println("Golda")
    var gold = readLine()!!.toInt()
    println("Platina")
    var platina = readLine()!!.toInt()
    while (bronze >= 100) {
        bronze = bronze - 100
        silver += 1
    }
    while (silver >= 100) {
        silver = silver - 100
        gold += 1
    }
    while (gold >= 1000) {
        gold = gold - 1000
        platina += 1
    }
    println("y was bronze: $bronze")
    println("y was silver: $silver")
    println("y was gold: $gold")
    println("y was platina: $platina")
}