package com.example.gymlog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CustomViewHolder> {

    Context context;
    ArrayList<WorkoutName> workoutNames;

    public RecyclerViewAdapter(Context context, ArrayList<WorkoutName> workoutNames) {
        this.context = context;
        this.workoutNames = workoutNames;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.rv_row_workout_plan, parent, false);
        return new RecyclerViewAdapter.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.CustomViewHolder holder, int position) {
        holder.workoutName.setText(workoutNames.get(position).workoutName);
    }

    @Override
    public int getItemCount() {
        return workoutNames.size();
    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView workoutName;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            workoutName = itemView.findViewById(R.id.tv_workout_name);
        }
    }
}
