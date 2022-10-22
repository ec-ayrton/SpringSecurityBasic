CREATE TABLE usuario (
    id uuid NOT NULL,
    senha varchar(255) NOT NULL,
    usuario varchar(255) NOT NULL,
    CONSTRAINT unique_user UNIQUE (usuario),
    CONSTRAINT usuario_pkey PRIMARY KEY (id)
);