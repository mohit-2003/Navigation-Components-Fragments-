package com.tgm.navigationcomponents;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentOne extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final NavController navController = Navigation.findNavController(view);
        Button button = view.findViewById(R.id.btnGo);
        button.setOnClickListener(view1 -> {
            navController.navigate(R.id.action_fragmentOne_to_fragmentTwo);
        });
        Button button2 = view.findViewById(R.id.btnGo2);
        button2.setOnClickListener(view1 ->
                navController.navigate(R.id.action_fragmentOne_to_fragmentThree));
    }
}