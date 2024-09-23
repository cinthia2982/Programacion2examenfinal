package com.programacion2examenfinal.adaptadores

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.programacion2examenfinal.modelo.Medicion
import com.programacion2examenfinal.databinding.ItemMedicionBinding

class MedicionAdapter(private val mediciones: List<Medicion>) : RecyclerView.Adapter<MedicionAdapter.MedicionViewHolder>() {

    class MedicionViewHolder(private val binding: ItemMedicionBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(medicion: Medicion) {
            binding.tipoGasto.text = medicion.tipoGasto
            binding.valor.text = medicion.valor.toString()
            binding.fecha.text = medicion.fecha.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicionViewHolder {
        val binding = ItemMedicionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MedicionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MedicionViewHolder, position: Int) {
        holder.bind(mediciones[position])
    }

    override fun getItemCount(): Int = mediciones.size
}
