package com.example.agenda.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.agenda.DAO.AlunoDAO;
import com.example.agenda.R;
import com.example.agenda.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        AlunoDao dao = new AlunoDAO();


        final EditText campoNome = findViewById(R.id.activity_formulatio_aluno_nome);
        final EditText campoTelefeone = findViewById(R.id.activity_formulatio_aluno_telefone);
        final EditText campoEmail = findViewById(R.id.activity_formulatio_aluno_email);

        Button botaoSalvar = findViewById(R.id.activity_formulario_aluno_botao_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome= campoNome.getText().toString();
                String telefone = campoTelefeone.getText().toString();
                String email = campoEmail.getText().toString();

                Aluno alunoCriado = new Aluno(nome, telefone, email);
                dao.salva(alunoCriado);

            }
        });
    }
}
