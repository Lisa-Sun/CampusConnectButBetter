DELETE FROM student_info
WHERE student_id = '1234abcd';

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
	degree_level
	)
VALUES
	('1234abcd',
	'John',
	'Smith',
	'JSmith@depaul.edu',
	'abcd1234',
	3.6,
	10452.2,
	5,
	1,
	'Undergraduate');
