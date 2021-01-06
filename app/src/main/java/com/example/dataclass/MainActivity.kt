package com.example.dataclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var book1 = Book(1,"dac nhan tam",100000.0)
        var book2 = Book(1,"dac nhan tam",100000.0)
        var result = book1.hashCode()
        Log.d("bbb", result.toString())
        Log.d("bbb","==================")
        var student1 = Student(1,"Nguyen hoai thanh","963")
        var student2 = Student(1,"Nguyen hoai thanh","963")
        var result2:Boolean = student1 == student2
        Log.d("bbb", result2.toString())

    }
}