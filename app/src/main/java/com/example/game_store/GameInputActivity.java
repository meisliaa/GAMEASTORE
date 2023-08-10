package com.example.game_store;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class GameInputActivity extends AppCompatActivity implements View.OnClickListener{

    //Dibawah ini merupakan perintah untuk mendefinikan View
    private EditText editTextName;
    private EditText editTextBig;
    private EditText editTextUnit;
    private EditText editTextRate;
    private EditText editTextPub;
    private EditText editTextDesk;

    private Button buttonAdd;
    private Button buttonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_input);

        //Inisialisasi dari View
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextBig = (EditText) findViewById(R.id.editTextBig);
        editTextUnit = (EditText) findViewById(R.id.editTextUnit);
        editTextRate = (EditText) findViewById(R.id.editTextRate);
        editTextPub = (EditText) findViewById(R.id.editTextPub);
        editTextDesk = (EditText) findViewById(R.id.editTextDesk);

        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonView = (Button) findViewById(R.id.buttonView);

        //Setting listeners to button
        buttonAdd.setOnClickListener(this);
        buttonView.setOnClickListener(this);
    }


    //Dibawah ini merupakan perintah untuk Menambahkan Pegawai (CREATE)
    private void addGame(){

        final String name = editTextName.getText().toString().trim();
        final String big = editTextBig.getText().toString().trim();
        final String unit = editTextUnit.getText().toString().trim();
        final String rate = editTextRate.getText().toString().trim();
        final String pub = editTextPub.getText().toString().trim();
        final String desk = editTextDesk.getText().toString().trim();

        class AddGame extends AsyncTask<Void,Void,String>{
            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(GameInputActivity.this,"Menambahkan...","Tunggu...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(GameInputActivity.this,s,Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... v) {
                HashMap<String,String> params = new HashMap<>();
                params.put(konfigurasi.KEY_EMP_NAME, name);
                params.put(konfigurasi.KEY_EMP_BIG, big);
                params.put(konfigurasi.KEY_EMP_UNIT, unit);
                params.put(konfigurasi.KEY_EMP_RATING, rate);
                params.put(konfigurasi.KEY_EMP_PUB, pub);
                params.put(konfigurasi.KEY_EMP_DESK,desk);

                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(konfigurasi.URL_ADD, params);
                return res;
            }
        }

        AddGame ae = new AddGame();
        ae.execute();
    }

    @Override
    public void onClick(View v) {
        if(v == buttonAdd){
            addGame();
        }

        if(v == buttonView){
            startActivity(new Intent(this, MainActivity.class));
        }
    }
}