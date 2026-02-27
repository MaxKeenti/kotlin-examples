fun main (){
    var int: Int = 1234;

    println(logicDigits(int));
}

fun digitsToWords(num: Int): String {
    return when (num) {
        0 -> "Cero";
        1 -> "Uno";
        2 -> "Dos";
        3 -> "Tres";
        4 -> "Cuatro";
        5 -> "Cinco";
        6 -> "Seis";
        7 -> "Siete";
        8 -> "Ocho";
        9 -> "Nueve";
        else -> "Número fuera de rango";
    }
}

fun logicDigits(num: Int): String {
    var string: String = "";
    var n: Int = num;

    while (n != 0){
        string = digitsToWords(n % 10) + " " + string;
        n /= 10;
    }

    return string;
}