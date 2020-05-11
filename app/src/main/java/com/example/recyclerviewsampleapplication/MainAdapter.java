package com.example.recyclerviewsampleapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.RowId;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private List<MainActivity.RowData> rowDataList;

    public MainAdapter(List<MainActivity.RowData> rowDataList) {
        this.rowDataList = rowDataList;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_row, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        MainActivity.RowData rowData = rowDataList.get(position);
        holder.text1.setText(rowData.text1);
        holder.text2.setText(rowData.text2);
    }

    @Override
    public int getItemCount() {
        return rowDataList.size();
    }

    static class MainViewHolder extends RecyclerView.ViewHolder {
        TextView text1;
        TextView text2;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.textView);
            text2 = itemView.findViewById(R.id.textView2);
        }
    }
}
