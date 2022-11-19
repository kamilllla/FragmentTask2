package com.example.frafments2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        // Используем транзакцию для добавления фрагмента
        // В рамках одной транзакции можно произвести
        // много операций по добавлению, замене и удалению фрагментов.
        // В конце требуется выполнить commit


        //
public void b1CLick(View view){
    //Создадим фрагмент
        FirstFragment firstFragment=new FirstFragment();
    // Создадим транзакцию
    FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
    // Нужно указать идентификтор лэйаута ,куда будет добавлен фрагмент
    transaction.replace(R.id.host,firstFragment);
    // Если хотим иметь возможность "откатить" транзакцию по кнопке Back,
    // нужно добавить ее в BackStack
    transaction.addToBackStack(null);
    // Завершим транзакцию
    transaction.commit();

        }
    public void b2CLick(View view){
        // Создадим транзакцию
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        // Нужно указать идентификтор лэйаута ,куда будет добавлен фрагмент
        transaction.replace(R.id.host,GenericFragment.newInstance(0x99FF0000,"Second"));
        // Если хотим иметь возможность "откатить" транзакцию по кнопке Back,
        // нужно добавить ее в BackStack
        transaction.addToBackStack(null);
        // Завершим транзакцию
        transaction.commit();

    }
    public void b3CLick(View view){
        // Создадим транзакцию
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        // Нужно указать идентификтор лэйаута ,куда будет добавлен фрагмент
        transaction.replace(R.id.host,GenericFragment.newInstance(0x9900FF00,"Third"));
        // Если хотим иметь возможность "откатить" транзакцию по кнопке Back,
        // нужно добавить ее в BackStack
        transaction.addToBackStack(null);
        // Завершим транзакцию
        transaction.commit();

    }






    }

// Так можно задать цвет:
// 0xccaabbcc
// Color.black

