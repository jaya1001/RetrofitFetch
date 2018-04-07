package com.example.android.taskfirst;

/**
 * Created by User on 4/6/2018.
 */

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.io.Serializable;
import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> implements Serializable {
    private ArrayList<ApiImage> image;

    static Context context;

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        private ImageView tv_name;

        public ViewHolder(View view) {
            super(view);
            context = view.getContext();
            tv_name = (ImageView) view.findViewById(R.id.image);

            tv_name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String s = image.get(getLayoutPosition()).getApi();
                    Intent mainIntent = new Intent(context, fullImage.class);
                    mainIntent.putExtra("BUNDLE", s);
                    context.startActivity(mainIntent);
                }
            });
        }
    }

    public DataAdapter(ArrayList<ApiImage> image) {
        this.image = image;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.image_list, viewGroup, false);
        context = view.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        Glide.with(context)
                .load(image.get(i).getApi())
                .apply(new RequestOptions().override(400,400))
                .into(viewHolder.tv_name);
    }

    @Override
    public int getItemCount() {
        return image.size();
    }

}