 CREATE TABLE "courses"(
    "courseId" INT GENERATED ALWAYS AS IDENTITY,
    "courseName" VARCHAR(120) NOT NULL,
     CONSTRAINT "courses_pk" PRIMARY KEY ("courseId")
 );

 CREATE TABLE "students" (
   "studentId" INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
   "courseId" INT NOT NULL,
   "studentName" VARCHAR(120) NOT NULL,
   "studentEmail" VARCHAR(120) UNIQUE NOT NULL,
   "studentPhone" VARCHAR(20),
   FOREIGN KEY ("courseId")
     REFERENCES courses("courseId")
     ON UPDATE NO ACTION
     ON DELETE NO ACTION
     NOT VALID
 );



 INSERT INTO "courses" ("courseName") VALUES ('Web Development');

 -- "courses"
 INSERT INTO "courses" ("courseName") VALUES
 ('Introduction to Computer Science'),
 ('Data Structures and Algorithms'),
 ('Database Management Systems'),
 ('Web Development Fundamentals'),
 ('Artificial Intelligence Basics'),
 ('Machine Learning Fundamentals'),
 ('Software Engineering Principles'),
 ('Computer Networks and Security'),
 ('Operating Systems Concepts'),
 ('Object-Oriented Programming'),
 ('Introduction to Python Programming'),
 ('Java Programming Essentials'),
 ('C++ Programming Fundamentals'),
 ('Data Analytics Techniques'),
 ('Information Retrieval Methods'),
 ('Mobile App Development'),
 ('Human-Computer Interaction'),
 ('Computer Graphics and Visualization'),
 ('Cloud Computing Technologies'),
 ('Big Data Analytics');


 -- "students"
 INSERT INTO "students" ("courseId", "studentName", "studentEmail", "studentPhone") VALUES
 (1, 'John Smith', 'john.smith@gmail.com', '4165551234'),
 (1, 'Emily Johnson', 'emily.johnson@yahoo.com', '6475552345'),
 (2, 'Michael Davis', 'michael.davis@hotmail.com', '9055553456'),
 (2, 'Sophia Brown', 'sophia.brown@gmail.com', '+14165554567'),
 (3, 'William Wilson', 'william.wilson@yahoo.com', '647-555-5678'),
 (3, 'Olivia Taylor', 'olivia.taylor@hotmail.com', '9055556789'),
 (4, 'James Anderson', 'james.anderson@gmail.com', '416-555-7890'),
 (4, 'Ava Thomas', 'ava.thomas@yahoo.com', '6475558901'),
 (5, 'Benjamin Martinez', 'benjamin.martinez@hotmail.com', '9055559012'),
 (5, 'Mia Hernandez', 'mia.hernandez@gmail.com', '4165550123'),
 (6, 'Daniel Lopez', 'daniel.lopez@yahoo.com', '6475551234'),
 (6, 'Charlotte Clark', 'charlotte.clark@hotmail.com', '9055552345'),
 (7, 'Joseph Lewis', 'joseph.lewis@gmail.com', '4165553456'),
 (7, 'Amelia Lee', 'amelia.lee@yahoo.com', '6475554567'),
 (8, 'David Walker', 'david.walker@hotmail.com', '9055555678'),
 (8, 'Sofia Hall', 'sofia.hall@gmail.com', '4165556789'),
 (9, 'Andrew Young', 'andrew.young@yahoo.com', '6475557890'),
 (9, 'Harper Hernandez', 'harper.hernandez@hotmail.com', '9055558901'),
 (10, 'Alexander King', 'alexander.king@gmail.com', '416-555-9012'),
 (10, 'Abigail White', 'abigail.white@yahoo.com', '6475550123'),
 (11, 'Ethan Hill', 'ethan.hill@hotmail.com', '9055551234'),
 (11, 'Emily Adams', 'emily.adams@gmail.com', '4165552345'),
 (12, 'James Wright', 'james.wright@yahoo.com', '6475553456'),
 (13, 'Avery Scott', 'avery.scott@hotmail.com', '9055554567'),
 (14, 'Logan Green', 'logan.green@gmail.com', '4165555678'),
 (15, 'Ella Martinez', 'ella.martinez@yahoo.com', '6475556789'),
 (16, 'Lucas Rodriguez', 'lucas.rodriguez@hotmail.com', '9055557890'),
 (17, 'Scarlett Perez', 'scarlett.perez@gmail.com', '4165558901'),
 (18, 'Henry Cooper', 'henry.cooper@yahoo.com', '6475559012'),
 (19,  'Jane Smith',   'jane@gmail.com', NULL),
 (5,   'Bob Wilson',  'bob@hotmail.com', NULL);

 -- Get all the courses
 SELECT "courseId", "courseName" FROM "courses";

 -- Get all the students
 SELECT "studentId", "courseId", "studentName", "studentEmail", "studentPhone" FROM "students";

 -- Get all the students who have a courseId = 1
 SELECT * FROM "students" WHERE "courseId" = 1;

 -- Get all the students whose studentId is greater than 4 but less than 20
 SELECT * FROM "students" WHERE "studentId" > 4 AND "studentId" < 10;

 -- Get all the students who do not have data stored for studentPhone
 SELECT * FROM "students" WHERE "studentPhone" IS NULL;

 -- Get all the students whose studentName starts with Jo no matter what other letters might follow the Jo
 SELECT * FROM "students" WHERE "studentName" LIKE 'Jo%';

 -- Get all the students whose courseId is present in the list (1, 5)
 SELECT * FROM "students" WHERE "courseId" IN ( 1, 5 );

 -- Get all the students whose courseIds are between 1 AND 5 inclusive
 SELECT * FROM "students" WHERE "courseId" BETWEEN 1 AND 5;

 -- Get all the students who have a courseId = 5 and a missing studentPhone
 SELECT * FROM "students" WHERE "courseId" = 5 AND "studentPhone" IS NULL;

 -- Get all the students who have a courseId that is either 1 or 2
 SELECT * FROM "students" WHERE "courseId" = 1 OR "courseId" = 2;

 INSERT INTO "courses" ("courseName")
 VALUES ('Quantum Computing');

 INSERT INTO "students" ("courseId", "studentName", "studentEmail", "studentPhone")
 VALUES (1, 'John Doe', 'john@doe.com', '4586272890');



 --Update name of the student that has studentId = 1 to 'Alex'
 UPDATE "students" SET "studentName" = 'Alex' WHERE "studentId" = 1;

 -- Update studentPhone to 18273124 where studentId = 1 and studentName = 'Alex'
 UPDATE "students" SET "studentPhone" = '4182731248' WHERE "studentName" = 'Sophia Brown';

 -- Update studentPhone to NULL where studentId greater-than 10 and less-than 12
 UPDATE "students" SET "studentPhone" = NULL WHERE "studentId" > 10 AND "studentId" < 12;



 -- Delete a student whose studentId = 1
 DELETE FROM "students" WHERE "studentId" = 1;

 -- Delete all students whose studentPhone field is empty
 DELETE FROM "students" WHERE "studentPhone" IS NULL;



 -- GROUP BY
 SELECT COUNT("studentId") AS "totalStudents", "courseId" FROM "students"
 WHERE "studentPhone" IS NOT NULL
 GROUP BY "courseId"
 ORDER BY "courseId";



 -- HAVING
 SELECT c."courseName", COUNT(s."studentId") AS "totalStudents"
 FROM "courses" c
 JOIN "students" s ON c."courseId" = s."courseId"
 GROUP BY c."courseName"
 HAVING COUNT(s."studentId") > 1;



 -- ORDER BY
 SELECT "studentId", "courseId", "studentName", "studentEmail", "studentPhone"
 FROM "students"
 ORDER BY "studentName" ASC;

 SELECT "studentId", "courseId", "studentName", "studentEmail", "studentPhone"
 FROM "students"
 ORDER BY "studentName", "studentPhone" ASC;



 -- JOIN
 -- Using dot notation, we tell PostgreSQL what we want to see output to the console: students.studentName and courses.courseName. We need the "" to tell PSQL what entities it's looking for, as explained in a previous lesson:
 SELECT "students"."studentName", "courses"."courseName"
 -- Here, we tell it the first table from which data will be taken:
 FROM "students"
 -- And then tell it to "join" that data with the other table from which the data should be taken:
 INNER JOIN "courses"
 -- Finally, we tell it what values it should be matching up in order to create the lines we want to see:
 ON "students"."courseId" = "courses"."courseId";
 -- The above will make sure that the values in students.courseId are matched up to the same values in courses.courseId.

 -- INNER JOIN
 SELECT students."studentName", courses."courseName" FROM students
 INNER JOIN courses on students."courseId" = courses."courseId";

 SELECT "courses"."courseId", "students"."studentName", "courses"."courseName"
 FROM "students"
 INNER JOIN "courses"
 ON "students"."courseId" = "courses"."courseId";

 -- LEFT (OUTER) JOIN
 SELECT * from courses
 left join students on courses."courseId" = students."courseId";

 -- RIGHT (OUTER) JOIN
 SELECT * from courses
 right join students on courses."courseId" = students."courseId";

 -- FULL (OUTER) JOIN
 SELECT * from courses
 full join students on courses."courseId" = students."courseId";


 -- ALIASES
 SELECT s.id, c.id, s.studentName, c.courseName
 FROM students
 AS s
 INNER JOIN courses
 AS c
 ON s.id = c.id


 -- DISTINCT
 -- Get a list of all the courseIds for every course that students are taking:
 SELECT DISTINCT "courseId"
 FROM "students"
 ORDER BY "courseId";

 -- Get a list of all the names of courses
 SELECT DISTINCT st."courseId", co."courseName"
 FROM "students" AS st
 INNER JOIN "courses" AS co
 ON st."courseId" = co."courseId" ORDER BY st."courseId";



