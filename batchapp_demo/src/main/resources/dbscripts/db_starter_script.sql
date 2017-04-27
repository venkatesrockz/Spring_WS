create table user_data(
  user_id  int(3) primary key,
  user_name varchar(50),
  user_email varchar(100)
  );
  
insert into user_data values (1, 'surya1','surya1@webb.com');

select * from user_data;

ALTER TABLE user_data MODIFY COLUMN user_id INT(20) AUTO_INCREMENT;

--Creating Address table
create table user_address(
  addr_id  int(20) primary key,
  user_id int(20),
  dr_no varchar(10),
  strt_name varchar(200),
  city varchar(30),
  country varchar(30),
  foreign key (user_id) references user_data(user_id)
);

ALTER TABLE user_address MODIFY COLUMN addr_id INT(20) AUTO_INCREMENT;


insert into user_address values (1,1,'12B','Medavakkam road','chennai','INDIA')