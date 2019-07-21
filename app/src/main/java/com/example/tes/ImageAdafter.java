package com.example.tes;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdafter extends BaseAdapter {
    public Context ctx;
    public Integer [] gambar ={
            R.drawable.pria1, R.drawable.pria2,R.drawable.pria3,R.drawable.pria4,R.drawable.pria5
    };
    public ImageAdafter(Context ctx) {
        this.ctx=ctx;
    }

    @Override
    public int getCount() {
        return gambar.length;
    }

    @Override
    public Object getItem(int i) {
        return gambar[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(ctx);

        imageView.setImageResource(gambar[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(300,300));
return imageView;

    }
}
