fun main() {
    var Name: Array<Any> = arrayOf(1, 2, 3, 4, 5)
    var Surname: Array<Any> = arrayOf(1, 2, 3, 4, 5)
    var Age: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    print("Введите имя: ")
    val name = readLine()
    print("Введите фамилию: ")
    val surname = readLine()
    print("Введите возраст: ")
    val age :Int = readLine()!!.toInt()


}
