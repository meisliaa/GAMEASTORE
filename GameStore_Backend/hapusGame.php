<?php
 //Mendapatkan Nilai ID
 $id = $_GET['id'];

 //Import File Koneksi Database
 require_once('koneksi.php');

 //Membuat SQL Query
 $sql = "DELETE FROM tb_game WHERE id = $id;";

 //Menghapus Nilai pada Database
 if(mysqli_query($con, $sql)){
    echo 'Berhasil Menghapus Game';
 }
 else{
    echo 'Gagal Menghapus Game';
 }

 mysqli_close($con);
 ?>
