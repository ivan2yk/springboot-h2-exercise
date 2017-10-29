insert into state(id, name) values(1, 'ANCASH');
insert into state(id, name) values(2, 'AREQUIPA');
insert into state(id, name) values(3, 'TRUJILLO');
insert into state(id, name) values(4, 'CUSCO');
insert into state(id, name) values(5, 'PIURA');

insert into colaborador(id, created_on, dni, email, first_name, last_name) values (1, current_timestamp(), '46467850', 'iperez@inclouds.biz', 'Inigo', 'Perez Rojas');
insert into colaborador(id, created_on, dni, email, first_name, last_name) values (2, current_timestamp(), '46234444', 'aaronaca@inclouds.biz', 'Angel', 'Alocana Rodriguez');
insert into colaborador(id, created_on, dni, email, first_name, last_name) values (3, current_timestamp(), '40999000', 'jpevi@inclouds.biz', 'Joel', 'Pena Vilcherrez');

insert into road_map(id, created_on, road_map_date, colaborador_id, state_id) values (1, current_timestamp(), current_date(), 1, 1);
insert into road_map(id, created_on, road_map_date, colaborador_id, state_id) values (2, current_timestamp(), current_date(), 2, 2);
insert into road_map(id, created_on, road_map_date, colaborador_id, state_id) values (3, current_timestamp(), current_date(), 2, 1);

insert into accion(id, accion, created_on, road_map_id) values (1, 'VISITA', current_timestamp(), 1);
insert into accion(id, accion, created_on, road_map_id) values (2, 'RECOJO', current_timestamp(), 1);
insert into accion(id, accion, created_on, road_map_id) values (3, 'ENTREGA', current_timestamp(), 1);
insert into accion(id, accion, created_on, road_map_id) values (4, 'RECOJO', current_timestamp(), 2);
insert into accion(id, accion, created_on, road_map_id) values (5, 'ENTREGA', current_timestamp(), 2);