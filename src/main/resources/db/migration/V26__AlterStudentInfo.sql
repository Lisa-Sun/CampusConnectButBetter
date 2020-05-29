DELETE FROM student_info
WHERE student_id = '1234abcd';

DELETE FROM student_info
WHERE student_id = '1943210';

ALTER TABLE student_info ALTER COLUMN Major TYPE VARCHAR(50);
ALTER TABLE student_info ALTER COLUMN Minor TYPE VARCHAR(50);

INSERT INTO student_info
	(student_id,
	first_name,
	last_name,
	Email,
	pwd,
	GPA,
	Account_Balance,
	Major,
	Minor,
	degree_level,
	last_name_first_two,
	schedule
	)
VALUES
	('1234abcd',
	'John',
	'Smith',
	'JSmith@depaul.edu',
	'abcd1234',
	3.6,
	'10452.2',
	'Computer Science',
	'Data Science',
	'Undergraduate',
	'SM',
	'{"monday": "d;", "tuesday": "d", "wednesday": "fdfs3", "thursday": "[]", "friday": "[]"}'
	);

INSERT INTO student_info
VALUES
	('1943210',
	 'DIBS',
	 'DePaul',
	 'DIB13@mail.depaul.edu',
	 'abcd1234',
	 '3.8',
         '12800',
	 'Computer Science',
	 'Game Design',
	 'Graduate',
	 'de'
	);