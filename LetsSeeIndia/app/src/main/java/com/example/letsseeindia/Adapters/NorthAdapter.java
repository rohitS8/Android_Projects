package com.example.letsseeindia.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.letsseeindia.Models.NorthModel;
import com.example.letsseeindia.R;

import java.util.ArrayList;

public class NorthAdapter extends RecyclerView.Adapter<NorthAdapter.viewHolder> {

    ArrayList<NorthModel> list;
    Context context;

    public NorthAdapter(ArrayList<NorthModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.samplenorthlayour,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        NorthModel model = list.get(position);

        holder.imgPlace.setImageResource(model.getPic());
        holder.txtName.setText(model.getName());
        holder.imgShare.setImageResource(model.getShare());

        switch (position){
            case 0:

                String place = model.getName();
                String link = "https://www.tripadvisor.in/Tourism-g304555-Jaipur_Jaipur_District_Rajasthan-Vacations.html";

                holder.imgPlace.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(link));
                        context.startActivity(intent);
                    }
                });

                holder.txtName.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(link));
                        context.startActivity(intent);
                    }
                });

                holder.imgShare.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_TEXT, "Let's go for a trip to "+place+"\nHere is the link to the full details: "+link);
                        intent.setType("text/plain");
                        context.startActivity(Intent.createChooser(intent, "Send to"));
                    }
                });
                break;

            case 1:

                place = model.getName();
                link = "https://www.makemytrip.com/tripideas/blog/himachal-pradesh-quick-travel-guide";

                holder.imgPlace.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(link));
                        context.startActivity(intent);
                    }
                });

                holder.txtName.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(link));
                        context.startActivity(intent);
                    }
                });

                holder.imgShare.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_TEXT, "Let's go for a trip to "+place+"\nHere is the link to the full details: "+link);
                        intent.setType("text/plain");
                        context.startActivity(Intent.createChooser(intent, "Send to"));
                    }
                });
                break;

            case 2:

                place = model.getName();
                link = "https://www.tripadvisor.in/Tourism-g1045172-Kausani_Bageshwar_District_Uttarakhand-Vacations.html";

                holder.imgPlace.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(link));
                        context.startActivity(intent);
                    }
                });

                holder.txtName.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(link));
                        context.startActivity(intent);
                    }
                });

                holder.imgShare.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_TEXT, "Let's go for a trip to "+place+"\nHere is the link to the full details: "+link);
                        intent.setType("text/plain");
                        context.startActivity(Intent.createChooser(intent, "Send to"));
                    }
                });
                break;

            default:
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView imgPlace;
        ImageView imgShare;
        TextView txtName;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imgPlace = itemView.findViewById(R.id.imgPlace);
            imgShare = itemView.findViewById(R.id.imgShare);
            txtName = itemView.findViewById(R.id.txtName);

        }
    }
}
