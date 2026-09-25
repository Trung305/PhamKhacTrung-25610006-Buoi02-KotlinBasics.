//Phạm Khắc Trung - 25610006
fun main() {
    dinhDangDiaChi(thamSo1 = "Lan 1", thamSo2 = 3, thamSo5 = true, thamSo4 = "Lan 4", thamSo3 = false)
}
fun dinhDangDiaChi (thamSo1: String, thamSo2: Int, thamSo3: Boolean = true, thamSo4: String = "MacDinh",thamSo5: Boolean = true): Unit{
    println("Tham so 1: $thamSo1")
    println("Tham so 2: $thamSo2")
    println("Tham so 3: $thamSo3")
    println("Tham so 4: $thamSo4")
    println("Tham so 5: $thamSo5")
}