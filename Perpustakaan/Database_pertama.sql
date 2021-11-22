CREATE TABLE `buku` (
	`kodeBuku` INT NOT NULL AUTO_INCREMENT,
	`Judul` varchar(100) NOT NULL,
	`Penerbit` varchar(100) NOT NULL,
	`Harga` INT(11) NOT NULL,
	`Status` varchar(12) NOT NULL,
	PRIMARY KEY (`kodeBuku`)
);


