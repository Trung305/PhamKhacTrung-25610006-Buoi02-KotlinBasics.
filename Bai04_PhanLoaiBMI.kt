//Phạm Khắc Trung - 25610006
fun main() {
    val canNang: Double = 52.0
    val chieuCao: Double = 1.65
    val chiSo: Double = canNang/(chieuCao*chieuCao)
    println("Giá trị chỉ số: $chiSo")
    if(chiSo < 18.5){
        println("Gầy")
    }else if(chiSo <=24.9){
        println("Bình thường")
    }
    else if(chiSo<=29.9){
        println("Thừa cân")
    }else{
        println("Béo phì")
    }
}