-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.17-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for student_teacher_portal
CREATE DATABASE IF NOT EXISTS `student_teacher_portal` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `student_teacher_portal`;

-- Dumping structure for table student_teacher_portal.course
CREATE TABLE IF NOT EXISTS `course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(255) DEFAULT NULL,
  `max_students` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

-- Dumping data for table student_teacher_portal.course: ~10 rows (approximately)
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` (`id`, `course_name`, `max_students`) VALUES
	(1, 'Object Oriented Programming', 25),
	(2, 'Art History', 50),
	(3, 'Linear Algebra', 30),
	(4, 'Biology', 73),
	(5, 'English Literature', 33),
	(6, '3D Programming', 15),
	(7, 'Spanish', 25),
	(8, 'Public Speaking', 55),
	(9, 'Calculus', 40),
	(10, 'Software Engineering', 22);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;

-- Dumping structure for table student_teacher_portal.course_teacher
CREATE TABLE IF NOT EXISTS `course_teacher` (
  `teacher_id` bigint(20) NOT NULL,
  `courses_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_21fyk4jbf6hgstelbys249psr` (`courses_id`),
  KEY `FKsb9lnio7h0a885b871ogw0ajg` (`teacher_id`),
  CONSTRAINT `FKl9e7vyic0tqi9oapijwsm9oh1` FOREIGN KEY (`courses_id`) REFERENCES `course` (`id`),
  CONSTRAINT `FKsb9lnio7h0a885b871ogw0ajg` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table student_teacher_portal.course_teacher: ~4 rows (approximately)
/*!40000 ALTER TABLE `course_teacher` DISABLE KEYS */;
INSERT INTO `course_teacher` (`teacher_id`, `courses_id`) VALUES
	(1, 3),
	(1, 7),
	(2, 2),
	(2, 5);
/*!40000 ALTER TABLE `course_teacher` ENABLE KEYS */;

-- Dumping structure for table student_teacher_portal.student
CREATE TABLE IF NOT EXISTS `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `date_of_enrollment` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `zipcode` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Dumping data for table student_teacher_portal.student: ~2 rows (approximately)
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`id`, `address`, `city`, `date_of_enrollment`, `email`, `first_name`, `last_name`, `password`, `phone`, `state`, `user_id`, `zipcode`) VALUES
	(1, '55 Spruce Street', 'London', '2021-03-30', 'brian@gmail.com', 'Brian', 'Johnson', 'brian1', '444-444-4444', 'MA', 'brian1', '12345'),
	(2, '78 Null Road', 'Paris', '2019-05-30', 'rita@yahoo.com', 'Rita', 'Brown', 'rita1', '999-999-9999', 'OH', 'rita1', '12345');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;

-- Dumping structure for table student_teacher_portal.teacher
CREATE TABLE IF NOT EXISTS `teacher` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `date_of_hire` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `zipcode` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Dumping data for table student_teacher_portal.teacher: ~2 rows (approximately)
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` (`id`, `address`, `city`, `date_of_hire`, `email`, `first_name`, `last_name`, `password`, `phone`, `state`, `title`, `user_id`, `zipcode`) VALUES
	(1, '88 Park Place', 'Whoville', '2021-03-10', 'catherine@aol.com', 'Catherine', 'Gomez', 'catherine1', '+13333333333', 'CA', 'Teacher', 'catherine1', '49302'),
	(2, '123 Normal Ave', 'Normal', '2021-01-07', 'amy@gmail.com', 'Amy', 'Smith', 'amy1', '+15555555555', 'NY', 'Teacher', 'amy1', '12345');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
