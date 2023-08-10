<?php
 //Mendefinisikan Konstanta
 define('HOST', '127.0.0.1');
 define('USER', 'root');
 define('PASS', '');
 define('DB', 'db_game_store');

 //membuat koneksi dengan database
 $con = mysqli_connect(HOST, USER, PASS, DB) or die('Unable to Connect');
 ?>
