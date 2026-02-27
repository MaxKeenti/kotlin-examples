class Person (var name: String = "", var age: Int = 0){
    fun wave(){
        println("$name is waving to you!");
    }
}

fun main(){
    val people = arrayOf(
        Person("Meishi"),
        Person("Luiz"),
        Person("Henrique"),
        Person("Marcial"),
        Person("Xiao Ling"),
        Person("Heisenberg"),
        Person("Ophelia"),
        Person("Xóchitl"),
        Person("Huitzilopochtli"),
        Person("Tláloc"));

    for(person in people){
        person.wave();
    }
}