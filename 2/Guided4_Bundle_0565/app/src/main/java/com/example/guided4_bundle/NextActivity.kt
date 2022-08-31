package com.example.guided4_bundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NextActivity : AppCompatActivity() {
    private lateinit var nama: TextView
    private lateinit var nim: TextView
    private lateinit var fakultas: TextView
    private lateinit var prodi: TextView
    lateinit var mBundle: Bundle

    lateinit var  vNama: String
    lateinit var vNIM: String
    lateinit var vFakultas: String
    lateinit var vProdi: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        getBundle()
        setText()
    }

    fun getBundle() {
        mBundle = intent.getBundleExtra("register")!!
        vNama = mBundle.getString("nama")!!
        vNIM = mBundle.getString("nim")!!
        vFakultas = mBundle.getString("fakultas")!!
        vProdi = mBundle.getString("prodi")!!
    }

    fun setText() {
        nama = findViewById(R.id.txtViewNama)
        nama.setText(vNama)
        nim = findViewById(R.id.txtViewNIM)
        nim.setText(vNIM)
        fakultas = findViewById(R.id.txtViewFakultas)
        fakultas.setText(vFakultas)
        prodi = findViewById(R.id.txtViewProdi)
        prodi.setText(vProdi)
    }
}