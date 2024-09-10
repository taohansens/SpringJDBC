CREATE TABLE fornecedores (
      id BIGINT AUTO_INCREMENT PRIMARY KEY,
      nome VARCHAR(255) NOT NULL,
      cnpj VARCHAR(20) NOT NULL,
      endereco VARCHAR(255)
);