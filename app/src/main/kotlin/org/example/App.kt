/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

fun main() {
    println("=== Etapa 1: Funciones Básicas ===")
    // TODO: Implementar función calcularPromedio
    val promedio1 = calcularPromedio(7.5, 8.0)
    println("El promedio es: $promedio1")

    // TODO: Implementar función esAprobado
    val nota = 7.0
    val aprobado = esAprobado(nota)
    println("¿Está aprobado? $aprobado")

    println("\n=== Etapa 2: Funciones con Múltiples Parámetros ===")
    // TODO: Implementar función calcularPromedioTresNotas
    val promedioTresNotas = calcularPromedioTresNotas(7.0, 8.0, 9.0)
    println("El promedio de las tres notas es: $promedioTresNotas")

    // TODO: Implementar función obtenerEstadoAlumno
    val estado = obtenerEstadoAlumno("Juan", "Pérez", 7.5)
    println(estado)

    println("\n=== Etapa 3: Funciones con Listas ===")
    // TODO: Implementar función calcularPromedioCurso
    val notas = listOf(7.0, 8.0, 6.5, 9.0, 7.5)
    val promedioCurso = calcularPromedioCurso(notas)
    println("El promedio del curso es: $promedioCurso")

    // TODO: Implementar función obtenerAlumnosAprobados
    val nombres = listOf("Ana", "Juan", "María", "Pedro", "Lucía")
    val notasAlumnos = listOf(7.0, 5.0, 8.0, 6.0, 9.0)
    val aprobados = obtenerAlumnosAprobados(nombres, notasAlumnos)
    println("Alumnos aprobados: $aprobados")

    println("\n=== Etapa 4: Funciones Avanzadas ===")
    // TODO: Implementar función generarBoletin
    val materias = listOf("Matemática", "Lengua", "Historia")
    val notasMaterias = listOf(8.0, 7.5, 9.0)
    val boletin = generarBoletin("Juan Pérez", materias, notasMaterias)
    println(boletin)

    // TODO: Implementar funciones de análisis de rendimiento
    println("Estadísticas del curso:")
    println("Promedio: ${calcularPromedioCurso(notas)}")
    println("Nota más alta: ${obtenerNotaMasAlta(notas)}")
    println("Nota más baja: ${obtenerNotaMasBaja(notas)}")
    println("Cantidad de aprobados: ${contarAprobados(notas)}")
}

// TODO: Implementar las siguientes funciones:

// Etapa 1
fun calcularPromedio(nota1: Double, nota2: Double): Double {
    var prom = nota1 + nota2
    prom = prom/2
    return prom
}

fun esAprobado(nota: Double): Boolean {
    if (nota >= 7){

        return true
    }
    else{
        return false
    }
    
}

// Etapa 2
fun calcularPromedioTresNotas(nota1: Double, nota2: Double, nota3: Double): Double {
    var prom = nota1 + nota2 + nota3
    prom = prom/3
    return prom
}

fun obtenerEstadoAlumno(nombre: String, apellido: String, nota: Double): String {
    val aprob = esAprobado(nota)
    if (aprob == false){
        return "El alumno $nombre $apellido no esta aprobado"
    }
    else {
        return "El alumno $nombre $apellido esta aprobado"
    }
    
}

// Etapa 3
fun calcularPromedioCurso(notas: List<Double>): Double {
    var suma = 0.0
    for (i in notas.indices){
    suma += notas[i]
    }
    val prom = suma / 5.0
    return prom
}

fun obtenerAlumnosAprobados(nombres: List<String>, notas: List<Double>): List<String> {
    val listaMutable = mutableListOf<String>()
    for (i in notas.indices){
        if (notas[i] >= 7){
            listaMutable.add(nombres[i])
        }
    }
    return listaMutable
}

// Etapa 4
fun generarBoletin(nombre: String, materias: List<String>, notas: List<Double>): String {
    return """
        Nombre del alumno: $nombre
        ${materias[0]}: ${notas[0]}
        ${materias[1]}: ${notas[1]}
        ${materias[2]}: ${notas[2]}
    """.trimIndent()

}

fun obtenerNotaMasAlta(notas: List<Double>): Double {
    val maximo = notas.max()       
    return maximo
}

fun obtenerNotaMasBaja(notas: List<Double>): Double {
    val minimo = notas.min()       
    return minimo
}

fun contarAprobados(notas: List<Double>): Int {
    var aprobados = 0
    for (i in notas.indices){
        if (notas[i] >= 7){
            aprobados += 1
        }
    }
    return aprobados
}
