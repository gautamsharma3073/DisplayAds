package com.example.displayads

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.activity.viewModels
import androidx.navigation.fragment.NavHostFragment
import com.downloader.*
import com.example.displayads.databinding.ActivityMainBinding
import com.example.displayads.model.ResourceData
import dagger.hilt.android.AndroidEntryPoint
import java.io.File
import java.io.FileInputStream

import java.lang.Error


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val myViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun storeDummyImage() {
        val url:String ="https://firebasestorage.googleapis.com/v0/b/daggerpracticenew.appspot.com/o/uploads%2F1626978961537.jpg?alt=media&token=9c3905c2-3ff4-4cc6-920f-dcfe0b0c02a8"
        val path = filesDir.absolutePath
        val fileName = "sample.jpg"
        downloadImageAndStoreImage(url,path,fileName)
    }


    fun downloadImageAndStoreImage(url:String,dirPath:String,fileName:String) {
        PRDownloader.initialize(applicationContext);
        val downloadId = PRDownloader.download(url, dirPath, fileName)
            .build()
            .setOnStartOrResumeListener { }
            .setOnPauseListener { }
            .setOnCancelListener { }
            .setOnProgressListener { }
            .start(object : OnDownloadListener {
                override fun onDownloadComplete() {
                    Toast.makeText(this@MainActivity, "Download Completed", Toast.LENGTH_SHORT).show()
                }
                override fun onError(error: com.downloader.Error?) {
                    TODO("Not yet implemented")
                }
            })
    }
    fun fetchImage() {
        val file = File(filesDir,"sample.jpg")
        val inputStream = FileInputStream(file)
        val bitmap:Bitmap = BitmapFactory.decodeStream(inputStream)
    }
}