package br.com.listviewadapterviewholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lista = new ListView(this);
        setContentView(lista);

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("Pessoa1","1"));
        pessoas.add(new Pessoa("Pessoa2","2"));
        pessoas.add(new Pessoa("Pessoa3","3"));
        pessoas.add(new Pessoa("Pessoa4","4"));
        pessoas.add(new Pessoa("Pessoa1","5"));
        pessoas.add(new Pessoa("Pessoa2","6"));
        pessoas.add(new Pessoa("Pessoa3","7"));
        pessoas.add(new Pessoa("Pessoa4","8"));
        pessoas.add(new Pessoa("Pessoa1","9"));
        pessoas.add(new Pessoa("Pessoa2","10"));
        pessoas.add(new Pessoa("Pessoa3","11"));
        pessoas.add(new Pessoa("Pessoa4","12"));
        pessoas.add(new Pessoa("Pessoa3","13"));
        pessoas.add(new Pessoa("Pessoa4","14"));
        pessoas.add(new Pessoa("Pessoa3","15"));
        pessoas.add(new Pessoa("Pessoa4","16"));
        pessoas.add(new Pessoa("Pessoa3","17"));
        pessoas.add(new Pessoa("Pessoa4","18"));

        PessoaAdapter adapter = new PessoaAdapter(this,pessoas);
        lista.setAdapter(adapter);
    }
}