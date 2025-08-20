CREATE TABLE users (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(200) NOT NULL,
    enabled BIT NOT NULL
);

CREATE TABLE authorities (
    id INT IDENTITY(1,1) PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    CONSTRAINT fk_user FOREIGN KEY (username) REFERENCES users(username)
);
