package com.example.fragtable.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fragtable.R;
import com.example.fragtable.model.GridItem01;
import com.example.fragtable.server.ImageLoadTask;
import com.example.fragtable.server.myTask;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {
    private Context context;
    ArrayList<GridItem01> gridItemList = new ArrayList<GridItem01>();

    public ImageView img;
    public TextView name;
    public TextView price;

    public GridAdapter(Context context) {
        this.context = context;
    }

    public void addItem(GridItem01 item){ gridItemList.add(item); }

    @Override
    public int getCount() { return gridItemList.size(); }

    @Override
    public Object getItem(int position) { return gridItemList.get(position); }

    @Override
    public long getItemId(int position) { return position; }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null){
            LayoutInflater inf = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inf.inflate(R.layout.grid_item_layout, parent, false);
        }

        img = view.findViewById(R.id.food_image);
        name = view.findViewById(R.id.food_name);
        price = view.findViewById(R.id.food_price);


        img.setImageBitmap(gridItemList.get(position).bit);
        name.setText(gridItemList.get(position).name);
        price.setText(gridItemList.get(position).price);

        return view;
    }

    public void setImg(ImageView img) {
        this.img = img;
    }

    public ImageView getImg() {
        return img;
    }
}
