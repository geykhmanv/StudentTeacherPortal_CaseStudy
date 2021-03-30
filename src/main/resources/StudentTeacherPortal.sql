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

-- Dumping data for table student_teacher_portal.course_teacher: ~4 rows (approximately)
/*!40000 ALTER TABLE `course_teacher` DISABLE KEYS */;
INSERT INTO `course_teacher` (`teacher_id`, `courses_id`) VALUES
	(1, 3),
	(1, 9),
	(2, 2),
	(2, 5);
/*!40000 ALTER TABLE `course_teacher` ENABLE KEYS */;

-- Dumping data for table student_teacher_portal.student: ~2 rows (approximately)
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`id`, `address`, `city`, `date_of_enrollment`, `email`, `first_name`, `last_name`, `password`, `phone`, `state`, `user_id`, `zipcode`) VALUES
	(1, '55 Spruce Street', 'London', '2021-03-30', 'brian@gmail.com', 'Brian', 'Johnson', 'brian1', '444-444-4444', 'MA', 'brian1', '12345'),
	(2, '78 Null Road', 'Paris', '2019-05-30', 'rita@yahoo.com', 'Rita', 'Brown', 'rita1', '999-999-9999', 'OH', 'rita1', '12345');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;

-- Dumping data for table student_teacher_portal.teacher: ~2 rows (approximately)
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` (`id`, `address`, `city`, `date_of_hire`, `email`, `first_name`, `last_name`, `password`, `phone`, `state`, `title`, `user_id`, `zipcode`) VALUES
	(1, '88 Park Place', 'Whoville', '2021-03-10', 'catherine@aol.com', 'Catherine', 'Gomez', 'catherine1', '+13333333333', 'CA', 'Teacher', 'catherine1', '49302'),
	(2, '123 Normal Ave', 'Normal', '2021-01-07', 'amy@gmail.com', 'Amy', 'Smith', 'amy1', '+15555555555', 'NY', 'Teacher', 'amy1', '12345');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
