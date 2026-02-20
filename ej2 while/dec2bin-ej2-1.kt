// Print our res backwards
fun main() {
    var num : Int = 0;
    var res : Int = 0;
    var bin : String = "";

    num = 8;

    while (num != 0){
        res = num % 2;
        num = num / 2;
        bin = res.toString() + bin;
    }
    println(bin);
}