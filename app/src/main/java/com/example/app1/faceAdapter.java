package com.example.app1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class faceAdapter extends RecyclerView.Adapter<faceAdapter.ViewHolder> {

    private List<user> faceList;
    private oncallback mlistener;
    public faceAdapter(oncallback mlistener, List<user> listFace){
        this.faceList = listFace;
        this.mlistener = mlistener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.user,parent,false);

        return new ViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        user face = faceList.get(position);
        holder.ivavata.setImageResource(face.getAnh());
        holder.txtname.setText(face.getTen());

    }

    @Override
    public int getItemCount() {
        return faceList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivavata;
        TextView txtname;
        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            ivavata = (ImageView) itemView.findViewById(R.id.img);
            txtname = (TextView) itemView.findViewById(R.id.txtname);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mlistener.onitemclick(getPosition());
                }
            });
        }
    }

    public  interface oncallback{
        void onitemclick(int position);
    }
}
