<?php
	//Mendapatkan Nilai Dari Variable ID Pegawai yang ingin ditampilkan
	$id = $_GET['id'];

	//Importing database
	require_once('koneksi.php');

	//Membuat SQL Query dengan pegawai yang ditentukan secara spesifik sesuai ID
	$sql = "SELECT * FROM tb_game WHERE id = $id";

	//Mendapatkan Hasil
	$r = mysqli_query($con, $sql);

	//Memasukkan Hasil Kedalam Array
	$result = array();
	$row = mysqli_fetch_array($r);
	array_push($result,array(
			"id" => $row['id'],
			"name" => $row['nama'],
			"big" => $row['size_besar'],
			"unit" => $row['size_unit'],
			"rate" => $row['rating'],
			"pub" => $row['publisher'],
			"desk" => $row['deskripsi']
		));

	//Menampilkan dalam format JSON
	echo json_encode(array('result' => $result));
	mysqli_close($con);
?>
