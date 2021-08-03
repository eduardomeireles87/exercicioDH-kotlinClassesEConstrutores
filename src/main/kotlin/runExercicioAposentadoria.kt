package classes

fun main(){
    val pessoa1 = exercicioAposentadoria(40, "feminino", 30)
    val pessoa2 = exercicioAposentadoria(80, "masculino", 30)
    val pessoa3 = exercicioAposentadoria(65, "feminino", 25)

    println(pessoa1.calculadoraAposentadoria())
    println(pessoa2.calculadoraAposentadoria())
    println(pessoa3.calculadoraAposentadoria())
}