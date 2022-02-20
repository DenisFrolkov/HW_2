fun main() {
    val tc: Array<Any> = arrayOf(1, 2, 3, 4, 5)
    print("Введите имя: ")
    val name = readLine()
    print("Введите фамилию: ")
    val surname = readLine()
    print("Введите возраст: ")
    val age :Int = readLine()!!.toInt()
    tc[0] = "$name $surname $age"
    println(tc[0])

    print("Введите имя: ")
    val name_2 = readLine()
    print("Введите фамилию: ")
    val surname_2 = readLine()
    print("Введите возраст: ")
    val age_2 :Int = readLine()!!.toInt()
    tc[1] = "$name_2 $surname_2 $age_2"
    println(tc[1])

    print("Введите имя: ")
    val name_3 = readLine()
    print("Введите фамилию: ")
    val surname_3 = readLine()
    print("Введите возраст: ")
    val age_3 :Int = readLine()!!.toInt()
    tc[2] = "$name_3 $surname_3 $age_3"
    println(tc[2])

    print("Введите имя: ")
    val name_4 = readLine()
    print("Введите фамилию: ")
    val surname_4 = readLine()
    print("Введите возраст: ")
    val age_4 :Int = readLine()!!.toInt()
    tc[3] = "$name_4 $surname_4 $age_4"
    println(tc[3])

    print("Введите имя: ")
    val name_5 = readLine()
    print("Введите фамилию: ")
    val surname_5 = readLine()
    print("Введите возраст: ")
    val age_5 :Int = readLine()!!.toInt()
    tc[4] = "$name_5 $surname_5 $age_5"
    println(tc[4])
    println("Все посетители: ")
    tc.forEach{el ->
        println(el)
    }
}
