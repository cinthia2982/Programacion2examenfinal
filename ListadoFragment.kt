package com.programacion2examenfinal.vista

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.programacion2examenfinal.R
import com.programacion2examenfinal.adaptadores.MedicionAdapter
import com.programacion2examenfinal.vista_modelo.MedicionViewModel

class ListadoFragment : Fragment() {
    private lateinit var viewModel: MedicionViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MedicionAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.fragment_listado, container, false)

        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        viewModel = // Inicializa tu ViewModel aquí
            adapter = MedicionAdapter(viewModel.mediciones)
        recyclerView.adapter = adapter

        return view
    }
}
