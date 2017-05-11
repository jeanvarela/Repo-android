package br.com.activity.parametro.passagem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.com.activity.R;
import br.com.activity.telaPrincipal;

public class ActivityOrigem extends AppCompatActivity {

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_origem);

        botao = (Button) findViewById(R.id.botao);
    }


    private void chamaTela(){
        Intent intent = new Intent(this,telaPrincipal.class);
        startActivity(intent);
    }

    public void cadastro(View v){
        Toast.makeText(this,"Na tela de origem-------",Toast.LENGTH_LONG).show();
        chamaTela();
    }
}
