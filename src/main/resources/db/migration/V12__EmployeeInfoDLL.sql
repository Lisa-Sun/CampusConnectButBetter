--will need to work on this
--probably reduce this to just an advisor table
CREATE TYPE employeeType as ENUM ('faculty', 'staff', 'advisor', 'contractor');
CREATE TYPE employStatus as ENUM ('active', 'on leave', 'inactive', 'IN', 'OUT');

CREATE TABLE employee_info
(
	employee_id VARCHAR(100) NOT NULL,
	employee_type employeeType  NOT NULL,
	employee_status  employStatus NOT NULL,
	employee_email VARCHAR(250) NOT NULL,
	employee_number VARCHAR(30) NOT NULL,
	PRIMARY KEY (employee_id)
)