-- TRIGGER
CREATE  TRIGGER triggerName [BEFORE|AFTER|INSTEAD OF]
eventName OF columnName
ON tableName
[
 -- Your trigger logic goes here....
];
-- In the above, you’ll only include one of the commands BEFORE, AFTER or INSTEAD OF, as per your needs.
-- The field denoted by eventName above refers to either an
-- INSERT, a DELETE, or an UPDATE occurring in the column defined by columnName,
-- which resides in the table named after the ON keyword.

-- Example:
CREATE TABLE "studentAudit"(
   "studentId" INT NOT NULL,
   "studentEnrolledDate" TIMESTAMP NOT NULL
);
--Let’s create a TRIGGER.
-- The statement to create a TRIGGER that inserts data into our studentAudit table would look something like this:
-- Run the following code to define the function (aka procedure) auditStudentFunc:
CREATE OR REPLACE FUNCTION auditStudentFunc() RETURNS TRIGGER AS $$
   BEGIN
      INSERT INTO "studentAudit"("studentId", "studentEnrolledDate") VALUES (new."studentId", current_timestamp);
      RETURN NEW;
   END;
$$ LANGUAGE plpgsql;

-- Create the trigger "auditTrigger," which will utilize the logic we wrote for the auditStudentFunc procedure:
CREATE TRIGGER "auditTrigger" AFTER INSERT ON "students"
FOR EACH ROW EXECUTE PROCEDURE auditStudentFunc();
-- In this example, the trigger “auditTrigger” is directly defined on the “students” table.
-- It is an “AFTER INSERT” trigger, meaning it will be activated after an insert operation is performed on the table.
-- The “FOR EACH ROW” clause specifies that the trigger will execute for each row inserted.
-- This means that, if we were to add seven students at once,
-- all seven of those students would have records created for them in the studentAudit table.



