CREATE TABLE usuario_roles (
    usuario_id uuid NOT NULL,
    role_id uuid NOT NULL
);

ALTER TABLE usuario_roles ADD CONSTRAINT fkqblnumndby0ftm4c7sg6uso6p FOREIGN KEY (usuario_id) REFERENCES usuario(id);
ALTER TABLE usuario_roles ADD CONSTRAINT fktk4qndf0xt1ijkk4a7wj5vnwb FOREIGN KEY (role_id) REFERENCES roles(id);