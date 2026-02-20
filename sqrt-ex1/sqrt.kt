import kotlin.math.sqrt;
fun main() {
    var a = 1.0;
    var b = 5.0;
    var c = 6.0;
    var x1 = (-b + sqrt(b * b - 4 * a * c)) / (2 * a);
    println("x1 = $x1");
}