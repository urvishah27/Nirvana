-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 23, 2013 at 06:57 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `forumseries`
--

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE IF NOT EXISTS `categories` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `category_title` varchar(55) NOT NULL,
  `category_description` varchar(122) NOT NULL,
  `last_post_date` datetime DEFAULT NULL,
  `last_user_posted` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`id`, `category_title`, `category_description`, `last_post_date`, `last_user_posted`) VALUES
(1, 'test_category one', 'This is first category', '2013-10-23 10:41:55', 3),
(2, 'Random Forum', 'This is Random forum.', '2013-10-23 10:35:19', 3);

-- --------------------------------------------------------

--
-- Table structure for table `post`
--

CREATE TABLE IF NOT EXISTS `post` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_id` tinyint(4) NOT NULL,
  `topic_id` int(11) NOT NULL,
  `post_creator` int(11) NOT NULL,
  `post_content` text NOT NULL,
  `post_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=26 ;

--
-- Dumping data for table `post`
--

INSERT INTO `post` (`id`, `category_id`, `topic_id`, `post_creator`, `post_content`, `post_date`) VALUES
(1, 2, 12, 1, 'This is first content goes here.', '2013-10-23 08:16:46'),
(4, 1, 11, 1, 'You should hava a gun.', '2013-10-23 08:29:25'),
(5, 1, 11, 1, 'Second reply.', '2013-10-23 08:37:11'),
(6, 1, 11, 1, 'Second reply.', '2013-10-23 08:37:35'),
(7, 1, 8, 1, 'This is next comment on how to hunt  a bear?', '2013-10-23 08:38:16'),
(8, 1, 8, 1, 'This is next comment on how to hunt  a bear?', '2013-10-23 08:38:43'),
(9, 2, 7, 1, 'how to milk a buffallo for a first time???Any tricks?', '2013-10-23 08:39:39'),
(10, 2, 7, 2, 'I hava no idea about to milk a buffallo for a first time.', '2013-10-23 08:44:04'),
(11, 2, 7, 2, 'I hava no idea about to milk a buffallo for a first time.', '2013-10-23 08:44:38'),
(12, 2, 4, 1, 'You should bath a dog by using a dog shampoo.', '2013-10-23 10:15:22'),
(14, 2, 4, 1, 'There are no items to display at the moment. Please check back later in the day.Thanks You...\r\n    There are no items to display at the moment. Please check back later in the day.Thanks You...There are no items to display at the moment. Please check back later in the day.Thanks You...There are no items to display at the moment. Please check back later in the day.Thanks You...There are no items to display at the moment. Please check back later in the day.Thanks You...There are no items to display at the moment.  are no items to display at the moment. Please check back later in the day.Thanks You...\r\n    There are no items to display at the moment. Please check back later in the day.Thanks You...There are no items to display at the moment. Please check back later in the day.Thanks You...There are no items to display at the moment. Please check back later in the day.Thanks You...There are no items to display at the moment. Please check back later in the day.Thanks You...There are no items to display at the moment. Please check back later in the day.Thanks You...There are no items to display at the moment. Please check back later in the day.Thanks You...Please check back later in the day.Thanks You...There are no items to display at the moment. Please check back later in the day.Thanks You...', '2013-10-23 10:17:21'),
(16, 2, 4, 1, '', '2013-10-23 10:30:36'),
(17, 2, 3, 1, 'ihiohoioijoj\r\n', '2013-10-23 10:32:09'),
(18, 2, 3, 1, 'ihiohoioijoj\r\n', '2013-10-23 10:32:18'),
(19, 1, 11, 3, 'hhhhhhhhhhhhhhhhhhhh', '2013-10-23 10:33:19'),
(20, 1, 11, 3, 'hhhhhhhhhhhhhhhhhhhh', '2013-10-23 10:34:50'),
(21, 2, 3, 3, 'tttttttttt', '2013-10-23 10:35:15'),
(22, 2, 3, 3, 'tttttttttt', '2013-10-23 10:35:19'),
(23, 1, 11, 3, '', '2013-10-23 10:40:05'),
(24, 1, 11, 3, '', '2013-10-23 10:41:21'),
(25, 1, 11, 3, 'thtrt', '2013-10-23 10:41:55');

-- --------------------------------------------------------

--
-- Table structure for table `topics`
--

CREATE TABLE IF NOT EXISTS `topics` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_id` tinyint(33) NOT NULL,
  `topic_title` varchar(33) NOT NULL,
  `topic_creator` int(33) NOT NULL,
  `topic_last_user` int(11) DEFAULT NULL,
  `topic_date` datetime NOT NULL,
  `topic_reply_date` datetime NOT NULL,
  `topic_views` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Dumping data for table `topics`
--

INSERT INTO `topics` (`id`, `category_id`, `topic_title`, `topic_creator`, `topic_last_user`, `topic_date`, `topic_reply_date`, `topic_views`) VALUES
(3, 2, 'How to plant a tree.', 1, 3, '2013-10-17 08:51:21', '2013-10-23 10:35:19', 0),
(4, 2, 'How to bath a dog', 1, 1, '2013-10-17 08:51:50', '2013-10-23 10:30:36', 0),
(5, 2, 'how to milk a cow.', 1, 0, '2013-10-17 12:18:55', '2013-10-17 12:18:55', 0),
(6, 2, 'how to milk a cow', 1, 0, '2013-10-17 12:19:13', '2013-10-17 12:19:13', 0),
(7, 2, 'how to milk a buffall0', 1, 2, '2013-10-17 12:19:50', '2013-10-23 08:44:38', 0),
(8, 1, 'How  to hunt a bear?', 1, 1, '2013-10-22 19:30:22', '2013-10-23 08:38:43', 0),
(9, 1, 'How  to hunt a bear', 1, NULL, '2013-10-22 19:30:31', '2013-10-22 19:30:31', 0),
(10, 1, 'How  to hunt a bear.', 1, NULL, '2013-10-22 19:31:00', '2013-10-22 19:31:00', 0),
(11, 1, 'How  to hunt a bear', 1, 3, '2013-10-22 19:32:12', '2013-10-23 10:41:55', 0);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(33) NOT NULL,
  `password` varchar(33) NOT NULL,
  `emial` varchar(123) NOT NULL,
  `forum_notification` enum('0','1') NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `emial`, `forum_notification`) VALUES
(1, 'ranjit', 'ranjit', 'ranjitkarki2@gmail.com', '1'),
(2, 'Sachin Tamrakar', 'Sachin', 'SachinTamrakar@gmail.com', '1'),
(3, 'Adms jolly', 'Adms', 'Adms@yahoo.com', '1');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
