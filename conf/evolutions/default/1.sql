# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table city (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  region_id                     bigint,
  constraint pk_city primary key (id)
);

create table contact_info (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  email                         varchar(255),
  phone                         varchar(255),
  constraint pk_contact_info primary key (id)
);

create table country (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_country primary key (id)
);

create table feature (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  slug                          varchar(255),
  constraint pk_feature primary key (id)
);

create table locality (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  city_id                       bigint,
  constraint pk_locality primary key (id)
);

create table price_type (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_price_type primary key (id)
);

create table property (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  slug                          varchar(255),
  description                   varchar(255),
  for_sale                      tinyint(1) default 0,
  price                         double,
  caution                       double,
  initial_deposit               double,
  area                          double,
  bed_rooms                     integer,
  bath_rooms                    integer,
  parlors                       integer,
  kitchens                      integer,
  status                        integer,
  created_at                    datetime(6),
  property_type_id              bigint,
  price_type_id                 bigint,
  country_id                    bigint,
  region_id                     bigint,
  city_id                       bigint,
  locality_id                   bigint,
  contact_info_id               bigint,
  user_id                       bigint,
  constraint ck_property_status check ( status in (0,1,2,3)),
  constraint pk_property primary key (id)
);

create table properties (
  property_id                   bigint not null,
  feature_id                    bigint not null,
  constraint pk_properties primary key (property_id,feature_id)
);

create table property_photo (
  id                            bigint auto_increment not null,
  photo                         varchar(255),
  property_id                   bigint,
  constraint pk_property_photo primary key (id)
);

create table property_type (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  slug                          varchar(255),
  constraint pk_property_type primary key (id)
);

create table region (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  country_id                    bigint,
  constraint pk_region primary key (id)
);

create table user (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  username                      varchar(255),
  email                         varchar(255),
  phone                         varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (id)
);

alter table city add constraint fk_city_region_id foreign key (region_id) references region (id) on delete restrict on update restrict;
create index ix_city_region_id on city (region_id);

alter table locality add constraint fk_locality_city_id foreign key (city_id) references city (id) on delete restrict on update restrict;
create index ix_locality_city_id on locality (city_id);

alter table property add constraint fk_property_property_type_id foreign key (property_type_id) references property_type (id) on delete restrict on update restrict;
create index ix_property_property_type_id on property (property_type_id);

alter table property add constraint fk_property_price_type_id foreign key (price_type_id) references price_type (id) on delete restrict on update restrict;
create index ix_property_price_type_id on property (price_type_id);

alter table property add constraint fk_property_country_id foreign key (country_id) references country (id) on delete restrict on update restrict;
create index ix_property_country_id on property (country_id);

alter table property add constraint fk_property_region_id foreign key (region_id) references region (id) on delete restrict on update restrict;
create index ix_property_region_id on property (region_id);

alter table property add constraint fk_property_city_id foreign key (city_id) references city (id) on delete restrict on update restrict;
create index ix_property_city_id on property (city_id);

alter table property add constraint fk_property_locality_id foreign key (locality_id) references locality (id) on delete restrict on update restrict;
create index ix_property_locality_id on property (locality_id);

alter table property add constraint fk_property_contact_info_id foreign key (contact_info_id) references contact_info (id) on delete restrict on update restrict;
create index ix_property_contact_info_id on property (contact_info_id);

alter table property add constraint fk_property_user_id foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_property_user_id on property (user_id);

alter table properties add constraint fk_properties_property foreign key (property_id) references property (id) on delete restrict on update restrict;
create index ix_properties_property on properties (property_id);

alter table properties add constraint fk_properties_feature foreign key (feature_id) references feature (id) on delete restrict on update restrict;
create index ix_properties_feature on properties (feature_id);

alter table property_photo add constraint fk_property_photo_property_id foreign key (property_id) references property (id) on delete restrict on update restrict;
create index ix_property_photo_property_id on property_photo (property_id);

alter table region add constraint fk_region_country_id foreign key (country_id) references country (id) on delete restrict on update restrict;
create index ix_region_country_id on region (country_id);


# --- !Downs

alter table city drop foreign key fk_city_region_id;
drop index ix_city_region_id on city;

alter table locality drop foreign key fk_locality_city_id;
drop index ix_locality_city_id on locality;

alter table property drop foreign key fk_property_property_type_id;
drop index ix_property_property_type_id on property;

alter table property drop foreign key fk_property_price_type_id;
drop index ix_property_price_type_id on property;

alter table property drop foreign key fk_property_country_id;
drop index ix_property_country_id on property;

alter table property drop foreign key fk_property_region_id;
drop index ix_property_region_id on property;

alter table property drop foreign key fk_property_city_id;
drop index ix_property_city_id on property;

alter table property drop foreign key fk_property_locality_id;
drop index ix_property_locality_id on property;

alter table property drop foreign key fk_property_contact_info_id;
drop index ix_property_contact_info_id on property;

alter table property drop foreign key fk_property_user_id;
drop index ix_property_user_id on property;

alter table properties drop foreign key fk_properties_property;
drop index ix_properties_property on properties;

alter table properties drop foreign key fk_properties_feature;
drop index ix_properties_feature on properties;

alter table property_photo drop foreign key fk_property_photo_property_id;
drop index ix_property_photo_property_id on property_photo;

alter table region drop foreign key fk_region_country_id;
drop index ix_region_country_id on region;

drop table if exists city;

drop table if exists contact_info;

drop table if exists country;

drop table if exists feature;

drop table if exists locality;

drop table if exists price_type;

drop table if exists property;

drop table if exists properties;

drop table if exists property_photo;

drop table if exists property_type;

drop table if exists region;

drop table if exists user;

