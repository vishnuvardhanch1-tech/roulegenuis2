package com.roulegenuis;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.VH> {
    private final List<String> list;
    public HistoryAdapter(List<String> l){ this.list = l; }

    @Override public VH onCreateViewHolder(ViewGroup p, int v){
        View view = LayoutInflater.from(p.getContext())
                .inflate(R.layout.item_history, p, false);
        return new VH(view);
    }

    @Override public void onBindViewHolder(VH h, int pos){
        h.tv.setText(list.get(pos));
    }

    @Override public int getItemCount(){ return list.size(); }

    static class VH extends RecyclerView.ViewHolder{
        TextView tv;
        VH(View v){ super(v); tv = v.findViewById(R.id.tvHistoryNumber); }
    }
}
