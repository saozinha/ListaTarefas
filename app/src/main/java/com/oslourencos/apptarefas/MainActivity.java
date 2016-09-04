package com.oslourencos.apptarefas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import adapter.TarefaAdapter;
import to.Tarefa;

public class MainActivity extends AppCompatActivity {

    private List<Tarefa> listaTarefas = new ArrayList<>();
    public ListView listView;

    public List<Tarefa> CarregaLista(){
        listaTarefas.add(new Tarefa(1,"Estudar android", "realizado", " 2 horas"));
        listaTarefas.add(new Tarefa(2,"Estudar Java", "a fazer", " 2 horas"));
        listaTarefas.add(new Tarefa(3,"Implementar o app no sqLite", "a fazer", " 2 horas"));
        listaTarefas.add(new Tarefa(4,"Estudar GitHub", "a fazer", " 2 horas"));
        listaTarefas.add(new Tarefa(5,"Implementar um proj", "a fazer", " 2 horas"));
        listaTarefas.add(new Tarefa(6,"Ir ao meetup", "a fazer", " 3 horas"));
        listaTarefas.add(new Tarefa(7,"Implementar o app no Firebase ", "a fazer", "12 horas"));
        listaTarefas.add(new Tarefa(8,"Comer pizza ", "a fazer", " 1 hora"));
        listaTarefas.add(new Tarefa(9,"Dormir ", "a fazer", "12 horas"));
        listaTarefas.add(new Tarefa(10,"Estudar GitHub ", "a fazer", " 2 horas"));
        listaTarefas.add(new Tarefa(11,"Implementar o app no sqLite ", "a fazer", "2 horas"));
        listaTarefas.add(new Tarefa(12,"Escrever ", "a fazer", " 2 horas"));
        listaTarefas.add(new Tarefa(13,"Estudar Java ", "a fazer", " 2 horas"));
        listaTarefas.add(new Tarefa(14,"Estudar Ingês ", "a fazer", " 2 horas"));
        listaTarefas.add(new Tarefa(15,"Dormir ", "a fazer", " 2 horas"));
        listaTarefas.add(new Tarefa(16,"Ganhar 10 mil ", "a fazer", " 1 hora"));
        return listaTarefas;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            List<Tarefa> lista = CarregaLista();

            TarefaAdapter tad = new TarefaAdapter(lista, this);
            listView = (ListView) findViewById(R.id.listview);
            listView.setAdapter(tad);
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
