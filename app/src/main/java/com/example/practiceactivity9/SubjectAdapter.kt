package com.example.practiceactivity9

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practiceactivity9.databinding.SubjectLayoutBinding

class SubjectAdapter(private val subject:List<Subject>):RecyclerView.Adapter<SubjectViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubjectViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = SubjectLayoutBinding.inflate(inflater, parent, false)
        return SubjectViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return subject.size
    }

    override fun onBindViewHolder(holder: SubjectViewHolder, position: Int) {
        holder.bind(subject[position])
    }
}