CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(100) UNIQUE,
  password_hash VARCHAR(255),
  role VARCHAR(50)
);

CREATE TABLE pets (
  id INT AUTO_INCREMENT PRIMARY KEY,
  owner_id INT,
  name VARCHAR(100),
  breed VARCHAR(100),
  dob DATE,
  notes TEXT
);

CREATE TABLE forensic_logs (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  event_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  user_id INT,
  action VARCHAR(100),
  resource VARCHAR(255),
  details TEXT,
  tamper_token VARCHAR(255)
);
