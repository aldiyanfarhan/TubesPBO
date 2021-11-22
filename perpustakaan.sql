-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 23, 2021 at 07:47 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `kodeBuku` int(11) NOT NULL,
  `Judul` varchar(100) NOT NULL,
  `Penerbit` varchar(100) NOT NULL,
  `Harga` int(11) NOT NULL,
  `Status` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`kodeBuku`, `Judul`, `Penerbit`, `Harga`, `Status`) VALUES
(1, 'Pemrograman Berorientasi Objek', 'Telkom University', 50000, 'Unavailable'),
(2, 'buku 2', 'penerbit 2', 10000, 'Available'),
(3, 'buku 3', 'penerbit 3', 20000, 'Unavailable'),
(4, 'buku 4', 'penerbit 4', 25000, 'Available'),
(5, 'buku 5', 'penerbit 5', 30000, 'Available'),
(6, 'buku 6', 'penerbit 6', 25000, 'Available'),
(7, 'judul 7', 'penerbit 7', 30000, 'Available'),
(8, 'buku 8', 'penerbit 8', 100000, 'Available'),
(9, 'buku 9', 'penerbit 9', 69000, 'Available'),
(10, 'buku 10', 'penerbit 10', 79000, 'Available');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`kodeBuku`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `buku`
--
ALTER TABLE `buku`
  MODIFY `kodeBuku` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
