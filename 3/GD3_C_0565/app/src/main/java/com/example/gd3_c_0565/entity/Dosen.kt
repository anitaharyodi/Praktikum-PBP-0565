package com.example.gd3_c_0565.entity

class Dosen (var name : String, var pengajar: String) {
    companion object {
        @JvmField
        var listOfDosen = arrayOf(
            Dosen("Fidelis Brian", "Pengajar Kelas A, B, dan D"),
            Dosen("Thomas Adi", "Pengajar Kelas C")
        )
    }
}