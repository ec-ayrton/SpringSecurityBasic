INSERT INTO public.roles (id,role_name) VALUES
                                            ('1cfe6da1-c144-41e7-a375-3df40d379e17','ROLE_ADMIN'),
                                            ('70b12132-1258-4474-b788-5e1fe76f297a','ROLE_USER');


INSERT INTO public.usuario (id,senha,usuario) VALUES
                                                  ('ce08812e-4f36-11ed-bdc3-0242ac120002','$2a$10$f/wkgg8x4RGWFEbZF1dlhOAGNyq3Q6shPX5lDqtx6p2Orlz6vmbgK','bob'),
                                                  ('90ef75ae-4f36-11ed-bdc3-0242ac120002','$2a$10$f/wkgg8x4RGWFEbZF1dlhOAGNyq3Q6shPX5lDqtx6p2Orlz6vmbgK','akon');


INSERT INTO public.usuario_roles (usuario_id,role_id) VALUES
                                                          ('90ef75ae-4f36-11ed-bdc3-0242ac120002','1cfe6da1-c144-41e7-a375-3df40d379e17'),
                                                          ('ce08812e-4f36-11ed-bdc3-0242ac120002','70b12132-1258-4474-b788-5e1fe76f297a');

