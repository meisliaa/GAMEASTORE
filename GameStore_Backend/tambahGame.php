<?php
	if($_SERVER['REQUEST_METHOD']=='POST'){
		
		//Mendapatkan Nilai Variable
		$name = $_POST['name'];
		$big = $_POST['size_besar'];
		$unit = $_POST['size_unit'];
		$rate = $_POST['rating'];
		$pub = $_POST['publisher'];
		$desk = $_POST['deskripsi'];

		//Pembuatan Syntax SQL
		$sql = "INSERT INTO tb_game (nama, size_besar, size_unit, rating, publisher, deskripsi) VALUES ('$name', '$big', '$unit', '$rate', '$pub', '$desk')";

		//Import File Koneksi database
		require_once('koneksi.php');

		//Eksekusi Query database
		if(mysqli_query($con,$sql)){
			echo 'Berhasil Menambahkan Data Game';
		}else{
			echo 'Gagal Menambahkan Data Game';
		}

		mysqli_close($con);
	}
?>
