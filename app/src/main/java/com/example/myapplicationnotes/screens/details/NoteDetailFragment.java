package com.example.myapplicationnotes.screens.details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplicationnotes.R;
import com.example.myapplicationnotes.model.Note;

import java.time.Instant;

public class NoteDetailFragment extends Fragment {

    private static final String EXTRA_NOTE = "NoteDetailFragment.EXTRA_NOTE";
    private int index;

    Note note;

    //метод для вызова фрагмента

    public static NoteDetailFragment newInstance(int index){
        NoteDetailFragment f = new NoteDetailFragment();
    }


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_note_detail, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setContentView(R.layout).fragment_note_details

        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(NoteDetailFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }
}