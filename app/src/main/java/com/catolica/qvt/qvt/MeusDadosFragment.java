package com.catolica.qvt.qvt;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.catolica.qvt.qvt.R;


/**
 * Created by bruno on 28/05/17.
 */

public class MeusDadosFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Dados do Usuário");
        return inflater.inflate(R.layout.meusdados_fragment, container, false);
    }

}
