fun main() {
    println("Bem vindo ao Bytebank")

    //instancia da classe
    //nao conseguiremos imprimir dessa forma por isso teremos que a colocar dentro de uma variavel
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0
    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)


}

//temos que criar a classe no mesmo nivel de arquivo
class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaLacos(){
    var i = 0
    while(i < 5) {
        val titular = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular")
        println("Numero da conta $numeroConta")
        println("Saldo da conta $saldo")
        println()
        i++
    }

    /*
      for (i in 1..3) {

         //val variavel que nao permite modificar o valor
         //var varival que permite modificar o valor
         //deve sempre inicializar a variavel
         val titular = "Alex $i"
         val numeroConta = 1000 + i
         var saldo = i + 10.0


         //podemos utilizar a string templete que eh chamar a variavel dentro da string
         println("Titular $titular")
         println("Numero da conta $numeroConta")
         println("Saldo da conta $saldo")
         println()
        */
    // testaCondicoes(saldo)

    //for in soh permite quando o primeiro numero eh menor do que o ultimo da condicao
    //quando queremos diminuir temos que usar o downTo
    /*
    for(i in 5 downTo 1 step 1){
        println(i)
        //se quisermos parar a operacao utilizamos o if com o break
        if(i == 4){
            break
        }
    }
    */
}

fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("conta eh positiva")
    } else if (saldo == 0.0) {
        println("conta eh neutra")
    } else {
        println("conta eh negativa")
    }

    //Substitui o if pelo when para que fique menor
    when {
        saldo > 0.0 -> {
            println("conta eh positiva")
        }
        saldo == 0.0 -> {
            println("conta eh neutra")
        }
        else -> {
            println("conta eh negativa")
        }
    }

    //e ainda conseguimos diminuir mais tirando as chaves e colocando na mesma clinha
    when {
        saldo > 0.0 -> println("conta eh positiva")
        saldo == 0.0 -> println("conta eh neutra")
        else -> println("conta eh negativa")
    }

}