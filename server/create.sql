
create table pools (id uuid not null, code varchar(255), created_at TIMESTAMP WITHOUT TIME ZONE, title varchar(255) not null, updated_at TIMESTAMP WITHOUT TIME ZONE, primary key (id));
alter table if exists pools add constraint UK_ta46i0p7cgptl9u19mqwjkw9y unique (code);
INSERT INTO pools (id, title, code, created_at, updated_at) values (gen_random_uuid(), 'Bolão do Robson', 'ROBS01', NOW(), NOW());
