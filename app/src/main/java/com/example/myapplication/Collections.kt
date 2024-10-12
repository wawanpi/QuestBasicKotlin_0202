package com.example.myapplication

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