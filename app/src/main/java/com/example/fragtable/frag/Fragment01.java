package com.example.fragtable.frag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.fragtable.R;
import com.example.fragtable.server.ImageLoadTask;


public class Fragment01 extends Fragment {

    //ImageView imageView;

    public Fragment01() { }

    @Override
    public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_01, null);
        //imageView = (ImageView) view.findViewById(R.id.view_image);

        //sendImageRequest();

        return view;
    }

/*    public void sendImageRequest() {
        String url = "https://i.pinimg.com/originals/c8/14/99/c814995b86a60232c93492f5c90c0570.jpg";
        ImageLoadTask task = new ImageLoadTask(url,imageView);
        task.execute();
    }*/
}
