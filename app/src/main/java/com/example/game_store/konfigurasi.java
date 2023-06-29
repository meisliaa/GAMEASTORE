package com.example.game_store;

public class konfigurasi {
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
      public static final String URL_ADD="http://192.168.1.9/Android/pegawai/tambahPgw.php";
      public static final String URL_GET_ALL = "http://192.168.1.9/Android/pegawai/tampilSemuaPgw.php";
      public static final String URL_GET_EMP = "http://192.168.1.9/Android/pegawai/tampilPgw.php?id=";
      public static final String URL_UPDATE_EMP = "http://192.168.1.9/Android/pegawai/updatePgw.php";
      public static final String URL_DELETE_EMP = "http://192.168.1.9/Android/pegawai/hapusPgw.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "nama";
    public static final String KEY_EMP_SIZE_BESAR = "size_besar";
    public static final String KEY_EMP_SIZE_UNIT = "size_unit";
    public static final String KEY_EMP_RATING = "rating";
    public static final String KEY_EMP_PUBLISHER = "publisher";
    public static final String KEY_EMP_DESKRIPSI = "deskripsi";

    //JSON Tags
    public static final String TAG_JSON_ARRAY= "result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_SIZE_BESAR = "size_besar";
    public static final String TAG_SIZE_UNIT = "size_unit";
    public static final String TAG_RATING = "rating";
    public static final String TAG_PUBLISHER = "publisher";
    public static final String TAG_DESKRIPSI = "deskripsi";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String GAME_ID = "game_id";
}
