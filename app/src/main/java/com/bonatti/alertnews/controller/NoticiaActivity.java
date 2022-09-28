package com.bonatti.alertnews.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bonatti.alertnews.R;
import com.bonatti.alertnews.model.entity.CardNoticia;
import com.bonatti.alertnews.model.entity.Noticia;

import java.util.ArrayList;
import java.util.List;

public class NoticiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noticia);
        Intent intent = this.getIntent();

        if(intent != null ) {
            String titulo = intent.getStringExtra("titulo");
            String resumo = intent.getStringExtra("resumo");
            String texto = intent.getStringExtra("texto");
            String autor = intent.getStringExtra("autor");
            String hora = intent.getStringExtra("hora");
            String data = intent.getStringExtra("data");

            TextView tituloNoticia = findViewById(R.id.text_view_titulo_noticia);
            TextView resumoNoticia = findViewById(R.id.text_view_resumo_noticia);
            TextView textoNoticia = findViewById(R.id.text_view_texto_noticia);
            TextView autorNoticia = findViewById(R.id.text_view_autor_noticia);
            TextView dataNoticia = findViewById(R.id.text_view_data_noticia);
            TextView horaNoticia = findViewById(R.id.text_view_hora_noticia);
            tituloNoticia.setText(titulo);
            resumoNoticia.setText(resumo);
            textoNoticia.setText(texto);
            autorNoticia.setText(autor);
            dataNoticia.setText(data);
            horaNoticia.setText(hora);
        }

    }
}
