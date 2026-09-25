fun main() {
    tinhDienTich(2.0,3.0)
    tinhDienTich(3.0,8.0)
}
fun tinhDienTich (dai: Double, rong: Double): Unit{
    val dienTich: Double = dai*rong
    println("Dien tich: $dienTich")
}