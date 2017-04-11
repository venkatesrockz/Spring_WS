create table user_data(
  user_id  int(3) primary key,
  user_name varchar(50),
  user_email varchar(100)
  );
  
insert into user_data values (1, 'surya1','surya1@webb.com');

select * from user_data;

ALTER TABLE user_data MODIFY COLUMN user_id INT(20) AUTO_INCREMENT;