fun main() {
    //val variavel que nao permite modificar o valor
    //var varival que permite modificar o valor
    //deve sempre inicializar a variavel
    val titular = "Alex"
    val numeroConta = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200
    saldo -= 0.0

    //podemos utilizar a string templete que eh chamar a variavel dentro da string
    println("Titular $titular")
    println("Numero da conta $numeroConta")
    println("Saldo da conta $saldo")

    if(saldo > 0.0){
        println("conta eh positiva")
    }else if(saldo == 0.0){
        println("conta eh neutra")
    }else {
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