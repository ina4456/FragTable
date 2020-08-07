package com.example.fragtable.frag;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.fragtable.R;
import com.example.fragtable.adapter.GridAdapter;
import com.example.fragtable.model.GridItem01;
import com.example.fragtable.server.ImageLoadTask;

import java.util.concurrent.ExecutionException;

public class Fragment02 extends Fragment {
    private Context mContext;
    //ImageView img;
    Bitmap bit;
    String url = "https://i.pinimg.com/originals/c8/14/99/c814995b86a60232c93492f5c90c0570.jpg";
    View view;

    public Fragment02() { }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_02, null);
        mContext=container.getContext();


        //img = (ImageView) view.findViewById(R.id.test_img);
        ImageLoadTask task = new ImageLoadTask(url);
        task.execute(bit);
        Log.v("비트맵이 들어왔냐구", bit+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2");

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        //그리드뷰
        GridView gv = (GridView)view.findViewById(R.id.view_gridview);
        GridAdapter gridAdapter = new GridAdapter (mContext);

        gridAdapter.addItem(new GridItem01("계란말이", "5000", bit));
        gridAdapter.addItem(new GridItem01("계란후라이", "2000", bit));
        gridAdapter.addItem(new GridItem01("계란볶음밥", "8000",bit));
        Log.v("비트맵이 들어왔냐구>>>>>>", bit+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2");

        gv.setAdapter(gridAdapter);  // 커스텀 아답타를 GridView 에 적용

    }
}
