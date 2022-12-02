
create table participant
(
    id   bigint generated always as identity primary key,
    name text
);

create table tip
(
    id          bigint generated always as identity primary key,
    participant bigint not null,
    points      int    not null default 0,
    foreign key (participant) references participant (id)
);

create table driver
(
    id   bigint generated always as identity primary key,
    name varchar(3) not null unique
);

create table tip_driver
(
    tip    bigint not null,
    driver bigint not null,
    foreign key (tip) references tip (id),
    foreign key (driver) references driver (id)
);

create table grand_prix
(
    id   bigint generated always as identity primary key,
    name text unique
);

create table session
(
    id           bigint generated always as identity primary key,
    grand_prix   bigint not null,
    session_type text,
    starts       timestamp,
    foreign key (grand_prix) references grand_prix (id)
);

create table session_result
(
    session   bigint,
    driver    bigint,
    placement int,
    foreign key (session) references session (id),
    foreign key (driver) references driver (id)
);
