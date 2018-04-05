/* PROYECTO 1
fun main(parametro: Array<String>) {
    print("Hola Mundo")
}*/

/* PROYECTO 2
fun main(parametro: Array<String>) {

    val valor1 = 100
    val valor2 = 400
    var resultado = valor1 + valor2
    println("La suma de $valor1 + $valor2 es $resultado")
    resultado = valor1 * valor2
    println("El producto de $valor1 * $valor2 es $resultado")
} */

/* PROYECTO 3
fun main(argumento: Array<String>) {
    print("Ingrese primer valor:")
    val valor1 = readLine()!!.toInt()
    print("Ingrese segundo valor:")
    val valor2 = readLine()!!.toInt()
    val suma = valor1 + valor2
    println("La suma de $valor1 y $valor2 es $suma")
    val producto = valor1 * valor2
    println("El producto de $valor1 y $valor2 es $producto")}

fun main(parametro: Array<String>) {
    print("Ingrese la medida del lado del cuadrado:")
    val lado = readLine()!!.toInt()
    val perimetro = lado * 4
    println("El perímetro del cuadrado es $perimetro")
}

fun main(parametro: Array<String>) {
    print("Ingrese el precio del producto:")
    val precio = readLine()!!.toDouble()
    print("Ingrese la cantidad de productos:")
    val cantidad = readLine()!!.toInt()
    val total = precio * cantidad
    println("El total a pagar es $total")
} */

/* PROYECTO 4

fun main(parametro: Array<String>) {
    print("Ingrese el primer valor:")
    val valor1 = readLine()!!.toInt()
    print("Ingrese el segundo valor:")
    val valor2 = readLine()!!.toInt()
    if (valor1 < valor2) {
        val suma = valor1 + valor2
        val resta = valor1 - valor2
        println("La suma de los dos valores es: $suma")
        println("La resta de los dos valores es: $resta")
    } else {
        val producto = valor1 * valor2
        val division = valor1 / valor2
        println("El producto de los dos valores es: $producto")
        println("La división de los dos valores es: $division")
    }
} */