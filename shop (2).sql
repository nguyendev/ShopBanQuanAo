-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 13 Décembre 2016 à 09:04
-- Version du serveur :  10.1.16-MariaDB
-- Version de PHP :  5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `shop`
--

-- --------------------------------------------------------

--
-- Structure de la table `bill`
--

CREATE TABLE `bill` (
  `bill_id` bigint(20) NOT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `payment` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` longtext COLLATE utf8_unicode_ci,
  `date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `provincial` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `message` longtext COLLATE utf8_unicode_ci,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Contenu de la table `bill`
--

INSERT INTO `bill` (`bill_id`, `user_id`, `total`, `payment`, `address`, `date`, `name`, `address1`, `provincial`, `message`, `email`) VALUES
(1479276070594, 1479265817616, 149, 'Live', 'ng', '2016-11-16 06:01:10', 'Nguyá»?n An HoÃ ng NguyÃªn', NULL, 'BÃ¬nh DÆ°Æ¡ng', '', 'nguyen.nah76@gmail.com'),
(1479285764632, 1479265817616, 149, 'Bank transfer', 'ng', '2016-11-16 08:42:44', 'Nguyá»?n An HoÃ ng NguyÃªn', NULL, 'Há»? ChÃ­ Minh', '', 'nguyen.nah76@gmail.com'),
(1479404027176, 1479403982029, 149, 'Bank transfer', 'nguyen', '2016-11-17 17:33:47', 'Nguyen', NULL, 'Há»? ChÃ­ Minh', '', 'nguyen.nah76@gmail.com'),
(1479431589189, 1479431287394, 324, 'Live', 'KÃ½ tÃºc xÃ¡ khu B', '2016-11-18 01:13:09', 'nguyen ', NULL, 'Há»? ChÃ­ Minh', '', 'nguyen.nah76@gmail.com'),
(1479433637498, 1479433497261, 119, 'Live', 'KÃ½ tÃºc xÃ¡ khu B', '2016-11-18 01:47:17', 'Tuáº¥n Anh', NULL, 'Há»? ChÃ­ Minh', '', 'tuananhpham@gmail.com');

-- --------------------------------------------------------

--
-- Structure de la table `bill_detail`
--

CREATE TABLE `bill_detail` (
  `bill_detail_id` bigint(20) NOT NULL,
  `bill_id` bigint(20) DEFAULT NULL,
  `product_id` bigint(20) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Contenu de la table `bill_detail`
--

INSERT INTO `bill_detail` (`bill_detail_id`, `bill_id`, `product_id`, `price`, `quantity`) VALUES
(7, 1479276070594, 0, 149, 1),
(8, 1479285764632, 0, 149, 1),
(9, 1479404027176, 0, 149, 1),
(10, 1479431589189, 0, 149, 1),
(11, 1479431589189, 2, 175, 1),
(12, 1479433637498, 4, 119, 1);

-- --------------------------------------------------------

--
-- Structure de la table `category`
--

CREATE TABLE `category` (
  `category_id` bigint(11) NOT NULL,
  `category_name` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Contenu de la table `category`
--

INSERT INTO `category` (`category_id`, `category_name`) VALUES
(1, 'Áo khoác nam'),
(2, 'Đồ bơi đồ đi biển'),
(3, 'Áo thun nam');

-- --------------------------------------------------------

--
-- Structure de la table `product`
--

CREATE TABLE `product` (
  `product_id` bigint(20) NOT NULL,
  `product_name` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_image` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL,
  `category_id` bigint(20) DEFAULT NULL,
  `product_price` double DEFAULT NULL,
  `product_description` longtext COLLATE utf8_unicode_ci,
  `product_image2` varchar(256) COLLATE utf8_unicode_ci NOT NULL,
  `product_image3` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_image4` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Contenu de la table `product`
--

INSERT INTO `product` (`product_id`, `product_name`, `product_image`, `category_id`, `product_price`, `product_description`, `product_image2`, `product_image3`, `product_image4`) VALUES
(0, 'Áo Khoác Nam GUES MS 2211', 'images/shop/aokhoatnam/GUES-MS-2211-1.jpg', 1, 149, 'Tên sản phẩm:Áo Khoác Nam GUEST, \r\nKiểu dáng:  dài tay, in chữ, ôm body. \r\nChất liệu:  Nỉ. Màu sắc: Đỏ ,Đen, Xanh, Xanh Đen. \r\nKích thước: Freesize. Xuất xứ: Việt Nam', 'images/shop/aokhoatnam/GUES-MS-2211-2.jpg', 'images/shop/aokhoatnam/GUES-MS-2211-3.jpg', 'images/shop/aokhoatnam/GUES-MS-2211-4.jpg'),
(1, 'hàng nhập cao cấp bikini cạp cao xu hướng hè 2016 - Bk01', 'images/shop/doboidibien/bk01.png', 2, 250, 'Hotline : 0989.342.460', 'images/shop/doboidibien/bk01-2.png', 'images/shop/doboidibien/bk01-3.png', 'images/shop/doboidibien/bk01-4.png'),
(2, 'ĐỒ BƠI TÔN DÁNG CỰC XINH - SWNU02_C', 'images/shop/doboidibien/NP9M7K.png', 2, 175, 'Điểm nổi bật\r\n- Màu sắc: Hồng, Cam, Xanh\r\n- Kích cỡ:   M, L, XL\r\n- Chất liệu: thun có lót mút\r\nThông tin sản phẩm:\r\n- Tên sản phẩm: Đồ Bơi Tôn Dáng Cực XInh \r\n- Xuất xứ: Quảng Châu\r\n- Chất liệu: thun có lót mút\r\n- Màu sắc: Hồng, Cam\r\n- Kích cỡ: M, L\r\n- Trọng lượng: 290.', 'images/shop/doboidibien/NP9M7K-2.png', 'images/shop/doboidibien/NP9M7K-3.png', 'images/shop/doboidibien/NP9M7K-4.png'),
(3, 'Bikini sọc tạo dáng ngực kèm áo choàng ngoài gợi cảm - B01 - B01', 'images/shop/doboidibien/B01.jpg', 2, 350, 'Trọn bộ sản phẩm mua gồm 4 item như hình dưới\r\n1.Áo ngực\r\n2.Quần\r\n3.Áo khoác\r\n4.Miếng lót ngực', 'images/shop/doboidibien/B01-1.jpg', 'images/shop/doboidibien/B01-2.jpg', 'images/shop/doboidibien/B01-3.jpg'),
(4, 'CTS27_Áo Thun Cổ Tròn Sọc Nhuyễn_màu vàng - CTS27', 'images/shop/aothunnam/CTS27.jpg', 3, 119, 'SIZE M PHÙ HỢP TỪ 50 -57KG﻿\r\n\r\nSIZE L PHÙ HỢP TỪ 58-65KG\r\n\r\nSIZE XL PHÙ HỢP TỪ 65_74KG\r\n\r\nSIZE XXL PHÙ HỢP TỪ 75_85KG', 'images/shop/aothunnam/CTS27-1.jpg', 'images/shop/aothunnam/CTS27-2.jpg', 'images/shop/aothunnam/CTS27-3.jpg');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `user_id` bigint(20) NOT NULL,
  `user_email` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_pass` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_role` bit(64) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`user_id`, `user_email`, `user_pass`, `user_role`) VALUES
(1478827769450, 'ashkfd', 'teo', b'0000000000000000000000000000000000000000000000000000000000000000'),
(1478827836824, 'ashkfd', 'teo', b'0000000000000000000000000000000000000000000000000000000000000000'),
(1478828029464, 'TUNG@gm.com', '123', b'0000000000000000000000000000000000000000000000000000000000000000'),
(1478830071290, 'nguyen@gmail.com', 'nguyen', b'0000000000000000000000000000000000000000000000000000000000000000'),
(1478831115838, 'asd@asd', 'asd', b'0000000000000000000000000000000000000000000000000000000000000000'),
(1478831130324, 'asd@asd.com', 'asd', b'0000000000000000000000000000000000000000000000000000000000000000'),
(1478831154560, 'teoteo@teo.com', 'teo', b'0000000000000000000000000000000000000000000000000000000000000000'),
(1479265769215, 'titi@titi', 'titi', b'0000000000000000000000000000000000000000000000000000000000000000'),
(1479265817616, 'admin@admin.com', 'admin', b'0000000000000000000000000000000000000000000000000000000000000000'),
(1479403925559, 'nguyen.nah76@gmail.com', '27ff2ffe376b2edcc7c2de309173f0d8', b'0000000000000000000000000000000000000000000000000000000000000000'),
(1479403982029, 'a@admin.com', '21232f297a57a5a743894a0e4a801fc3', b'0000000000000000000000000000000000000000000000000000000000000000'),
(1479404804178, 'hung@gmail.com', '546cb004524c792856b4bbba7192456b', b'0000000000000000000000000000000000000000000000000000000000000000'),
(1479404857966, 'thaihungtran@gmail.com', '0cc175b9c0f1b6a831c399e269772661', b'0000000000000000000000000000000000000000000000000000000000000000'),
(1479431287394, 'cuong@gmail.com', 'cf4d87e50be6390ee9bd8ad6e7498cae', b'0000000000000000000000000000000000000000000000000000000000000000'),
(1479431994717, 'danhtran@gmail.com', '5d5ac8f28d8b61ecc42c739310b1b1bb', b'0000000000000000000000000000000000000000000000000000000000000000'),
(1479432045753, 'dungtt@gmail.com', '625d45c587033e8970af8b4e3fdb575c', b'0000000000000000000000000000000000000000000000000000000000000000'),
(1479433497261, 'tuananhpham@gmail.com', 'd6b8cc42803ea100735c719f1d7f5e11', b'0000000000000000000000000000000000000000000000000000000000000000');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`bill_id`);

--
-- Index pour la table `bill_detail`
--
ALTER TABLE `bill_detail`
  ADD PRIMARY KEY (`bill_detail_id`);

--
-- Index pour la table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`category_id`);

--
-- Index pour la table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`product_id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `bill_detail`
--
ALTER TABLE `bill_detail`
  MODIFY `bill_detail_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
