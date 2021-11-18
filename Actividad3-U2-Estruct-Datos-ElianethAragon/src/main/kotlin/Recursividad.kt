import java.util.Random
fun main(args:Array<String>) {
    var n=10
    val lista = MutableList(n) {
        "$it"
var min=5
        var max=7
            var nAleatorio = (min..max).random()

            println("lista $it numero aleatorio $nAleatorio")

            if (nAleatorio== 5) {

                println("Es 5 en  lista $it")
            }

        }
    }



















