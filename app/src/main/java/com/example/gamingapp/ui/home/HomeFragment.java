package com.example.gamingapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.gamingapp.R;
import com.example.gamingapp.databinding.FragmentHomeBinding;

import org.w3c.dom.Text;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    TextView message_text,letter_text;
    Button root_btn,grass_btn,sky_btn,play_pause;
    int play_or_pause;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
      /*  HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
       // homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        */
        return inflater.inflate(R.layout.fragment_home,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view,@NonNull Bundle savedInstance){
        super.onViewCreated(view,savedInstance);

        root_btn=view.findViewById(R.id.root_button);
        play_pause=view.findViewById(R.id.play_pause);
        grass_btn=view.findViewById(R.id.grass_btn);
        sky_btn=view.findViewById(R.id.sky_btn);
        message_text=view.findViewById(R.id.message_text);

        play_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View insideView) {
                if(play_or_pause==1){
                    play_or_pause=0;
                    message_text.setText("game is finished now !");
                    play_pause.setText("Play");

                }else{
                    play_or_pause=1;
                    message_text.setText("Guess the letters and earn points ! Happy Gaming");
                    play_pause.setText("Finish");
                }
            }
        });
        root_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View inside_view) {
                message_text=view.findViewById(R.id.message_text);

                message_text.setText("Root am clicked now");
            }
        });

        sky_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message_text.setText("Sky is clicked now");
            }
        });

        grass_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message_text.setText("Grass is clicked now");
            }
        });

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}