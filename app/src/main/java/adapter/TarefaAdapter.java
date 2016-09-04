package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.oslourencos.apptarefas.R;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import to.Tarefa;

/**
 * Created by sao on 27/08/2016.
 */
public class TarefaAdapter extends BaseAdapter{

    private final List<Tarefa> listaTarefas;
    private final Context context;

    public TarefaAdapter(List<Tarefa> listaTarefas, Context context) {
        this.listaTarefas = listaTarefas;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listaTarefas.size();
    }

    @Override
    public Object getItem(int position) {
        return listaTarefas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listaTarefas.get(position).getCodigo();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Tarefa t = listaTarefas.get(position);

        LayoutInflater inflar =  (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflar.inflate(R.layout.item_lista, null);

        TextView txtcod = (TextView)v.findViewById(R.id.editcodigo);
        TextView txtdesc = (TextView) v.findViewById(R.id.editDescricao);
        TextView txtduracao = (TextView) v.findViewById(R.id.editDuracao);
        TextView txtstatus = (TextView) v.findViewById(R.id.editStatus);

        txtcod.setText(toString().valueOf(t.getCodigo()));
        txtdesc.setText(t.getDescricao());
        txtduracao.setText(t.getDuracao());
        txtstatus.setText(t.getStatus());

        return v;
    }
}
