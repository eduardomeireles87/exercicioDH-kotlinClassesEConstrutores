package Classes

/*
Escreva uma classe que receba uma lista de números e uma função que imprime no console o produto
ou seja o resultado de multiplicar todos os elementos entre si.
Por exemplo: array[1, 4, 7] deve imprimir 28, que é 1 * 4 * 7.
 */

class array147(var lista: List<Int> ) {

    //Multiplica os numeros do array 1, 4, 7

    fun calculadora() : Int{
        var i = 0

        var resultado = lista[i]
        while(i<lista.size){
            resultado = resultado * lista[i];
            i++
        }
        return resultado
    }
}