-- PROCEDURE
CREATE [ OR REPLACE ] PROCEDURE
name ( [ [ argmode ] [ argname ] argtype [ { DEFAULT | = } default_expr ] [, ...] ] )
{ LANGUAGE lang_name
| TRANSFORM { FOR TYPE type_name } [, ... ]
| [ EXTERNAL ] SECURITY INVOKER | [ EXTERNAL ] SECURITY DEFINER
| SET configuration_parameter { TO value | = value | FROM CURRENT }
| AS 'definition'
| AS 'obj_file', 'link_symbol'
| sql_body
};

-- Define and Create the store procedure as instructed (steps 1 to 8)
CREATE OR REPLACE PROCEDURE "userInsertFeed"("_userId" INTEGER,
"_content" VARCHAR, "_picture" VARCHAR)
LANGUAGE plpgsql
AS
$$
  DECLARE "userExists" INTEGER := 0;
  BEGIN
    SELECT COUNT("userId") FROM "user" INTO "userExists"
      WHERE "userId"="_userId";
    IF "userExists" != 1 THEN
      RAISE NOTICE 'Invalid user details'
    ELSE
      INSERT INTO "Feed" ("userId", "content", "picture") VALUES ("userId", "content", "picture");
    END IF;
  END;
$$

-- Call the procedure by passing values.
CALL "userInsertFeed(2, 'sljhcjfiuegweew', 'sklhfisu')";

