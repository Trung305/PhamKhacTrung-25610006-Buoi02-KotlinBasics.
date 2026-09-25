//Phạm Khắc Trung - 25610006
// Dùng val cho số dư ban đầu là vì biến này không được thay đổi còn dùng var là biến số dư thay đổi
fun main() {
    val soDuBanDau: Double = 5_000_000.0
    var soDu: Double = soDuBanDau
    println("Số dư ban đầu: $soDu")
    soDu = soDu + 2_000_000.0
    println("Giao dịch thêm:")
    println("Số dư tài khoản: $soDu")

    soDu = soDu - 1_500_000.0
    println("Giao dịch rút:")
    println("Số dư tài khoản: $soDu")
}