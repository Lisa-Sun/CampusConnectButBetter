CREATE TABLE professor_base_info
  (
     
     first_name VARCHAR(25),
     last_name  VARCHAR(25),
     department VARCHAR(30)
  ) INHERITS  (employee_info);