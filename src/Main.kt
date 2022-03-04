fun main(){
var name="AkiraChix"
    var x=(name[1].toString()+name[3]+name[4])
    println(x)
   var word=myfunc("fardosa",22)
    println(word)
    odd()
    fn("maryan")
}
fun myfunc(x: String, y:Int):String{
    var word=("Hi my name is $x and i am $y years old")
    return word
}
fun odd(){
    var name="mariam"
    println(name.length)
}
fun fn(x: String) {
    var x = "maryan"
    if (x == "fardosa") {
        println("That's me")
    } else
        println("I don't know who that is")
}

