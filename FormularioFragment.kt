package com.programacion2examenfinal.vista

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import com.programacion2examenfinal.R
import com.programacion2examenfinal.modelo.Medicion
import com.programacion2examenfinal.vista_modelo.MedicionViewModel
import java.util.*

class FormularioFragment : Fragment() {
    private lateinit var viewModel: MedicionViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.fragment_formulario, container, false)

        val tipoGastoSpinner: Spinner = view.findViewById(R.id.tipoGastoSpinner)
        val valorEditText: EditText = view.findViewById(R.id.valorEditText)
        val guardarButton: Button = view.findViewById(R.id.guardarButton)

        guardarButton.setOnClickListener {
            val tipoGasto = tipoGastoSpinner.selectedItem.toString()
            val valor = valorEditText.text.toString().toDouble()
            val fecha = Date()

            val medicion = Medicion(tipoGasto = tipoGasto, valor = valor, fecha = fecha)
            viewModel.agregarMedicion(medicion)
            // Navegar de vuelta a la lista
        }

        return view
    }
}
