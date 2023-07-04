<?php
	if($_SERVER['REQUEST_METHOD']=='POST'){

		//Mendapatkan Nilai Dari Variable
		$id = $_POST['id'];
		$name = $_POST['nama'];
		$big = $_POST['size_besar'];
		$unit = $_POST['size_unit'];
		$rate = $_POST['rating'];
		$pub = $_POST['publisher'];
		$desk = $_POST['deskripsi'];

		//import file koneksi database
		require_once('koneksi.php');

		//Membuat SQL Query
		$sql = "UPDATE tb_game SET nama = '$name', size_besar = '$big', size_unit = '$unit', rating = '$rate', publisher = '$pub', deskripsi = '$desk' WHERE id = $id;";

		//Meng-update Database
		if(mysqli_query($con, $sql)){
			echo 'Berhasil Update Data Game';
		}else{
			echo 'Gagal Update Data Game';
		}

		mysqli_close($con);
	}
?>
