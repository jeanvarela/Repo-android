package br.com.listviewadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by JEAN on 11/05/2017.
 */

public class PessoaAdapter extends BaseAdapter {

    private Context contexto;
    private List<Pessoa> pessoas;

    public PessoaAdapter(Context context, List<Pessoa> pessoas){
        this.contexto = context;
        this.pessoas = pessoas;
    }

    @Override
    public int getCount() {
        return pessoas.size();
    }

    @Override
    public Object getItem(int position) {
        return pessoas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        Pessoa pessoa = pessoas.get(position);

        View linha = LayoutInflater.from(contexto).inflate(R.layout.item,null);

        TextView txtNome = (TextView) linha.findViewById(R.id.txtNome);
        TextView txtIdade = (TextView) linha.findViewById(R.id.txtIdade);

        txtNome.setText(pessoa.getNome());
        txtIdade.setText(pessoa.getIdade());

        return linha;
    }
}
