// Phạm Khắc Trung - 25610006
fun main() {
    println("Dãy Fibonacci:")
    var a = 0
    var b = 1
    for (i in 0..100) {
        if (a >= 100) {
            break
        }
        println("Vị trí $i: Giá trị $a")

        val fib = a + b
        a = b
        b = fib
    }
}