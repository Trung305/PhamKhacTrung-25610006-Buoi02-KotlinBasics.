//Phạm Khắc Trung - 25610006
fun main() {
    val diemTrungBinh: Double = 7.0
    when(diemTrungBinh){
        in 0.0..4.9-> println("Học lực: Yếu")
        in 5.0..6.4->println("Học lực: Trung bình")
        in 6.5..7.9->println("Học lực: Khá")
        in 8.0..8.9->println("Học lực: Giỏi")
        in 9.0..10.0->println("Học lực: Xuất sắc")
        else -> println("Điểm không hợp lệ")
    }
}