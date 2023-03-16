class Calculadora {

    fun soma(a: Double, b: Double): Double = a + b

    fun subtracao(a: Double, b: Double): Double = a - b

    fun divisao(a: Double, b: Double): Double{
        if (b == 0.0) throw java.lang.IllegalArgumentException("Não é possível dividir um número" +
                "por 0.")
        return  a / b
    }

    fun multiplicacao(a: Double, b: Double): Double = a * b
}