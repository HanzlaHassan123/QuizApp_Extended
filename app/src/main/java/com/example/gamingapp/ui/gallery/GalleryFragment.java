package com.example.gamingapp.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.gamingapp.DBHelper;
import com.example.gamingapp.HistorStringModel;
import com.example.gamingapp.R;
import com.example.gamingapp.databinding.FragmentGalleryBinding;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    DBHelper dbHelper;
    //HistorStringModel historStringModel;
    TextView right_answers;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
      /*  GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGallery;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        */
        return inflater.inflate(R.layout.fragment_gallery,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view,@NonNull Bundle savedInstance) {
        super.onViewCreated(view, savedInstance);

        dbHelper=new DBHelper(view.getContext());
        ArrayList<HistorStringModel> historStringModels=dbHelper.GetHistory();


    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}