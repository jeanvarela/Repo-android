package br.com.listviewadapterviewholder;

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


        ViewHolder holder = null;
        if (view == null) {

            view = LayoutInflater.from(contexto).inflate(R.layout.item, null);

            holder = new ViewHolder();
            holder.txtNome = (TextView) view.findViewById(R.id.txtNome);
            holder.txtIdade = (TextView) view.findViewById(R.id.txtIdade);
            view.setTag(holder);
        }else{
            holder = (ViewHolder)view.getTag();
        }

        holder.txtNome.setText(pessoa.getNome());
        holder.txtIdade.setText(pessoa.getIdade());

        return view;
    }

    static class  ViewHolder{
        TextView txtNome;
        TextView txtIdade;
    }
}