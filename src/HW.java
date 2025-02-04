CREATE DATABASE CourseManagement;
USE CourseManagement;

CREATE TABLE users2 (
        id INT PRIMARY KEY AUTO_INCREMENT,
        first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
password VARCHAR(255) NOT NULL,
email VARCHAR(100) UNIQUE NOT NULL
);


CREATE TABLE Courses (
        id INT PRIMARY KEY AUTO_INCREMENT,
        course_name VARCHAR(100) NOT NULL,
course_date DATE NOT NULL,
max_students INT NOT NULL
);



CREATE TABLE Students (
        id INT PRIMARY KEY AUTO_INCREMENT,
        first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
age INT NOT NULL,
phone_number VARCHAR(20) NOT NULL,
course_id INT,
registered_by INT,
FOREIGN KEY (course_id) REFERENCES Courses(id) ON DELETE SET NULL,
FOREIGN KEY (registered_by) REFERENCES Users(id) ON DELETE SET NULL
);


CREATE TABLE Enrollment (
        id INT PRIMARY KEY AUTO_INCREMENT,
        user_id INT NOT NULL,
        student_id INT NOT NULL,
        course_id INT NOT NULL,
        FOREIGN KEY (user_id) REFERENCES Users(id) ON DELETE CASCADE,
FOREIGN KEY (student_id) REFERENCES Students(id) ON DELETE CASCADE,
FOREIGN KEY (course_id) REFERENCES Courses(id) ON DELETE CASCADE,
UNIQUE (user_id, student_id, course_id)
);

INSERT INTO users2 (id, first_name, last_name, password, email) VALUES
('001','Miki', 'Gabay','@435655654Ddfgfd','mikigabay@gmail.com'),
        ('002', 'Amitay', 'Gabay', '@435645GFHGFgfh','amitaygabay1@gmail.com'),
        ('003', 'Rephael', 'Kushnir','@#$%^$^%gFGHGFH546f', 'refael@gmail.com');

INSERT INTO Courses (id, course_name, course_date, max_students) VALUES
('001', 'FullStack', CURRENT_DATE, '50'),
        ('002', 'SyberSecurity', CURRENT_DATE, '50'),
        ('003', '.NET', CURRENT_DATE, '50');


SELECT * FROM users2;


