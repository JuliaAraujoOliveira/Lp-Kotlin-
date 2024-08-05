import java.util.Scanner

fun main() {
    var snLeitor = Scanner(System.`in`)


    /* println("Digite o primeiro valor: ")
     var a = snLeitor.nextInt()

     println("Digite o segundo valor")
     var b = snLeitor.nextInt()

     var soma = a +b
     var sub = a - b
     println("O resultado da soma é $soma")
     println("O resultado da subtração é $sub")*/
    println("Soma = 1 , Subtração = 2, divisão = 3, multiplicação = 4")

    println("Digite um numero: ")
    var escolha = snLeitor.nextInt()

    println("Digite o primeiro valor: ")
    var v1 = snLeitor.nextInt()

    println("Digite o segundo valor:")
    var v2 = snLeitor.nextInt()


    var result = 0

    if(escolha == 1){
        result = v1 + v2
        println("Resultadoda Soma $result")
    }else if(escolha == 2){
        result = v1 - v2
        println("Resultado da Subtração $result")
    } else if(escolha == 3){
        result = v1 / v2
        println("Resultado da Divisão $result")
    }else if (escolha == 4){
        result = v1 * v2
        println("Resultado da Multiplicação $result")
    }else{
        println("Escolha invalida")
    }

}