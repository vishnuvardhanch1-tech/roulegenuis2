package com.roulegenuis;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class HotColdAdapter extends RecyclerView.Adapter<HotColdAdapter.VH> {
    private final List<String> nums;
    public HotColdAdapter(List<String> nums){ this.nums = nums; }

    @Override public VH onCreateViewHolder(ViewGroup p, int v){
        View view = LayoutInflater.from(p.getContext())
                .inflate(R.layout.item_hotcold, p, false);
        return new VH(view);
    }

    @Override public void onBindViewHolder(VH h, int pos){
        h.tv.setText(nums.get(pos));
    }

    @Override public int getItemCount(){ return nums.size(); }

    static class VH extends RecyclerView.ViewHolder{
        TextView tv;
        VH(View v){ super(v); tv = v.findViewById(R.id.tvNumber); }
    }
}
