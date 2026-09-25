//Phạm Khắc Trung - 25610006
/*
Nếu hàm không trả về giá trị thì kiểu trả về mặc định là Unit.
 */
fun main() {
    ghiNhatKy("Di an uong")
    ghiNhatKy1("Di an uong")
}
fun ghiNhatKy  (hanhDong: String): Unit{
    println("Hanh dong: $hanhDong")
}
fun ghiNhatKy1  (hanhDong: String){
    println("Hanh dong: $hanhDong")
}