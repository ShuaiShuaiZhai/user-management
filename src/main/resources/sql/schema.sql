CREATE TABLE users (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       username VARCHAR(50) NOT NULL UNIQUE,
                       first_name VARCHAR(50),
                       last_name VARCHAR(50),
                       email VARCHAR(100),
                       phone_number VARCHAR(15)
);

INSERT INTO users (username, first_name, last_name, email, phone_number) VALUES
                                                                             ('jdoe', 'John', 'Doe', 'jdoe@example.com', '123-456-7890'),
                                                                             ('asmith', 'Alice', 'Smith', 'asmith@example.com', '234-567-8901'),
                                                                             ('bwhite', 'Bob', 'White', 'bwhite@example.com', '345-678-9012'),
                                                                             ('mjohnson', 'Mary', 'Johnson', 'mjohnson@example.com', '456-789-0123'),
                                                                             ('clark', 'Clark', 'Kent', 'clark.kent@example.com', '567-890-1234'),
                                                                             ('ljames', 'Lisa', 'James', 'ljames@example.com', '678-901-2345'),
                                                                             ('rwilliams', 'Robert', 'Williams', 'rwilliams@example.com', '789-012-3456'),
                                                                             ('nlewis', 'Nancy', 'Lewis', 'nlewis@example.com', '890-123-4567');

