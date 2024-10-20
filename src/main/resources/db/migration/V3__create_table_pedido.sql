CREATE TABLE pedido (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    dataVenda DATETIME NOT NULL,
    pago BOOLEAN DEFAULT FALSE,
    valor DECIMAL(10, 2) NOT NULL,
    cliente_id BIGINT,
    tipo_pagamento VARCHAR(20) NOT NULL,
    CONSTRAINT fk_cliente FOREIGN KEY (cliente_id) REFERENCES Cliente (id)
);