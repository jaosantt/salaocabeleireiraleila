CREATE DATABASE  IF NOT EXISTS `dbsalon` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `dbsalon`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: dbsalon
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `agenda`
--

DROP TABLE IF EXISTS `agenda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agenda` (
  `id_agenda` int NOT NULL AUTO_INCREMENT,
  `agen_data` datetime NOT NULL,
  `id_cliente` int NOT NULL,
  `id_servico` int NOT NULL,
  `id_situacao` int NOT NULL,
  PRIMARY KEY (`id_agenda`),
  KEY `id_cliente` (`id_cliente`),
  KEY `id_situacao` (`id_situacao`),
  KEY `id_servico` (`id_servico`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agenda`
--

LOCK TABLES `agenda` WRITE;
/*!40000 ALTER TABLE `agenda` DISABLE KEYS */;
INSERT INTO `agenda` VALUES (1,'2023-06-21 14:30:00',5,8,1);
/*!40000 ALTER TABLE `agenda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `id_cliente` int NOT NULL AUTO_INCREMENT,
  `cli_nome` varchar(32) DEFAULT NULL,
  `cli_cpf` varchar(11) DEFAULT NULL,
  `cli_sexo` enum('M','F') DEFAULT NULL,
  `cli_telefone` varchar(11) DEFAULT NULL,
  `cli_email` varchar(255) DEFAULT NULL,
  `cli_endereco` varchar(50) DEFAULT NULL,
  `cli_bairro` varchar(30) DEFAULT NULL,
  `cli_cep` varchar(8) DEFAULT NULL,
  `cli_cidade` varchar(26) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`),
  UNIQUE KEY `cli_cpf` (`cli_cpf`),
  UNIQUE KEY `cli_email` (`cli_email`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'Leila Pereira','12345678901','F','9876543210','leila.cabeleireira@email.com','Rua A','Centro','12345678','São Paulo'),(2,'Maria Santos','98765432101','F','1234567890','maria.santos@email.com','Rua B','Bairro 1','87654321','Rio de Janeiro'),(3,'José Oliveira','23456789012','M','6543210987','jose.oliveira@email.com','Rua C','Bairro 2','23456789','Brasília'),(4,'Ana Pereira','34567890123','F','3210987654','ana.pereira@email.com','Rua D','Bairro 3','34567890','Salvador'),(5,'Carlos Ferreira','45678901234','M','8765432109','carlos.ferreira@email.com','Rua E','Bairro 4','45678901','Porto Alegre'),(6,'Mariana Costa','56789012345','F','5432109876','mariana.costa@email.com','Rua F','Bairro 5','56789012','Curitiba'),(7,'Fernando Souza','67890123456','M','2109876543','fernando.souza@email.com','Rua G','Bairro 6','67890123','Belém'),(8,'Lúcia Almeida','78901234567','F','4321098765','lucia.almeida@email.com','Rua H','Bairro 7','78901234','Recife'),(9,'Roberto Santos','89012345678','M','1098765432','roberto.santos@email.com','Rua I','Bairro 8','89012345','Fortaleza'),(10,'Juliana Lima','90123456789','F','0987654321','juliana.lima@email.com','Rua J','Bairro 9','90123456','Manaus');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcao`
--

DROP TABLE IF EXISTS `funcao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcao` (
  `id_funcao` int NOT NULL AUTO_INCREMENT,
  `func_descricao` varchar(45) NOT NULL,
  `id_tp_tratamento` int NOT NULL,
  PRIMARY KEY (`id_funcao`),
  KEY `id_tp_tratamento` (`id_tp_tratamento`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcao`
--

LOCK TABLES `funcao` WRITE;
/*!40000 ALTER TABLE `funcao` DISABLE KEYS */;
INSERT INTO `funcao` VALUES (1,'Corte Feminino',1),(2,'Corte Masculino',1),(3,'Barba',2),(4,'Sombracelha',3),(5,'Manicure',4),(6,'Pedicure',4),(7,'Manicure e Pedicure',4);
/*!40000 ALTER TABLE `funcao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionario` (
  `id_funcionario` int NOT NULL AUTO_INCREMENT,
  `fun_nome` varchar(32) DEFAULT NULL,
  `fun_cpf` varchar(11) DEFAULT NULL,
  `id_profissao` int NOT NULL,
  `fun_sexo` enum('M','F') DEFAULT NULL,
  `fun_telefone` varchar(11) DEFAULT NULL,
  `fun_email` varchar(255) DEFAULT NULL,
  `fun_endereco` varchar(50) DEFAULT NULL,
  `fun_bairro` varchar(30) DEFAULT NULL,
  `fun_cep` varchar(8) DEFAULT NULL,
  `fun_cidade` varchar(26) DEFAULT NULL,
  PRIMARY KEY (`id_funcionario`),
  UNIQUE KEY `fun_cpf` (`fun_cpf`),
  KEY `id_profissao` (`id_profissao`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES (1,'João Silva','11111111111',1,'M','9999999999','joao.silva@example.com','Rua A','Bairro 1','11111111','Cidade 1'),(2,'Maria Santos','22222222222',2,'F','8888888888','maria.santos@example.com','Rua B','Bairro 2','22222222','Cidade 2'),(3,'Pedro Oliveira','33333333333',3,'M','7777777777','pedro.oliveira@example.com','Rua C','Bairro 3','33333333','Cidade 3'),(4,'Ana Rodrigues','44444444444',1,'F','6666666666','ana.rodrigues@example.com','Rua D','Bairro 4','44444444','Cidade 4'),(5,'Lucas Costa','55555555555',2,'M','5555555555','lucas.costa@example.com','Rua E','Bairro 5','55555555','Cidade 5');
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profissao`
--

DROP TABLE IF EXISTS `profissao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profissao` (
  `id_profissao` int NOT NULL AUTO_INCREMENT,
  `prof_descricao` varchar(45) NOT NULL,
  PRIMARY KEY (`id_profissao`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profissao`
--

LOCK TABLES `profissao` WRITE;
/*!40000 ALTER TABLE `profissao` DISABLE KEYS */;
INSERT INTO `profissao` VALUES (1,'Cabeleireiro'),(2,'Barbeiro'),(3,'Manicuro');
/*!40000 ALTER TABLE `profissao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servico`
--

DROP TABLE IF EXISTS `servico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `servico` (
  `id_servico` int NOT NULL AUTO_INCREMENT,
  `id_profissao` int NOT NULL,
  `id_funcao` int NOT NULL,
  `ser_valor` double NOT NULL,
  `tempo` time DEFAULT NULL,
  PRIMARY KEY (`id_servico`),
  KEY `id_profissao` (`id_profissao`),
  KEY `id_funcao` (`id_funcao`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servico`
--

LOCK TABLES `servico` WRITE;
/*!40000 ALTER TABLE `servico` DISABLE KEYS */;
INSERT INTO `servico` VALUES (1,1,1,80,'00:40:00'),(2,1,2,60,'00:40:00'),(3,2,2,30,'00:30:00'),(4,2,3,15,'00:20:00'),(5,1,4,10,'00:15:00'),(6,2,4,10,'00:15:00'),(7,3,5,40,'00:30:00'),(8,3,6,40,'00:30:00'),(9,3,7,80,'00:30:00');
/*!40000 ALTER TABLE `servico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `situacao`
--

DROP TABLE IF EXISTS `situacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `situacao` (
  `id_situacao` int NOT NULL AUTO_INCREMENT,
  `sit_descricao` varchar(23) DEFAULT NULL,
  PRIMARY KEY (`id_situacao`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `situacao`
--

LOCK TABLES `situacao` WRITE;
/*!40000 ALTER TABLE `situacao` DISABLE KEYS */;
INSERT INTO `situacao` VALUES (1,'Aguardando confirmação'),(2,'Agendado'),(3,'Realizado'),(4,'Cancelado');
/*!40000 ALTER TABLE `situacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_tratamento`
--

DROP TABLE IF EXISTS `tipo_tratamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_tratamento` (
  `id_tp_tratamento` int NOT NULL AUTO_INCREMENT,
  `trat_desc` varchar(35) NOT NULL,
  PRIMARY KEY (`id_tp_tratamento`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_tratamento`
--

LOCK TABLES `tipo_tratamento` WRITE;
/*!40000 ALTER TABLE `tipo_tratamento` DISABLE KEYS */;
INSERT INTO `tipo_tratamento` VALUES (1,'Cabelo'),(2,'Barba'),(3,'Sombracelha'),(4,'Mão e pé');
/*!40000 ALTER TABLE `tipo_tratamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `login` varchar(16) NOT NULL,
  `senha` varchar(16) NOT NULL,
  `id_cliente` int DEFAULT NULL,
  `user_status` enum('USER','ADMIN') DEFAULT NULL,
  PRIMARY KEY (`id_usuario`),
  UNIQUE KEY `login` (`login`),
  KEY `id_cliente` (`id_cliente`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'admin','admin',1,'ADMIN'),(2,'maria456','senha456',2,'USER'),(3,'jose789','senha789',3,'USER'),(4,'ana123','senha123',4,'USER'),(5,'carlos456','senha456',5,'USER'),(6,'mariana789','senha789',6,'USER'),(7,'fernando123','senha123',7,'USER'),(8,'lucia456','senha456',8,'USER'),(9,'roberto789','senha789',9,'USER'),(10,'juliana123','senha123',10,'USER');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'dbsalon'
--

--
-- Dumping routines for database 'dbsalon'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-13 16:42:08
