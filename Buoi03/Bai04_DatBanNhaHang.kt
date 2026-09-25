//Phạm Khắc Trung - 25610006
fun main() {
    datBan("Nam", 4)
    datBan("Nhan", 2, "Vip")
    datBan(tenKH = "Trung",loaiBan ="Vip", soLuong= 2)
}
fun datBan (tenKH: String, soLuong: Int, loaiBan: String = "Thuong"): Unit{
    println("Khach hang $tenKH dat $soLuong ban loai $loaiBan")
}