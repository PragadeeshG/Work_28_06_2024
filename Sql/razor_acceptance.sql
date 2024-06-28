create table if not exists razor_acceptance(
razor_acceptance_code Integer not null,
hpe_rates_effective Integer null,
hpe_rates_effective_date varchar(255) null,
hpe_rates_razor_acceptance_desc varchar(255) null,
hpe_rates_razor_acceptance_short_desc varchar(255) null,
hpe_rates_decimal_positions Integer null,
hpe_rates_razor_acceptance_symbol varchar(255) null,
hpe_rates_razor_acceptance_scale varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint razor_acceptance_pk primary key(razor_acceptance_code));