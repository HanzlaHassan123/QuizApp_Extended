package com.example.gamingapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.gamingapp.HistorStringModel;
import com.example.gamingapp.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    ArrayList<HistorStringModel>historStringModels;

    public MyAdapter(ArrayList<HistorStringModel> historStringModels) {
        this.historStringModels=historStringModels;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items_list, null);

        // create ViewHolder

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

       viewHolder.count_holder.setText("Count of correct answers = "+this.historStringModels.get(position).getCount());
       viewHolder.correct_answer.setText(this.historStringModels.get(position).getRigths());
       viewHolder.your_answers.setText(this.historStringModels.get(position).getYours());



    }

    // inner class to hold a reference to each item of RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView correct_answer,your_answers,count_holder;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
           correct_answer=itemLayoutView.findViewById(R.id.correct_answers);
           your_answers=itemLayoutView.findViewById(R.id.your_answers);
           count_holder=itemLayoutView.findViewById(R.id.count_holder);
        }
    }


    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return this.historStringModels.size();
    }
}