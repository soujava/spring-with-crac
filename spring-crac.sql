create table `spring-crac`.attendee
(
    id   bigint auto_increment
        primary key,
    name varchar(255) null
);

create table `spring-crac`.attendee_technologies
(
    attendee_id bigint       not null,
    technology  varchar(255) null,
    constraint FKcgkfv5bqtlsa3231a6ua2orxn
        foreign key (attendee_id) references `spring-crac`.attendee (id)
);

-- Insert attendees
INSERT INTO attendee (id,name) VALUES
                                   (1,'Attendee 1'), (2,'Attendee 2'), (3,'Attendee 3'),
                                   (4,'Attendee 4'), (5,'Attendee 5'), (6,'Attendee 6'),
                                   (7,'Attendee 7'), (8,'Attendee 8'), (9,'Attendee 9'),
                                   (10,'Attendee 10'), (11,'Attendee 11'), (12,'Attendee 12'),
                                   (13,'Attendee 13'), (14,'Attendee 14'), (15,'Attendee 15'),
                                   (16,'Attendee 16'), (17,'Attendee 17'), (18,'Attendee 18'),
                                   (19,'Attendee 19'), (20,'Attendee 20'), (21,'Attendee 21'),
                                   (22,'Attendee 22'), (23,'Attendee 23'), (24,'Attendee 24'),
                                   (25,'Attendee 25'), (26,'Attendee 26'), (27,'Attendee 27'),
                                   (28,'Attendee 28'), (29,'Attendee 29'), (30,'Attendee 30');


INSERT INTO attendee_technologies (attendee_id, technology) VALUES
                                                                (1, 'Java'), (2, 'Java'), (3, 'Java'),
                                                                (4, 'Java'), (5, 'Java'), (6, 'Java'),
                                                                (7, 'Java'), (8, 'Java'), (9, 'Java'),
                                                                (10, 'Java'), (11, 'Java'), (12, 'Java'),
                                                                (13, 'Java'), (14, 'Java'), (15, 'Java'),
                                                                (16, 'Java'), (17, 'Java'), (18, 'Java'),
                                                                (19, 'Java'), (20, 'Java'), (21, 'Java'),
                                                                (22, 'Java'), (23, 'Java'), (24, 'Java'),
                                                                (25, 'Java'), (26, 'Java'), (27, 'Java'),
                                                                (28, 'Java'), (29, 'Java'), (30, 'Java');


INSERT INTO attendee_technologies (attendee_id, technology) VALUES
                                                                (1, 'MySQL'), (2, 'PostgreSQL'), (3, 'Docker'),
                                                                (4, 'Redis'), (5, 'MongoDB'), (6, 'Cassandra'),
                                                                (7, 'MySQL'), (8, 'PostgreSQL'), (9, 'Docker'),
                                                                (10, 'Redis'), (11, 'MongoDB'), (12, 'Cassandra'),
                                                                (13, 'MySQL'), (14, 'PostgreSQL'), (15, 'Docker'),
                                                                (16, 'Redis'), (17, 'MongoDB'), (18, 'Cassandra'),
                                                                (19, 'MySQL'), (20, 'PostgreSQL'), (21, 'Docker'),
                                                                (22, 'Redis'), (23, 'MongoDB'), (24, 'Cassandra'),
                                                                (25, 'MySQL'), (26, 'PostgreSQL'), (27, 'Docker'),
                                                                (28, 'Redis'), (29, 'MongoDB'), (30, 'Cassandra');