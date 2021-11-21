import java.lang.Exception

fun main(args: Array<String>) {

    // Ask to user Enter Age Number
    print("Enter your age: ")
    // use Try and catch --> try if user enter age greater than 18 will print welcome
    // if Not will move on to Catch and Ask to user  enter right number
    try {
        var age = readLine()!!.toInt()
        if (age > 18 ) {
            print("Welcome!")

        } else {
            print("You are not old enough ..")

        }

    } catch (e: Exception){
        print("Pleace Enter number only")

    }
}