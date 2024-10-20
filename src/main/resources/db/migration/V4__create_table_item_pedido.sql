CREATE TABLE item_pedido (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    quantidade INT NOT NULL,
    precoUnitario DECIMAL(10, 2) NOT NULL,
    pedido_id BIGINT,
    produto_id BIGINT,
    CONSTRAINT fk_pedido FOREIGN KEY (pedido_id) REFERENCES Pedido(id),
    CONSTRAINT fk_produto FOREIGN KEY (produto_id) REFERENCES Produto(id)
);