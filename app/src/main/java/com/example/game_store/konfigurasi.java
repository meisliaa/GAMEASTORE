package com.example.game_store;

public class konfigurasi {
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
      public static final String URL_ADD="http://192.168.1.9/Android/pegawai/tambahGame.php";
      public static final String URL_GET_ALL = "https://5367-114-4-218-244.ngrok-free.app/Android/game/tampilSemuaGame.php";
      public static final String URL_GET_EMP = "http://192.168.1.9/Android/pegawai/tampilGame.php?id=";
      public static final String URL_UPDATE_EMP = "http://192.168.1.9/Android/pegawai/updateGame.php";
      public static final String URL_DELETE_EMP = "http://192.168.1.9/Android/pegawai/hapusGame.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAME = "nama";
    public static final String KEY_EMP_BIG = "size_besar";
    public static final String KEY_EMP_UNIT = "size_unit";
    public static final String KEY_EMP_RATING = "rating";
    public static final String KEY_EMP_PUB= "publisher";
    public static final String KEY_EMP_DESK = "deskripsi";

    //JSON Tags
    public static final String TAG_JSON_ARRAY= "result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAME = "nama";
    public static final String TAG_BIG = "size_besar";
    public static final String TAG_UNIT = "size_unit";
    public static final String TAG_RATING = "rating";
    public static final String TAG_PUB = "publisher";
    public static final String TAG_DESK = "deskripsi";

    public static final String GAME_ID = "game_id";
}
