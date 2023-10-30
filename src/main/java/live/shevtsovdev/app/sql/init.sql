create table if not exists product (
                                       id bigint,
                                       product_name varchar(50),
                                       created_by bigint,
                                       attached_to bigint,
                                       created_at bigint,
                                       updated_at bigint,
                                       serial_number varchar(30),
                                       client_id bigint,
                                       document_id bigint
);