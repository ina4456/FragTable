package com.example.fragtable.server;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.net.URL;
import java.util.HashMap;

// < >안에 들은 자료형은 순서대로 doInBackground, onProgressUpdate, onPostExecute의 매개변수 자료형을 뜻함.
// (사용할 매개변수타입을 설정하면된다)
//extends AsyncTask<Bitmap, Integer, Bitmap>
public class myTask {

   /* ImageView img;
    private String urlStr;
    private static HashMap<String, Bitmap> bitmapHash = new HashMap<String, Bitmap>();

    public myTask(ImageView img, String urlStr){
        this.img = img;
        this.urlStr = urlStr;
    }

    //초기화 단계에서 사용한다. 초기화관련 코드를 작성했다.
    protected void onPreExecute() {
        super.onPreExecute();
    }

    //스레드의 백그라운드 작업 구현
    //매개변수 Intger ... values : values란 이름의 Integer배열이라 생각하면된다.
    //배열이라 여러개를 받을 수 도 있다. ex) excute(100, 10, 20, 30); 이런식으로 전달 받으면 된다.
    protected Bitmap doInBackground(Bitmap ... values) {
        Bitmap bitmap = null;
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
        }

        return bitmap;
    }

    //UI작업 관련 작업 (백그라운드 실행중 이 메소드를 통해 UI작업을 할 수 있다)
    //publishProgress(value)의 value를 값으로 받는다.values는 배열이라 여러개 받기가능
    protected void onProgressUpdate(Integer ... values) {
        //img.setImageBitmap(bitmap.);
        //textView.setText("현재 진행 값 : " + values[0].toString());
    }

    //스레드에서 수행되던 작업이 종료되었을 때 호출
    protected void onPostExecute(Bitmap result) {
        img.setImageBitmap(result);
    }

    //Task가 취소되었을때 호출
    protected void onCancelled() {
        *//*progress.setProgress(0);
        textView.setText("취소되었습니다");*//*
    }*/
}
