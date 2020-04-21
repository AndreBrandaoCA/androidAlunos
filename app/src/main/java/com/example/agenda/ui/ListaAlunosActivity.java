package com.example.agenda.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.agenda.DAO.AlunoDAO;
import com.example.agenda.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.example.agenda.DAO.AlunoDAO;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);
        AlunoDao dao = new AlunoDAO();

        setTitle("Lista de Alunos");
        List<String> alunos = new ArrayList<>(Arrays.asList("Andre","Fran","Jose","Maria","Ana"));
        ListView listaDeAlunos = findViewById(R.id.activity_lista_alunos_listview);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,dao.todos();));
    }
}
