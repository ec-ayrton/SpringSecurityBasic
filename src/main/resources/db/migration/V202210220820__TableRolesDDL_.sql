CREATE TABLE roles (
    id uuid NOT NULL,
    role_name varchar(255) NOT NULL,
    CONSTRAINT roles_pkey PRIMARY KEY (id),
    CONSTRAINT role_unique UNIQUE (role_name)
);