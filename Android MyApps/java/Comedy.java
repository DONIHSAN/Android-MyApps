package com.example.sayhello;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Comedy extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_comedy, container, false);


        view.findViewById(R.id.btnWatch).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                navigateToAnotherActivity();
            }
        });

        return view;
    }

    private void navigateToAnotherActivity() {
        Intent intentMovie = new Intent(requireContext(), VideoComedy.class);
        startActivity(intentMovie);
    }
}
