--
-- Table structure for table `mail_messages`
--
DROP TABLE IF EXISTS `mail_messages`;
CREATE TABLE `mail_messages` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `return_path` varchar(255) NOT NULL DEFAULT '',
  `delivered_to` varchar(255) NOT NULL DEFAULT '',
  `received` varchar(255) NOT NULL DEFAULT '',
  `sender_from` varchar(255) NOT NULL DEFAULT '',
  `reciver_to` varchar(255) NOT NULL DEFAULT '',
  `subject` varchar(255) NOT NULL DEFAULT '',
  `message_date` varchar(255) NOT NULL DEFAULT '',
  `message_id` varchar(255) NOT NULL DEFAULT '',
  `file_name` varchar(255) NOT NULL,
  `file_full_path` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
