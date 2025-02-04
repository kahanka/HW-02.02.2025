CREATE TABLE users (
        first_name VARCHAR(255) NOT NULL,
last_name VARCHAR(255) NOT NULL,
email VARCHAR(255) UNIQUE NOT NULL,
phone VARCHAR(20),
address VARCHAR(255),
username VARCHAR(255),
password VARCHAR(255) NOT NULL,
role VARCHAR(255) DEFAULT 'USER',
PRIMARY KEY (username)
    );

CREATE TABLE notes(
        id INT AUTO_INCREMENT,
        text VARCHAR(255) NOT NULL,
creation_date DATE NOT NULL,
edited BOOLEAN NOT NULL DEFAULT FALSE,
user_username VARCHAR(255) NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY(user_username) REFERENCES users(username)
        );

INSERT INTO users (first_name, last_name, email, phone, address, username, password, role) VALUES
('Miki', 'Gabay', 'mikigabay@gmail.com', '0585236376', '45 Ben Eliezer St', 'mikigabay', '$2a$10$24P9JHWZJm8yRsJRpP4a.e11OvU9ynMvz6XAKJOrxl8Nhph7mojJ2', 'USER'),
        ('Amitay', 'Gabay', 'amitaygabay1@gmail.com', '0504380333', '38 Erez St', 'amitaygabay', '$2a$10$K78Qy75RrDNQcAolPojuM.sI.otXpP23xhZYJ7p2fXrIMoI.k2ehO', 'ADMIN');

INSERT INTO notes (text, creation_date, edited, user_username) VALUES
('Finish React project', CURRENT_DATE, FALSE, 'amitaygabay'),
        ('Read up on Spring Boot', CURRENT_DATE, FALSE, 'amitaygabay'),
        ('Plan next week’s tasks', CURRENT_DATE, FALSE, 'amitaygabay'),
        ('Review JavaScript fundamentals', CURRENT_DATE, FALSE, 'amitaygabay'),
        ('Submit expense report', CURRENT_DATE, FALSE, 'amitaygabay'),
        ('Organize workspace', CURRENT_DATE, FALSE, 'amitaygabay'),
        ('Reply to client emails', CURRENT_DATE, FALSE, 'amitaygabay'),
        ('Prepare presentation slides', CURRENT_DATE, FALSE, 'amitaygabay'),
        ('Team meeting notes', CURRENT_DATE, FALSE, 'amitaygabay'),
        ('Backup project files', CURRENT_DATE, FALSE, 'amitaygabay'),
        ('Grocery shopping', CURRENT_DATE, FALSE, 'mikigabay'),
        ('Complete monthly report', CURRENT_DATE, FALSE, 'mikigabay'),
        ('Schedule doctor appointment', CURRENT_DATE, FALSE, 'mikigabay'),
        ('Plan vacation itinerary', CURRENT_DATE, FALSE, 'mikigabay'),
        ('Organize photo albums', CURRENT_DATE, FALSE, 'mikigabay'),
        ('Research new recipes', CURRENT_DATE, FALSE, 'mikigabay'),
        ('Finish book club reading', CURRENT_DATE, FALSE, 'mikigabay'),
        ('Update LinkedIn profile', CURRENT_DATE, FALSE, 'mikigabay'),
        ('Prepare for team workshop', CURRENT_DATE, FALSE, 'mikigabay'),
        ('Clean out email inbox', CURRENT_DATE, FALSE, 'mikigabay');

SELECT * FROM users;

SELECT * FROM notes;

SELECT * FROM notes WHERE user_username = 'mikigabay';

INSERT INTO users (first_name, last_name, email, phone, address, username, password, role) VALUES
('Refael', 'Kushnir', 'refael@gmail.com', '0542810811', 'Haportzim 20 Haifa', 'refaelkushnir', '@536780678bdfdfgfgrety02348', 'ADMIN');