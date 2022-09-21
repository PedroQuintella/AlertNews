package com.bonatti.alertnews.controller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import androidx.annotation.Nullable;
import com.bonatti.alertnews.R;
import com.bonatti.alertnews.model.entity.CardNoticia;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        List<CardNoticia> cardNoticiaList = new ArrayList<>();
        cardNoticiaList.add(new CardNoticia(1, "SAÚDE & BEM-ESTAR", "A newslatter que traz os melhores conteúdos " +
                "do Estadão sobre vida saudável, inscreva-se para receber por e-mail.", "15:31"));
        cardNoticiaList.add(new CardNoticia(2, "ELIANE CANTANHÊDE", "A newslatter que traz os melhores conteúdos " +
                "do Estadão sobre vida saudável, inscreva-se para receber por e-mail.", "15:31"));
        cardNoticiaList.add(new CardNoticia(3, "ESTADÃO VERIFICA", "A newslatter que traz os melhores conteúdos " +
                "do Estadão sobre vida saudável, inscreva-se para receber por e-mail.", "15:31"));

        CardNoticiaListViewAdapter adapter = new CardNoticiaListViewAdapter(cardNoticiaList);

        ListView listViewCardNoticia = findViewById(R.id.list_view_card_noticia);
        listViewCardNoticia.setAdapter(adapter);

    }
}
