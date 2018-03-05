package com.example.davidsantos.sorteiatime;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class MeuAdaptador extends ArrayAdapter {

    public MeuAdaptador(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @Override
    public void add(@Nullable Object object) {
        super.add(object);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View minhaView;
        minhaView = convertView;
        ViewSorteio viewSorteio;

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            minhaView = inflater.inflate(R.layout.minha_celula,parent,false);

            viewSorteio = new ViewSorteio();
            viewSorteio.time = (ImageView) minhaView.findViewById(R.id.imgTimeInList);
            viewSorteio.texto = (TextView) minhaView.findViewById(R.id.txtInList);

            minhaView.setTag(viewSorteio);

        }else {
            viewSorteio = (ViewSorteio) minhaView.getTag();
        }

        Sorteio sorteio;
        sorteio = (Sorteio) this.getItem(position);

        viewSorteio.time.setImageResource(sorteio.getTime());
        viewSorteio.texto.setText(sorteio.getTexto());

        return minhaView;
    }
}