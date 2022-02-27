fun main() {
    println("Введите количество посетителей: ")
    val people = readLine()!!.toInt()
    var age: Int
    var counter = 0
    val names = arrayOfNulls<String>(people)
    val surnames = arrayOfNulls<String>(people)
    val ages = arrayOfNulls<Int>(people)
    println("Введите имя, фамилию и возраст ${counter+1} человека")
    while(counter < ages.size){
        print("${counter+1}.Age :")
        age = readLine()!!.toInt()
        if (age >= 18) ages[counter] = age
        else{
            println("Человек несовершеннолетний, повторите ввод возраста!")
            continue
        }
        print("Имя: ")
        names[counter] = readLine()
        print("Фамилия: ")
        surnames[counter] = readLine()

        counter++
    }
    counter = 0
    while (counter < ages.size) {
        println("${counter+1}: ${names[counter]} ${surnames[counter]} ${ages[counter]}")
        counter++
    }
}