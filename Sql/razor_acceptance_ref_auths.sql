create table if not exists razor_acceptance_ref_auths(
razor_acceptance_code Integer not null,
group_code Integer null,
sequence_id Integer null,
role_id varchar(255) null,
group_name varchar(255) null,
ref_auth_type_code Integer null,
ref_auth_type varchar(255) null,
ref_auth_type_desc varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint razor_acceptance_ref_auths_pk primary key(razor_acceptance_code));
