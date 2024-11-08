-- Create the CUSTOMER table
CREATE TABLE CUSTOMER (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Create the TRANSACTION table
CREATE TABLE TRANSACTION (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    date DATE NOT NULL,
    amount DOUBLE NOT NULL,
    customer_id BIGINT,
    FOREIGN KEY (customer_id) REFERENCES CUSTOMER(id)
);

-- Insert sample data into CUSTOMER table
INSERT INTO CUSTOMER (id, name) VALUES (1, 'John Doe');

-- Insert sample data into TRANSACTION table
INSERT INTO TRANSACTION (id, date, amount, customer_id) VALUES (1, '2023-01-15', 120, 1);
INSERT INTO TRANSACTION (id, date, amount, customer_id) VALUES (2, '2023-02-20', 75, 1);
INSERT INTO TRANSACTION (id, date, amount, customer_id) VALUES (3, '2023-03-10', 200, 1);