CREATE TABLE usuario_roles (
    usuario_id uuid NOT NULL,
    role_id uuid NOT NULL
);

ALTER TABLE usuario_roles ADD CONSTRAINT user_reference FOREIGN KEY (usuario_id) REFERENCES usuario(id);
ALTER TABLE usuario_roles ADD CONSTRAINT roles_reference FOREIGN KEY (role_id) REFERENCES roles(id);