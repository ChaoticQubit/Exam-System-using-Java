-- MySQL dump 10.13  Distrib 5.1.33, for Win32 (ia32)
--
-- Host: localhost    Database: exam
-- ------------------------------------------------------
-- Server version	5.1.33-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `status` int(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `question` (
  `id` int(11) NOT NULL,
  `ques` varchar(1000) DEFAULT NULL,
  `op1` varchar(50) DEFAULT NULL,
  `op2` varchar(50) DEFAULT NULL,
  `op3` varchar(50) DEFAULT NULL,
  `op4` varchar(50) DEFAULT NULL,
  `ans` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (1,'What is the range of short data type in Java?',' -128 to 127','-32768 to 32767',' -2147483648 to 2147483647','None of the mentioned',2),(2,'Which of the following can be operands of arithmetic operators?','Numeric','Boolean','Characters','Both Numeric & Characters',4),(3,'Modulus operator, %, can be applied to which of these?','Integers','Floating – point numbers','Both Integers and floating – point numbers.','None of the mentioned',3),(4,'What is the full form of JDBC?','Java Dabase Connection','Java Database computer','Java Data Computer','Java dataset Computer',1),(5,'Which of these is not a bitwise operator?','&','&=','|=','<=',4),(6,'Which operator is used to invert all the digits in binary representation of a number?','~','<<<','>>>','^',1),(7,'On applying Left shift operator, <<, on an integer bits are lost one they are shifted past which position bit?','1','32','33','31',4),(8,'Which right shift operator preserves the sign of the value?','<<','>>','<<=','>>=',2),(9,'Which of these operators is used to allocate memory to array variable in Java?\n','malloc','alloc','new','new malloc',3),(10,'Which of these is an incorrect array declaration?','int arr[] = new int[5]','int [] arr = new int[5]','int arr[] = new int[5]','int arr[] = int [5] new',4),(11,'What will this code print?\n int arr[] = new int [5];\n    System.out.print(arr);','0','value stored in arr[0]','00000','Class name@ hashcode in hexadecimal form',1),(12,'Which of these is necessary to specify at time of array initialization?','row','coloumn','both','None',1),(13,' What is the output of this program?\n        class array_output \n\n        {\n\n            public static void main(String args[]) \n\n            {\n\n                int array_variable [] = new int[10];\n\n    	    for (int i = 0; i < 10; ++i) \n\n                {\n\n                    array_variable[i] = i;\n\n                    System.out.print(array_variable[i] + \" \");\n\n                    i++;\n\n                }\n\n            } \n\n        }',' 0 2 4 6 8','1 3 5 7 9','0 1 2 3 4 5 6 7 8 9','1 2 3 4 5 6 7 8 9 10',1),(14,'What is the output of this program?\n        class evaluate \n\n        {\n\n            public static void main(String args[]) \n\n                {\n\n    	        int arr[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};\n\n    	        int n = 6;\n\n                    n = arr[arr[n] / 2];\n\n    	        System.out.println(arr[n] / 2);\n\n                } \n\n        }','3','0','6','1',4),(15,' What is the output of this program?\n        class array_output \n\n        {\n\n            public static void main(String args[]) \n\n            {\n\n                int array_variable[][] = {{ 1, 2, 3}, { 4 , 5, 6}, { 7, 8, 9}};\n\n                int sum = 0;\n\n                for (int i = 0; i < 3; ++i)\n\n                    for (int j = 0; j <  3 ; ++j)\n\n                        sum = sum + array_variable[i][j];\n\n                System.out.print(sum / 5);\n\n            } \n\n        }','8','9','10','11',2),(16,'Which of the following is not OOPS concept in Java?','Inheritance','encapsulation','polymorphism','compilation',4),(17,' Which of the following is a type of polymorphism in Java?','Compile time polymorphism','Execution time polymorphism','Multiple polymorphism','Multilevel polymorphism',1);
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test`
--

DROP TABLE IF EXISTS `test`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `test` (
  `id` int(11) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `ques_id` int(11) DEFAULT NULL,
  `btn_id` int(11) DEFAULT NULL,
  `answered` int(2) DEFAULT NULL,
  `marked` int(2) DEFAULT NULL,
  `answer` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test`
--

LOCK TABLES `test` WRITE;
/*!40000 ALTER TABLE `test` DISABLE KEYS */;
/*!40000 ALTER TABLE `test` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `mobile` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-06 16:15:54
