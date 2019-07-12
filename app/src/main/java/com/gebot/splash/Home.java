package com.gebot.splash;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.HashMap;


public class Home extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextNama;
    private EditText editTextNo_Hp;
    private EditText editTextAlamat;
    private EditText editTextJenis_Kelamin;

    private Button buttonAdd;
    private Button buttonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Inisialisasi dari View
        editTextNama = (EditText) findViewById(R.id.editTextNama);
        editTextNo_Hp = (EditText) findViewById(R.id.editTextNo_Hp);
        editTextAlamat = (EditText) findViewById(R.id.editTextAlamat);
        editTextJenis_Kelamin = (EditText) findViewById(R.id.editTextJk);

        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonView = (Button) findViewById(R.id.buttonView);

        //Setting listeners to button
        buttonAdd.setOnClickListener(this);
        buttonView.setOnClickListener(this);
    }

    private void addEmployee() {
        final String nama = editTextNama.getText().toString().trim();
        final String no_hp = editTextNo_Hp.getText().toString().trim();
        final String alamat = editTextAlamat.getText().toString().trim();
        final String jenis_kelamin = editTextJenis_Kelamin.getText().toString().trim();

        class AddEmployee extends AsyncTask<Void, Void, String> {

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(Home.this, "Menambahkan...", "Tunggu...", false, false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(Home.this, s, Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... v) {
                HashMap<String, String> params = new HashMap<>();
                params.put(konfigurasi.KEY_EMP_NAMA, nama);
                params.put(konfigurasi.KEY_EMP_NO_HP, no_hp);
                params.put(konfigurasi.KEY_EMP_ALAMAT, alamat);
                params.put(konfigurasi.KEY_EMP_JENIS_KELAMIN, jenis_kelamin);

                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(konfigurasi.URL_ADD, params);
                return res;
            }


        }
        AddEmployee ae = new AddEmployee();
        ae.execute();

    }
    @Override
    public void onClick(View v){
        if (v == buttonAdd){
            addEmployee();
        }
        if (v == buttonView){
            startActivity(new Intent(this,tampilsemua.class));
        }
    }

}
