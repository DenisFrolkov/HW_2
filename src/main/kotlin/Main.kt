fun main() {

    print("Введите имя: ")
    val name = readLine()
    print("Введите фамилию: ")
    val surname = readLine()
    print("Введите возраст: ")
    val age :Int = readLine()!!.toInt()
    if (age > 18) println("$name $surname ему есть 18, пропускайте.")
    if (age < 14) println("$name $surname младше 14 лет, вызовите полицию.")
    if (age > 14 && age < 18) println ("$name $surname не пускать в торговый центр.")

}