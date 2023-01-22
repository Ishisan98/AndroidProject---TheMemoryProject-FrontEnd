package com.example.memory_game_ca;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context context;
    int images[];

    LayoutInflater inflater;

    public ImageAdapter(Context applicationContext, int[] images) {
        this.context = applicationContext;
        this.images = images;
        inflater = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return images.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.grid_item, null); // inflate the layout
        ImageView icon = (ImageView) view.findViewById(R.id.grid_image); // get the reference of ImageView
        icon.setImageResource(images[i]); // set logo images
        return view;
    }

}
