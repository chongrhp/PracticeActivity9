package com.example.practiceactivity9

import android.content.DialogInterface
import android.text.Html
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.example.practiceactivity9.databinding.SubjectLayoutBinding


class SubjectViewHolder(private val binding:SubjectLayoutBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind(subject: Subject){

        var txtSubject = "SUBJECT: <font color='#ffffff'>${subject.subjectName}</font>" +
        "<br/>PROFFESOR: <font color='#ffffff'>${subject.professorName}</font>" +
                "<br/>CONTACT No.: <font color='#ffffff'>${subject.contactNo}</font>"
        binding.txtSubjects.setText(Html.fromHtml(txtSubject))
        if(subject.gender == "male") binding.imageView.setImageResource(R.drawable.profmale)
        else binding.imageView.setImageResource(R.drawable.proffemale)

        binding.cardView.setOnClickListener {showDialog()}
    }

    private fun showDialog(){
        val alertDialogBuilder = AlertDialog.Builder(binding.cardView.context)
        alertDialogBuilder.setTitle("SUBJECT DETAILS")
        alertDialogBuilder.setMessage("${binding.txtSubjects.text}")
        alertDialogBuilder.setNegativeButton("OK"){ _: DialogInterface, _:Int -> }
        alertDialogBuilder.create().show()
    }

}