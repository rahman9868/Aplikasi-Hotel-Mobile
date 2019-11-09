-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 07, 2019 at 08:34 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `id7122435_akademik`
--

-- --------------------------------------------------------

--
-- Table structure for table `hotel`
--

CREATE TABLE `hotel` (
  `idHotel` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `nama` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `alamat` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `gambar` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `keterangan` text COLLATE utf8_unicode_ci NOT NULL,
  `latitude` text COLLATE utf8_unicode_ci NOT NULL,
  `longitude` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `hotel`
--

INSERT INTO `hotel` (`idHotel`, `nama`, `alamat`, `gambar`, `keterangan`, `latitude`, `longitude`) VALUES
('H1\r\n', 'Rocky Plaza Hotel Padang\r\n\r\n', 'Jalan Permindo No. 40 Po Box 380 PD, Padang Barat, Padang, Sumatera Barat, Indonesia, 25111', 'http://him.nusatrip.net/ID/50/1042153550/26f11701020edb0c2788e2e26a26899d_ctb.jpg\r\n', 'Lumayan\r\n', '-0.9466927', '100.3570093\r\n'),
('H10', 'Ibis Padang Hotel\r\n', 'Jalan Taman Siswa No 1A, Padang Utara, Padang, Sumatera Barat, Indonesia, 25139\r\n', 'https://i.ibb.co/3Ywhvvv/20181227-215916.jpg\r\n', 'Lumayan\r\n', '-0.9293320\r\n', '100.3629870\r\n'),
('H2', 'Daima Hotel\r\n', 'Jl. Jend. Sudirman No 17, Padang Barat, Padang, Sumatera Barat, Indonesia, 25112\r\n', 'https://r-ak.bstatic.com/images/hotel/max1024x768/112/11250613.jpg\r\n', 'Lumayan\r\n', '-0.944012\r\n', '100.3614978\r\n'),
('H3', 'Grand Zuri Hotel Padang\r\n', 'Jl. MH Thamrin No. 27 , Padang Selatan, Padang, Sumatera Barat, Indonesia, 25133\r\n', 'https://i.ibb.co/qs1JqTj/20181227-205450.jpg\r\n', 'Lumayan\r\n\r\n', '-0.9544880', '\r\n100.3641730'),
('H4', 'Fave Hotel \r\n', 'Jalan Belakang Olo No.46, Padang Barat, Padang, Sumatera Barat, Indonesia, 25116\r\n', 'https://i.ibb.co/CV6TtdV/20181227-214223.jpg\r\n', 'Lumayan\r\n', '-0.945478\r\n', '100.3554118\r\n'),
('H5', 'Amaris Hotel \r\n', 'Jalan Jendral sudirman no.19 Kota, Padang Barat, Padang, Sumatera Barat, Indonesia, -\r\n', 'https://r-ak.bstatic.com/images/hotel/max500/102/102960522.jpg\r\n', 'Lumayan\r\n', '-0.943568\r\n', '100.3612768\r\n'),
('H6', 'Grand Inna Padang\r\n', 'Jln. Gereja No. 34, Padang Barat, Padang, Sumatera Barat, Indonesia, 25118\r\n', 'https://i.ibb.co/bFsZM7q/20181227-210925.jpg\r\n', 'Lumayan\r\n', '-0.9567880\r\n', '100.3570040\r\n'),
('H7', 'Pangeran City Hotel\r\n', 'Jl. Dobi No.3-5, Padang Barat, Padang, Sumatera Barat, Indonesia, 25115\r\n', 'https://i.ibb.co/1XSVCPf/20181227-205923.jpg\r\n', 'Lumayan\r\n', '-0.9552430\r\n', '100.3595530\r\n'),
('H8', 'Yani Homestay\r\n', 'Jalan Nipah no. 1 Padang 25118 Indonesia\r\n', 'https://i.ibb.co/kMTsyjw/20181227-212459.jpg\r\n', 'Lumayan\r\n', '-0.9610430\r\n', '100.3541640\r\n'),
('H9', 'Pangeran Beach Hotel\r\n', 'Jalan Ir. Haji Juanda No 79, Padang Utara, Padang, Sumatera Barat, Indonesia, 25115\r\n', 'https://i.ibb.co/JsKzGW4/20181227-215140.jpg\r\n', 'Lumayan\r\n', '-0.9240120\r\n', '100.3506900\r\n');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hotel`
--
ALTER TABLE `hotel`
  ADD PRIMARY KEY (`idHotel`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
