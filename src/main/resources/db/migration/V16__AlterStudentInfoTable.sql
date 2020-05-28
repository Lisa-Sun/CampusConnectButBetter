ALTER TABLE student_info
ADD Email varchar(50),
ADD pwd varchar(10),
ADD GPA NUMERIC (3, 2),
ADD Account_Balance NUMERIC (7, 2),
ADD Major INTEGER,
ADD Minor INTEGER,
ADD degree_level varchar(20),
ADD last_name_first_two VARCHAR(3),
ADD schedule jsonb
;