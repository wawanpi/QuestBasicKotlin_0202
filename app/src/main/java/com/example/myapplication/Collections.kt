package com.example.myapplication
// List adalah Kumpulan data yang disusun secara berurutan dari
// List bersifat ordered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
// List bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// List Read-Only menggunakan list0f
// List Mutable menggunakan mutableList0f

fun ContohList() {
    println("== List ===")
    //;ist Read-Only
    val reaOnlyAbjad = listOf("A","B","C")
    println(reaOnlyAbjad)

    //LIsr Mutable
    val shape: MutableList<String> = mutableListOf("Circle","Square","Triangel")
    println(shape)

    //Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    //Menghapus data dari list Mutable
    shape.remove( "Triangle")
    println(shape)

    //Mengubah data di dalam List Mutable
    shape[0] = "Oval"
    println(shape)

    //list Read-only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}
// Set adalah Kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik(tidak ada duplikasi)
// Set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Set Read-Only menggunakan set0f
// Set Mutable menggunakan mutableSet0f

fun ContohSet () {
    println()
    println(" === Set === ")

// Set Read-Only
    val readOnlyAbjad = set0f("A", "B", "C")
    println(read0nlyAbjad)

    // Set Mutable
    val mutableShapes: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(mutableShapes)

    // Menambahkan data kedalam Set Mutable
    mutableShapes.add("Rectangle")
    println(mutableShapes)

    // Menghapus Data Kedalam Set Mutable
    shape.remove("Circle")
    println(shape)

    // Set Read-Only
    val shapeLocked: Set<String> = mutableShapes
    println(shapeLocked)
}

// Map adalah Kumpulan data yang disusun dalam pasangan key-value
// Map bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Map bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Map Read-Only menggunakan map0f
// Map Mutable menggunakan mutableMapOf

fun ContohMap() {

    println()
    println(" === Map === ")
// Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    // Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    // Menambahkan data ke dalam Map Mutable
    shape ["Rectangle"] = 4
    println(shape)
    }