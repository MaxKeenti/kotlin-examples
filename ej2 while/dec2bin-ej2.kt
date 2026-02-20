fun main() {
    var num : Int = 0;
    var res : Int = 0;

    num = 8;

    while (num != 0){
        res = num % 2;
        num = num / 2;
        println(res);
    }
}