CREATE OR REPLACE PROCEDURE insertStudent("_courseId" INTEGER, "_studentName" VARCHAR, "_studentEmail" VARCHAR, "_studentPhone" INTEGER)
LANGUAGE plpgsql
AS
$$
    BEGIN
        INSERT INTO "students" ("courseId", "studentName", "studentEmail", "studentPhone") VALUES ("_courseId", "_studentName", "_studentEmail", "_studentPhone");
    END;
$$;

-- Let's call this function and insert a student:
CALL insertStudent(1, 'Ray Panamero', 'ray@panamero.com', 38173);

-- Select all rows from the "Feed" table

SELECT * FROM 'feed';

CREATE OR REPLACE PROCEDURE insertBulkStudents("_courseId" INTEGER)
LANGUAGE plpgsql
AS
$$
    DECLARE
        randomNumberStartLimit INTEGER;
        randomNumberEndLimit INTEGER;
        randomNumberGenerated INTEGER;
    BEGIN
        randomNumberStartLimit = 10000;
        randomNumberEndLimit = 20000;
        FOR _index IN 1..50 LOOP
        randomNumberGenerated = floor(random() * (randomNumberStartLimit-randomNumberEndLimit + 1) + randomNumberEndLimit);
        INSERT INTO "students"("courseId", "studentName", "studentEmail", "studentPhone") VALUES ("_courseId",concat('Student',_index),concat('student',_index,'@email.com'),randomNumberGenerated);
        END LOOP;
    END;
$$;

-- Let's call this procedure and perform the bulk insert:
CALL insertBulkStudents(1);

-- PUTTING PROCEDURE INSIDE A TRIGGER
CREATE TRIGGER "auditTrigger" AFTER
INSERT ON "students"
FOR EACH ROW EXECUTE FUNCTION auditStudentFunc();


-- VIEW
CREATE VIEW "allUsersWithProfile" AS
SELECT "user"."userId", ("user"."firstName" ||' '|| "user"."lastName") AS "name",
"user"."username", "profile"."headline", "profile"."bio", "profile"."picture" FROM "user" INNER JOIN "profile" ON "user"."userId"="profile"."userId";

SELECT * FROM "allUsersWithProfile";

ALTER VIEW "allUsersWithProfile" RENAME TO "allUsersWithProfileView";

DROP VIEW "allUsersWithProfileView";



-- FUNCTION
CREATE OR REPLACE FUNCTION totalRecordsInStudents()
RETURNS INTEGER AS $total$
DECLARE
    total INTEGER;
BEGIN
   SELECT COUNT(*) INTO total FROM "students";
   RETURN total;
END;
$total$
LANGUAGE plpgsql;

-- TRANSACTIONS
-- Begin the transaction
BEGIN;

-- deduct the amount from account 2 (Alice)
UPDATE "accounts"
SET "balance" = "balance" - 1500
WHERE "id" = 2;

-- Accidentally add the amount to account 3 (Jack) [instead of account 1 (Bob)]
UPDATE "accounts"
SET "balance" = "balance" + 1500
WHERE "id" = 3;

-- Uh oh. Bob’s account has an id of 1. This was a mistake.

-- To undo the change, you simply execute the ROLLBACK statement:

-- Roll it back:
ROLLBACK;

-- Now if we check our balances, they have returned to the states they were in before the transaction.

-- Select the data from accounts to check that everything is back to normal:
SELECT "id", "name", "balance" FROM "accounts";

-- This code will be committed no matter what, because we've run the COMMIT command:
INSERT INTO "accounts" VALUES('Alice', 10000);
COMMIT;

-- This code is uncommitted, but we do establish a SAVEPOINT:
UPDATE "accounts"
SET "balance" = "balance" - 1500;
WHERE "id" = 1;

SAVEPOINT A;

-- This code doesn't belong to SAVEPOINT A. It will only be reflected if we COMMIT or ROLLBACK TO B:
INSERT INTO "accounts" VALUES('Bob', 15000);

SAVEPOINT B;

-- This code doesn't belong to SAVEPOINT A or B. It will only be reflected if we COMMIT or ROLLBACK TO C:
INSERT INTO "accounts" VALUES('Carlos', 12000);

SAVEPOINT C;

-- This command effectively returns our code to the state it was in when line 10 was run:
ROLLBACK TO A;