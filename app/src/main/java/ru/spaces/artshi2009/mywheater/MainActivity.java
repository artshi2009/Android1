package ru.spaces.artshi2009.mywheater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            getResources().getString(R.string.textTemp, Integer.toString(2));
        }catch (Exception ex){
            Log.d("ya)", String.valueOf(ex));
        }

    }

    @Override
    protected void onStart() {
        logging("старт");
        super.onStart();
    }

    @Override
    protected void onResume() {
        logging("продолжить");
        super.onResume();
    }

    @Override
    protected void onPause() {
        logging("пауза");
        super.onPause();
    }

    @Override
    protected void onStop() {
        logging("стоп");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        logging("рестарт");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        logging("активити удалена из памяти");
        super.onDestroy();
    }

    void logging(String msg){
        Log.d("life", msg);
    }

}
