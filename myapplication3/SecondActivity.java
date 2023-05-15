package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private List<Plants> plants;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.recycler);

        PlantsAdapter adapter = new PlantsAdapter(plants, this);

        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {

        plants = new ArrayList<>();
        plants.add(new Plants("Роза", "Собирательное название видов и сортов представителей рода Шиповник. В большинстве случаев розы теплолюбивы, но есть виды, растущие в условиях сурового климата. Розы предпочитают яркое освещение и при значительном затенении почти или совсем не цветут.",
                R.drawable.roza, ""));
        plants.add(new Plants("Пион", "Род травянистых многолетников и листопадных кустарников. Пионы цветут в конце весны, ценятся садоводами за пышную листву, эффектные цветы и декоративные плоды.",
                R.drawable.pion, ""));
        plants.add(new Plants("Одуванчик", "Род многолетних травянистых растений семейства Астровые, или Сложноцветные. Распространены во внетропических областях обоих полушарий, за исключением высокогорных районов и Арктических широт.",
                R.drawable.odyvanchik1, ""));
        plants.add(new Plants("Анемона", "Осеннецветущий вид многолетних цветковых растений рода Ветреница, или Анемона семейства Лютиковые. Растёт в светлых горных лесах среди кустарников на сухих солнечных местах.",
                R.drawable.anemon, ""));
        plants.add(new Plants("Мак", "Род травянистых растений семейства Маковые. Мак встречается в умеренной, субтропической и реже в холодных зонах. Большинство маков растёт в засушливых местах — степях, полупустынях, пустынях, сухих каменистых склонах гор.",
                R.drawable.mak, ""));    }
}