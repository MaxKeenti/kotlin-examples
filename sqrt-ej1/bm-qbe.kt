import kotlin.math.sqrt;
import kotlin.math.pow;

fun main() {
    var a : Double = 2.0;
    var b : Double = 3.0;
    var res = a.pow(3) + 3 * a.pow(2) * b + 3 * a * b.pow(2) + b.pow(3);
    println("res = $res");
}