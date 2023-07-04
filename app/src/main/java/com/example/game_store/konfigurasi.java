package com.example.game_store;

public class konfigurasi {
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD = "https://dc4b-114-122-166-181.ngrok-free.app/gamestore_backend/tambahGame.php";
    public static final String URL_GET_ALL = "https://dc4b-114-122-166-181.ngrok-free.app/gamestore_backend/tampilSemuaGame.php";
    public static final String URL_GET_EMP = "https://dc4b-114-122-166-181.ngrok-free.app/gamestore_backend/tampilGame.php?id=";
    public static final String URL_UPDATE_EMP = "https://dc4b-114-122-166-181.ngrok-free.app/gamestore_backend/updateGame.php";
    public static final String URL_DELETE_EMP = "https://dc4b-114-122-166-181.ngrok-free.app/gamestore_backend/hapusGame.php?id=";

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
    public static final String TAG_NAME = "name";
    public static final String TAG_BIG = "big";
    public static final String TAG_UNIT = "unit";
    public static final String TAG_RATING = "rate";
    public static final String TAG_PUB = "pub";
    public static final String TAG_DESK = "desk";

    public static final String GAME_ID = "game_id";
}
