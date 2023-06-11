package com.example.practiceactivity9

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practiceactivity9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val studentDetails = "<b><font color='#ffffff'>RIECHO H. PINANONANG</font></b>" +
        "<br/><font color='#ffffff'>Contact no.:</font> 09173053158<br/>" +
                "<br/><font color='#ffffff'>Province:</font>Negros Oriental<br>" +
                "<font color='#ffffff'>Country:</font> Philippines 6221<br/>" +
                "<font color='#ffffff'>Course:</font> Mobile Developer<br/>"

        binding.txtStudentDetails.setText(Html.fromHtml(studentDetails))
        recyclerView = binding.myRecycleView
        recyclerView.layoutManager = LinearLayoutManager(this)

        val subjects = listOf(
            Subject("Mathematics", "Vince Carter", "09170000","male"),
            Subject("Science", "Cliff Carter", "09170000","female"),
            Subject("Filipino", "Bernadette Sambrano", "09170000","male"),
            Subject("History", "Vince Carter", "09170000","male"),
            Subject("Calculus", "Cliff Carter", "09170000","female"),
            Subject("Mathematics", "Vince Carter", "09170000","male"),
            Subject("Science", "Cliff Carter", "09170000","female"),
            Subject("Filipino", "Bernadette Sambrano", "09170000","male"),
            Subject("History", "Vince Carter", "09170000","male"),
            Subject("Calculus", "Cliff Carter", "09170000","female"),
            Subject("Mathematics", "Vince Carter", "09170000","male"),
            Subject("Science", "Cliff Carter", "09170000","female"),
            Subject("Filipino", "Bernadette Sambrano", "09170000","male"),
            Subject("History", "Vince Carter", "09170000","male"),
            Subject("Calculus", "Cliff Carter", "09170000","female"),

        )

        recyclerView.adapter = SubjectAdapter(subjects)
    }


}

