package com.example.fragtable.server;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

public class ImageLoadTask extends AsyncTask<Bitmap,Void, Bitmap> {

    private String urlStr;
    //private ImageView imageView;
    private Bitmap bit;
    private Bitmap bitmap;

    private static HashMap<String, Bitmap> bitmapHash = new HashMap<String, Bitmap>();

    public ImageLoadTask(String urlStr) {
        this.urlStr = urlStr;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Bitmap doInBackground(Bitmap... img) {
        this.bit = img[0];
        URL url =null;
        try{
            url =new URL(urlStr);                  // 스트링 주소를 url 형식으로 변환
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();               // url에 접속 시도
            conn.connect();

            InputStream is = conn.getInputStream();      // 스트림 생성
            bitmap = BitmapFactory.decodeStream(is);     // 스트림에서 받은 데이터를 비트맵 변환.
            //bit=bitmap;
            //handler.sendEmptyMessage(0);          // 핸들러에게 화면 갱신 요청
            //Log.v("비트맵이 들어왔냐구???????", bit+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2");

            is.close();         // 연결 종료
            conn.disconnect();

        }catch (Exception e){
            e.printStackTrace();
        }
        return bitmap;
    }
    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
        bit=bitmap;
        Log.v("비트맵이 들어왔냐구???????", bit+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2");
        //imageView.setImageBitmap(bitmap);
        //imageView.invalidate();
    }
}


/*
*
*  Bitmap bitmap = null;
        try {
            if (bitmapHash.containsKey(urlStr)) {
                Bitmap oldbitmap = bitmapHash.remove(urlStr);
                if(oldbitmap != null) {
                    oldbitmap.recycle();
                    oldbitmap = null;
                }
            }
            URL url = new URL(urlStr);
            bitmap = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            bitmapHash.put(urlStr,bitmap);

        } catch (Exception e) {
            e.printStackTrace();
        }*/