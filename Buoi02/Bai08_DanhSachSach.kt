// Phạm Khắc Trung - 25610006
fun main() {
    val danhSachSach = mutableListOf(
        "Sách 1",
        "Sách 2",
        "Sách 3",
        "Sách 4",
        "Sách 5"
    )
    println("Danh sách ban đầu:")
    println(danhSachSach)
    danhSachSach.add("Sách 6")
    danhSachSach.add("Sách 7")
    danhSachSach.remove("Sách 5")
    danhSachSach.sort()
    println("\nDanh sách sau khi thêm, xoá và sắp xếp:")
    println(danhSachSach)
}