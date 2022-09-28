package com.bonatti.alertnews.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bonatti.alertnews.R;
import com.bonatti.alertnews.model.entity.CardNoticia;
import com.bonatti.alertnews.model.entity.Noticia;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        List<CardNoticia> cardNoticiaList = new ArrayList<>();
        cardNoticiaList.add(new CardNoticia(1, "SAÚDE & BEM-ESTAR", "A newslatter que traz os melhores conteúdos " +
                "do Estadão sobre vida saudável, inscreva-se para receber por e-mail.", "Segundo a Organização Mundial de Saúde (OMS), " +
                "saúde pode ser definida como “um estado de completo bem-estar físico, mental e social, e não apenas a ausência de doença ou enfermidades”. Sendo assim, " +
                "não basta apenas estar sem nenhuma doença, é necessário estar bem consigo mesmo e com o corpo, sem sentir dores ou até mesmo tristeza.", "Priscila Mengue", "15:31", "20 de Setembro de 2022"));
        cardNoticiaList.add(new CardNoticia(2, "ELIANE CANTANHÊDE", "A newslatter que traz os melhores conteúdos " +
                "do Estadão sobre vida saudável, inscreva-se para receber por e-mail.", "Segundo a Organização Mundial de Saúde (OMS), " +
                "saúde pode ser definida como “um estado de completo bem-estar físico, mental e social, e não apenas a ausência de doença ou enfermidades”. Sendo assim, " +
                "não basta apenas estar sem nenhuma doença, é necessário estar bem consigo mesmo e com o corpo, sem sentir dores ou até mesmo tristeza.", "Priscila Mengue", "15:31", "20 de Setembro de 2022"));
        cardNoticiaList.add(new CardNoticia(3, "ESTADÃO VERIFICA", "A newslatter que traz os melhores conteúdos " +
                "do Estadão sobre vida saudável, inscreva-se para receber por e-mail.", "Segundo a Organização Mundial de Saúde (OMS), " +
                "saúde pode ser definida como “um estado de completo bem-estar físico, mental e social, e não apenas a ausência de doença ou enfermidades”. Sendo assim, " +
                "não basta apenas estar sem nenhuma doença, é necessário estar bem consigo mesmo e com o corpo, sem sentir dores ou até mesmo tristeza.",
                "Priscila Mengue", "15:31", "20 de Setembro de 2022"));
        cardNoticiaList.add(new CardNoticia(4, "DESASTRE NA GRANDE SP", "A newslatter que traz os melhores conteúdos " +
                "do Estadão sobre vida saudável, inscreva-se para receber por e-mail.", "Segundo a Organização Mundial de Saúde (OMS), " +
                "saúde pode ser definida como “um estado de completo bem-estar físico, mental e social, e não apenas a ausência de doença ou enfermidades”. Sendo assim, " +
                "não basta apenas estar sem nenhuma doença, é necessário estar bem consigo mesmo e com o corpo, sem sentir dores ou até mesmo tristeza.",
                "Priscila Mengue", "15:31", "20 de Setembro de 2022"));
        cardNoticiaList.add(new CardNoticia(5, "A SAGA EIKE BATISTA", "A newslatter que traz os melhores conteúdos " +
                "do Estadão sobre vida saudável, inscreva-se para receber por e-mail.", "Segundo a Organização Mundial de Saúde (OMS), " +
                "saúde pode ser definida como “um estado de completo bem-estar físico, mental e social, e não apenas a ausência de doença ou enfermidades”. Sendo assim, " +
                "não basta apenas estar sem nenhuma doença, é necessário estar bem consigo mesmo e com o corpo, sem sentir dores ou até mesmo tristeza.",
                "Priscila Mengue", "15:31", "20 de Setembro de 2022"));
        cardNoticiaList.add(new CardNoticia(6, "SAÚDE & BEM-ESTAR", "A newslatter que traz os melhores conteúdos " +
                "do Estadão sobre vida saudável, inscreva-se para receber por e-mail.", "Segundo a Organização Mundial de Saúde (OMS), " +
                "saúde pode ser definida como “um estado de completo bem-estar físico, mental e social, e não apenas a ausência de doença ou enfermidades”. Sendo assim, " +
                "não basta apenas estar sem nenhuma doença, é necessário estar bem consigo mesmo e com o corpo, sem sentir dores ou até mesmo tristeza.",
                "Priscila Mengue", "15:31", "20 de Setembro de 2022"));
        cardNoticiaList.add(new CardNoticia(7, "SAÚDE & BEM-ESTAR", "A newslatter que traz os melhores conteúdos " +
                "do Estadão sobre vida saudável, inscreva-se para receber por e-mail.", "Segundo a Organização Mundial de Saúde (OMS), " +
                "saúde pode ser definida como “um estado de completo bem-estar físico, mental e social, e não apenas a ausência de doença ou enfermidades”. Sendo assim, " +
                "não basta apenas estar sem nenhuma doença, é necessário estar bem consigo mesmo e com o corpo, sem sentir dores ou até mesmo tristeza.",
                "Priscila Mengue", "15:31", "20 de Setembro de 2022"));
        cardNoticiaList.add(new CardNoticia(8, "SAÚDE & BEM-ESTAR", "A newslatter que traz os melhores conteúdos " +
                "do Estadão sobre vida saudável, inscreva-se para receber por e-mail.", "Segundo a Organização Mundial de Saúde (OMS), " +
                "saúde pode ser definida como “um estado de completo bem-estar físico, mental e social, e não apenas a ausência de doença ou enfermidades”. Sendo assim, " +
                "não basta apenas estar sem nenhuma doença, é necessário estar bem consigo mesmo e com o corpo, sem sentir dores ou até mesmo tristeza.",
                "Priscila Mengue", "15:31", "20 de Setembro de 2022"));


        CardNoticiaListViewAdapter adapter = new CardNoticiaListViewAdapter(cardNoticiaList);

        ListView listViewCardNoticia = findViewById(R.id.list_view_card_noticia);
        listViewCardNoticia.setAdapter(adapter);

        listViewCardNoticia.setClickable(true);
        listViewCardNoticia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(HomeActivity.this, NoticiaActivity.class);

                intent.putExtra("titulo", cardNoticiaList.get(i).getTitulo());
                intent.putExtra("resumo", cardNoticiaList.get(i).getResumo());
                intent.putExtra("texto", cardNoticiaList.get(i).getTexto());
                intent.putExtra("autor", cardNoticiaList.get(i).getAutor());
                intent.putExtra("hora", cardNoticiaList.get(i).getHora());
                intent.putExtra("data", cardNoticiaList.get(i).getData());
                startActivity(intent);
            }
        });
    }
}
