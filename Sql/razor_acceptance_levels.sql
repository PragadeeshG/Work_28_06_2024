create table if not exists razor_acceptance_levels(
razor_acceptance_code Integer not null,
razor_acceptance_tree_id Integer  null,
razor_acceptance_tree_effective_date varchar(255) null,
razor_acceptance_tree_code Integer null,
razor_acceptance_tree_description varchar(255) null,
corporate_bonds1 varchar(255) null,
corporate_bonds1_desc varchar(255) null,
corporate_bonds2 varchar(255) null,
corporate_bonds2_desc varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint razor_acceptance_levels_pk primary key(razor_acceptance_code));

