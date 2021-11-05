fun main() {
    val input = readLine()!!
    val int = input.toInt()
    for (i in 2..int) {
        if (isPrime(i)) println(i)
    }
}
fun isPrime(input: Int): Boolean {
    var i = input
    while (i > 2) {
        i--
        if (input % i == 0) return false
    }
    return true
}