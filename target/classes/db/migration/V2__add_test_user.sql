-- Tài khoản admin
INSERT INTO users (username, password, enabled)
VALUES ('admin', '{noop}adminpass', 1);

INSERT INTO authorities (username, authority)
VALUES ('admin', 'ROLE_ADMIN');

-- Tài khoản user
INSERT INTO users (username, password, enabled)
VALUES ('user1', '{noop}password', 1);

INSERT INTO authorities (username, authority)
VALUES ('user1', 'ROLE_USER');
