-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Inang: 127.0.0.1
-- Waktu pembuatan: 04 Jan 2018 pada 08.50
-- Versi Server: 5.5.27
-- Versi PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Basis data: `sorum`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `dim_motor`
--

CREATE TABLE IF NOT EXISTS `dim_motor` (
  `id_motor` varchar(5) NOT NULL,
  `merek` varchar(20) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `harga` bigint(20) NOT NULL,
  `stok` int(11) NOT NULL,
  PRIMARY KEY (`id_motor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `dim_motor`
--

INSERT INTO `dim_motor` (`id_motor`, `merek`, `jenis`, `harga`, `stok`) VALUES
('ym001', 'Yamaha', 'Zeon 125', 15250000, 20),
('ym002', 'Yamaha', 'Mio 125', 13650000, 18),
('ym003', 'Yamaha', 'GT 125', 15900000, 21),
('ym004', 'Yamaha', 'Mio Fino', 14500000, 12),
('ym005', 'Yamaha', 'X-Ride', 14800000, 14),
('ym006', 'Yamaha', 'Juviter MX King', 18950000, 19),
('ym007', 'Yamaha', 'Force', 13350000, 24),
('ym008', 'Yamaha', 'Juviter Z1', 14600000, 11),
('ym009', 'Yamaha', 'Vega RR', 11990000, 7),
('ym010', 'Yamaha', 'Juviter MX', 16220000, 12),
('ym011', 'Yamaha', 'YZF R25', 53000000, 10),
('ym012', 'Yamaha', 'YZR R15', 28000000, 8),
('ym013', 'Yamaha', 'Scorpio Z', 25000000, 11),
('ym014', 'Yamaha', 'Byson', 21250000, 7),
('ym015', 'Yamaha', 'V-IXion', 22250000, 8);

-- --------------------------------------------------------

--
-- Struktur dari tabel `dim_pembayaran`
--

CREATE TABLE IF NOT EXISTS `dim_pembayaran` (
  `id_pembayaran` varchar(5) NOT NULL,
  `jenis_pembayaran` varchar(10) NOT NULL,
  PRIMARY KEY (`id_pembayaran`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `dim_pembayaran`
--

INSERT INTO `dim_pembayaran` (`id_pembayaran`, `jenis_pembayaran`) VALUES
('pb001', 'Cash'),
('pb002', 'Kredit 12 '),
('pb003', 'Kredit 24'),
('pb004', 'Kredit 36');

-- --------------------------------------------------------

--
-- Struktur dari tabel `dim_staff_sp`
--

CREATE TABLE IF NOT EXISTS `dim_staff_sp` (
  `dim_id_staff` varchar(5) NOT NULL,
  `dim_nama_staff` varchar(20) NOT NULL,
  `dim_alamat` varchar(30) NOT NULL,
  `dim_tanggal_lahir` date NOT NULL,
  PRIMARY KEY (`dim_id_staff`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `dim_staff_sp`
--

INSERT INTO `dim_staff_sp` (`dim_id_staff`, `dim_nama_staff`, `dim_alamat`, `dim_tanggal_lahir`) VALUES
('st100', 'Alba Semele', 'Lambuya', '1997-02-24'),
('st101', 'Rapi Amat', 'Welala', '1996-05-12'),
('st102', 'Samsul Tajem', 'Baruga', '1997-02-24'),
('st103', 'Masdan Superjo', 'Abeli', '1995-01-26'),
('st104', 'Farah Fahrone', 'Wanggu', '1997-05-11'),
('st105', 'Armandul', 'Mandonga', '1997-04-22'),
('st106', 'Sutojo', 'Wua-Wua', '1996-08-19');

-- --------------------------------------------------------

--
-- Struktur dari tabel `dim_table_pelanggan`
--

CREATE TABLE IF NOT EXISTS `dim_table_pelanggan` (
  `id_pelanggan` varchar(5) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  PRIMARY KEY (`id_pelanggan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `dim_table_pelanggan`
--

INSERT INTO `dim_table_pelanggan` (`id_pelanggan`, `nama`, `alamat`, `tanggal_lahir`) VALUES
('pl001', 'Supreto', 'Mandonga', '1992-01-14'),
('pl002', 'Indro', 'Kota Lama', '1994-09-09');

-- --------------------------------------------------------

--
-- Struktur dari tabel `fakta_penjualan`
--

CREATE TABLE IF NOT EXISTS `fakta_penjualan` (
  `id_penjualan` varchar(5) NOT NULL,
  `id_motor` varchar(5) NOT NULL,
  `id_pelanggan` varchar(5) NOT NULL,
  `dim_id_staff` varchar(5) NOT NULL,
  `id_pembayaran` varchar(5) NOT NULL,
  `tanggal` date NOT NULL,
  `jumlah` int(25) NOT NULL,
  PRIMARY KEY (`id_penjualan`),
  KEY `id_motor` (`id_motor`),
  KEY `id_pelanggan` (`id_pelanggan`),
  KEY `dim_id_staff` (`dim_id_staff`),
  KEY `id_pembayaran` (`id_pembayaran`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `fakta_penjualan`
--

INSERT INTO `fakta_penjualan` (`id_penjualan`, `id_motor`, `id_pelanggan`, `dim_id_staff`, `id_pembayaran`, `tanggal`, `jumlah`) VALUES
('pj001', 'ym002', 'pl001', 'st104', 'pb002', '2018-01-02', 6),
('pj002', 'ym014', 'pl002', 'st100', 'pb001', '2018-01-01', 2),
('pj003', 'ym004', 'pl001', 'st103', 'pb002', '2018-01-03', 4),
('pj004', 'ym004', 'pl001', 'st104', 'pb001', '2018-01-04', 2),
('pj005', 'ym010', 'pl001', 'st102', 'pb003', '2018-01-04', 3),
('pj006', 'ym013', 'pl002', 'st103', 'pb004', '2018-01-05', 4);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `fakta_penjualan`
--
ALTER TABLE `fakta_penjualan`
  ADD CONSTRAINT `fakta_penjualan_ibfk_1` FOREIGN KEY (`id_motor`) REFERENCES `dim_motor` (`id_motor`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fakta_penjualan_ibfk_2` FOREIGN KEY (`dim_id_staff`) REFERENCES `dim_staff_sp` (`dim_id_staff`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fakta_penjualan_ibfk_3` FOREIGN KEY (`id_pelanggan`) REFERENCES `dim_table_pelanggan` (`id_pelanggan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fakta_penjualan_ibfk_4` FOREIGN KEY (`id_pembayaran`) REFERENCES `dim_pembayaran` (`id_pembayaran`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
