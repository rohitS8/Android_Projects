package com.example.tiktokclone;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tiktokclone.databinding.ReeldesignBinding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.VideoHolder> {

    Context context;
    ArrayList<Model> modelArrayList = new ArrayList<>(); //We want array list as the Model class
    boolean isPlaying = false;

    ImageView imgButton;

    public Adapter(Context context, ArrayList<Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public VideoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.reeldesign,parent,false);
        return new VideoHolder(view); //passing the view in the view holder
    }

    @Override
    public void onBindViewHolder(@NonNull VideoHolder holder, int position) {

        //binding each views with view holders
        holder.binding.videoView.setVideoPath(modelArrayList.get(position).getVideoUrl());
        //though here giving video from drawable then using video path
        holder.binding.txtname.setText(modelArrayList.get(position).getName());
        holder.binding.imgProfile.setImageResource(modelArrayList.get(position).getProfile());
        holder.binding.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
                isPlaying = true;
            }
        });
        holder.binding.videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.start();
                isPlaying = true;
            }
        });
        holder.binding.videoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlaying){
                    holder.binding.videoView.pause();
                    holder.binding.imgButton.setVisibility(View.VISIBLE);
                    holder.binding.imgButton.setImageResource(R.drawable.play);
                    isPlaying = false;
                }else {
                    holder.binding.videoView.start();
                    holder.binding.imgButton.setVisibility(View.INVISIBLE);
                    isPlaying = true;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelArrayList.size(); //item count will be equal with the size of list
    }

    public class VideoHolder extends RecyclerView.ViewHolder{

        ReeldesignBinding binding;

        public VideoHolder(@NonNull View itemView) {
            super(itemView);
            binding = ReeldesignBinding.bind(itemView);

        }
    }
}
