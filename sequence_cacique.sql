-- --------------------------------------------------------
-- Servidor:                     localhost
-- Versão do servidor:           8.0.19 - MySQL Community Server - GPL
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para controle_freq_cacique
CREATE DATABASE IF NOT EXISTS `controle_freq_cacique` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `controle_freq_cacique`;

-- Copiando estrutura para tabela controle_freq_cacique.frequencia
CREATE TABLE IF NOT EXISTS `frequencia` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(80) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `tia` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `horaEntrada` time DEFAULT NULL,
  `horaSaida` time DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela controle_freq_cacique.frequencia: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `frequencia` DISABLE KEYS */;
INSERT INTO `frequencia` (`id`, `nome`, `tia`, `horaEntrada`, `horaSaida`) VALUES
	(1, 'carlos', '31929856', '13:00:00', '14:00:00'),
	(2, 'thiago', '31929028', '06:00:00', '10:00:00'),
	(3, 'carol', '31946528', '06:00:00', '09:00:00'),
	(4, 'roberto', '3192746', '07:30:00', '10:00:00'),
	(5, 'luiza', '31948258', '05:00:00', '17:00:00');
/*!40000 ALTER TABLE `frequencia` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
