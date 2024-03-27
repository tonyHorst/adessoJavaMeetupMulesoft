-- Database export via SQLPro (https://www.sqlprostudio.com/)
-- Exported by tony.horst at 27-03-2024 09:57.
-- WARNING: This file may contain descructive statements such as DROPs.
-- Please ensure that you are running the script at the proper location.


-- BEGIN TABLE employee
DROP TABLE IF EXISTS employee;
CREATE TABLE `employee` (
  `id` varchar(1024) DEFAULT NULL,
  `vacationDays` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Inserting 9 rows into employee
-- Insert batch #1
INSERT INTO employee (id, vacationDays) VALUES
('dea4d45b-e4b1-4d6a-a1f1-69ad5e46329e', 100),
('a36497dc-69b7-4842-82ab-dfa98162d96b', 21),
('974e9d5b-60e3-4f1a-8617-131414fd32d1', 21),
('79058cee-2c3f-41d6-8bb2-ea3ad243b73b', 21),
('9f1a6931-d056-42a6-829f-7b2670d4e968', 350),
('9f1a6931-d056-42a6-829f-7b2670d4e969', 21),
('9f1a6931-d056-42a6-829f-7b2670d4e960', 350),
('9f1a6931-d056-42a6-829f-7b2670d4e961', 350),
('9f1a6931-d056-42a6-829f-7b2670d4e962', 21);

-- END TABLE employee

