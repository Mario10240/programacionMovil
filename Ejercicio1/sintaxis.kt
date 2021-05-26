fun main() {

//Punto 1
var nombre: String = "Mario"
var edad: Int = 21
var activo: Boolean = true
var peso: Double = 78.35

//Punto 2
var apellido: String = "Alejandro"
println("$nombre $apellido")

//Punto 3
var edad1: Int = 19
if(edad1>18){
    println("Mayor de edad")
} else {
    if (edad1>0){
        println("Menor de edad")
    } else {
        println("ERROR")
    }
}

//Punto 5
var indice1 = 0
while(indice1<10){
    indice1++
    val num = (0..99).random()
    println("Valor $indice1: $num")
}

//Punto 8
val num1: Int = 13
val num2: Int = 0

try {
    var num3 = num1/num2
    println(num3)
    }
 catch (e: Throwable) {
    println("ERROR: DIVISION ENTRE CERO")
}

//Punto 9
//val j: Int = if (b != null) b.length else -1

//Punto 10
val lista1 = listOf("mario", "jesus", "gustavo", "juan", "kevin")

//Punto 11
val lista2 = mutableListOf<String>("mario", "jesus", "gustavo", "juan", "kevin")

//Punto 12
lista2.sortDescending()
println(lista2)

//Punto 13
val numeros = listOf(6, 4, 8)
println(numeros.map { it * 2 })

//Punto 15
fun funcion1(nombre: String, edad: Int): String{
    if(edad>17){
    return "El usuario $nombre es mayor de edad"
    } else {
if (edad>0){
        return "El usuario $nombre es menor de edad"
    } else {
        return "ERROR"
    }
}

}


//Punto 16
println(funcion1("Mario",0))
println(funcion1("Juan",27))
println(funcion1("Jose",16))
println(funcion1("Kimberly",13))
println(funcion1("Gustavo",18))

}