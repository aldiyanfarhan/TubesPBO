CREATE TABLE `member` (
	`id_member` INT NOT NULL AUTO_INCREMENT,
	`email` varchar(50) NOT NULL,
	`nama` varchar(100) NOT NULL,
	`alamat` varchar(100) NOT NULL,
	`notelp` varchar(13) NOT NULL,
	PRIMARY KEY (`id_member`)
);

CREATE TABLE `buku` (
	`kodeBuku` INT NOT NULL AUTO_INCREMENT,
	`Judul` varchar(100) NOT NULL,
	`Penerbit` varchar(100) NOT NULL,
	`Harga` INT(11) NOT NULL,
	`Status` varchar(12) NOT NULL,
	PRIMARY KEY (`kodeBuku`)
);

CREATE TABLE `peminjaman` (
	`id_pinjam` INT NOT NULL AUTO_INCREMENT,
	`kodeBuku` INT NOT NULL,
	`id_member` INT NOT NULL,
	`tanggal_pinjam` DATE NOT NULL,
	`tanggal_kembali` DATE NOT NULL,
	PRIMARY KEY (`id_pinjam`)
);

ALTER TABLE `peminjaman` ADD CONSTRAINT `peminjaman_fk0` FOREIGN KEY (`kodeBuku`) REFERENCES `buku`(`kodeBuku`);

ALTER TABLE `peminjaman` ADD CONSTRAINT `peminjaman_fk1` FOREIGN KEY (`id_member`) REFERENCES `member`(`id_member`);




