fun main(){
    //val : value(immutable)
    //var : variable(mutable)

    //user input
    print("Enter first number:")
    val a= readLine()!!.toInt()
    print("Enter second number:")
    val b= readLine()!!.toInt()
    val c= a+b
    //string interpolation
    println("sum of $a and $b is $c")

}