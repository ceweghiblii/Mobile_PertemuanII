package com.example.pertemuan2
//Nama file ini sm nama xmlnya harus sama tapi dibalik
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pertemuan2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() { //value bersifat final, var bisa diganti
    //let init di tulis variabelnya, valuenya nanti
//    private lateinit var binding: ActivityMainBinding
    //lazy delegation tidak akan diinisialisasi kalau tidak dipanggil
   private val binding by lazy{ //lazy delegation : dipanggil pertama
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //Enable animasi
        //Harus ada content dari xml
        setContentView(binding.root) //dipanggil kedua
        binding.btnCount.setOnClickListener {
            val hasilAmbilText = binding.txtNumber.text
            val angka = hasilAmbilText.toString().toInt()
            val angkaHasil = angka+1
            binding.txtNumber.text = angkaHasil.toString()
        }
        binding.btnToast.setOnClickListener {
            val text = binding.txtNumber.text.toString()
            Toast.makeText(this, "Text yang munul adalah "+text, Toast.LENGTH_SHORT).show()
        }
        binding.btnMinus.setOnClickListener {
            val hasilAmbilText = binding.txtNumber.text
            val angka = hasilAmbilText.toString().toInt()
            val angkaHasil = angka-1
            binding.txtNumber.text = angkaHasil.toString()
        }
        binding.btnKali.setOnClickListener {
            val hasilAmbilText = binding.txtNumber.text
            val angka = hasilAmbilText.toString().toInt()
            val angkaHasil = angka*10
            binding.txtNumber.text = angkaHasil.toString()
        }
        //R = kelas untuk mengakeses folder

//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}