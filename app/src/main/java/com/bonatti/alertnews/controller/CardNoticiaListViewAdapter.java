package com.bonatti.alertnews.controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.bonatti.alertnews.R;
import com.bonatti.alertnews.model.entity.CardNoticia;
import java.util.List;

public class CardNoticiaListViewAdapter extends BaseAdapter {

    private List<CardNoticia> cardNoticiaList;

    public CardNoticiaListViewAdapter(List<CardNoticia> cardNoticiaList) {
        this.cardNoticiaList = cardNoticiaList;
    }

    @Override
    public int getCount() {
        return this.cardNoticiaList.size();
    }

    @Override
    public Object getItem(int i) {
        return this.cardNoticiaList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return this.cardNoticiaList.get(i).getCodigo();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_noticia, viewGroup, false);
        }

        CardNoticia cardNoticia = (CardNoticia) getItem(i);
        TextView textViewTitulo = view.findViewById(R.id.text_view_titulo);
        textViewTitulo.setText(cardNoticia.getTitulo());
        TextView textViewResumo = view.findViewById(R.id.text_view_resumo);
        textViewResumo.setText(cardNoticia.getResumo());
        TextView textViewHora = view.findViewById(R.id.text_view_hora);
        textViewHora.setText(cardNoticia.getHora());

        return view;
    }
}
