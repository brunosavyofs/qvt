package com.catolica.qvt.qvt;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.catolica.qvt.qvt.noticias.NoticiasFragment;

public class TelaPrincipal extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            selectFragment(item);
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        //altera a cor do titulo do topo
        android.support.v7.widget.Toolbar actionBarToolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.action_bar);
        if (actionBarToolbar != null) {
            actionBarToolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.colorQVT));
            actionBarToolbar.setBackgroundColor(ContextCompat.getColor(this, R.color.colorAccent));
        }

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);

        // adiciona listener ao navigationView
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        // seleciona fragmento default
        selectFragment(navigation.getMenu().getItem(0));
    }

    protected void selectFragment(MenuItem item) {

        item.setChecked(true);

        switch (item.getItemId()) {
            case R.id.navigation_envio:
                pushFragment(new EnvioFragment());
                break;
            case R.id.navigation_meusdados:
                pushFragment(new MeusDadosFragment());
                break;
            case R.id.navigation_noticias:
                pushFragment(new NoticiasFragment());
                break;
        }
    }

    protected void pushFragment(Fragment fragment) {
        if (fragment == null)
            return;

        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            FragmentTransaction ft = fragmentManager.beginTransaction();
            if (ft != null) {
                ft.replace(R.id.content, fragment);
                ft.commit();
            }
        }
    }


}
