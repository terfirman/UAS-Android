package com.gebot.splash;

public class konfigurasi {

    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD="http://192.168.188.1/gebot/uas/tambahPgw.php";
    public static final String URL_GET_ALL = "http://192.168.188.1/gebot/uas/tampilSemua.php";
    public static final String URL_GET_EMP = "http://192.168.188.1/gebot/uas/tampilhaji.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.168.188.1/gebot/uas/update.php";
    public static final String URL_DELETE_EMP = "http://192.168.188.1/gebot/uas/delet.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "nama";
    public static final String KEY_EMP_NO_HP = "no_hp"; //no_hp itu variabel untuk no hp
    public static final String KEY_EMP_ALAMAT = "alamat"; //alamat itu variabel untuk alamat
    public static final String KEY_EMP_JENIS_KELAMIN = "jenis_kelamin"; //jk itu variabel untuk jk

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_NO_HP = "no_hp";
    public static final String TAG_ALAMAT = "alamat";
    public static final String TAG_JENIS_KELAMIN = "jenis_kelamin";

    //ID haji
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}
