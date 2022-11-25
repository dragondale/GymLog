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

    private final RecycleViewerInterface recycleViewerInterface;

    Context context;
    ArrayList<WorkoutName> workoutNames;

    public RecyclerViewAdapter(Context context, ArrayList<WorkoutName> workoutNames, RecycleViewerInterface recycleViewerInterface) {
        this.context = context;
        this.workoutNames = workoutNames;
        this.recycleViewerInterface = recycleViewerInterface;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.rv_row_workout_plan, parent, false);
        return new RecyclerViewAdapter.CustomViewHolder(view, recycleViewerInterface);
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

        public CustomViewHolder(@NonNull View itemView, RecycleViewerInterface recycleViewerInterface) {
            super(itemView);
            workoutName = itemView.findViewById(R.id.tv_workout_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(recycleViewerInterface != null) {
                        int position = getAdapterPosition();

                        if(position != RecyclerView.NO_POSITION) {
                            recycleViewerInterface.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}
