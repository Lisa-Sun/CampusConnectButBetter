CREATE TYPE financialPlanType as ENUM ('grant', 'loan', 'scholarship', 'other');


CREATE TABLE financialPlans
(
	plan_id VARCHAR(150) NOT NULL,
	plan_type financialPlanType NOT NULL,
	plan_amount int,
	num_recievers int,
	more_info_link VARCHAR(300) NOT NULL,
	plan_creator VARCHAR(300) NOT NULL,
	PRIMARY KEY (plan_id)
)