
Interview Questions on SQL are based on following two tables, Employee Table and Employee Incentive Table.
Table Name : Employee EMP_ID As PRIMARY KEY
EMPLOYEE_ID	FIRST_NAME	LAST_NAME	SALARY	JOINING_DATE	DEPARTMENT
1	Venkatesh	S	100000	08/28/2015	 BANKING
2	Ragavi	P	75000	08/28/2015	BUSINESS
3	Gopinath	C	50000	03/02/2016	PHARMA
4	Dinesh	G	50000	03/02/2016	INSURANCE
5	Saibabu	E	40000	07/08/2017	SOFTWARE
6	Hasan	S	29000	07/08/2017	MANUFACTURING
7	Divya	P	33000	07/08/2017	HEALTHCARE
8	Aravindan	R	40000	07/08/2017	HEALTHCARE
9	Sathish	MD	45000	03/02/2016	AUTOMOBILE
10	Prasanth	PKP	34000	03/02/2016	INSURANCE
11	Vijay	R	25684	03/02/2016	BUSINESS
12	Sivakumar	K	54789	03/02/2016	SOFTWARE

Table Name : Incentives

EMPLOYEE_REF_ID	INCENTIVE_DATE	INCENTIVE_AMOUNT
1	01-FEB-16	5000
2	01-FEB-16	3000
3	01-FEB-17	4000
1	01-JAN-17	4500
2	01-JAN-17	3500


SQL Queries Interview Questions and Answers on "SQL Select" - Examples
1.	Get all employee details from the employee table
SELECT * FROM emplyee2      
 
2.	Get First_Name,Last_Name from employee table
    SELECT Firstname,Lastname FROM emplyee2 
3.	Get First_Name from employee table using alias name “Employee Name”
4.	SELECT Firstname as Employee_Name FROM emplyee2
5.	 	
4. Get First_Name from employee table in upper case
SELECT upper(Firstname) FROM emplyee2
 
6.	Get First_Name from employee table in lower case
SELECT lower(Firstname) FROM emplyee2

 
7.	Get unique DEPARTMENT from employee table
        SELECT distinct(Department) FROM emplyee2
 
8.	Select first 3 characters of FIRST_NAME from EMPLOYEE
SELECT substring(Firstname,1,3) FROM emplyee2
 
8. Get position of 'a' in name 'ragavi' from employee table
SELECT INSTR (Firstname,'a') FROM emplyee2 WHERE Firstname='Ragavi'
 
9. Get FIRST_NAME from employee table after removing white spaces from right side
SELECT rtrim(Firstname) FROM emplyee2
 
9.	Get FIRST_NAME from employee table after removing white spaces from left side
     SELECT ltrim(Firstname) FROM emplyee2
10.	Get length of FIRST_NAME from employee table
SELECT LENGTH (Firstname) FROM emplyee2
 
11.	Get First_Name from employee table after replacing 'a' with '$'
SELECT REPLACE (Firstname,'o','$') FROM emplyee2
 
12.	Get First_Name and Last_Name as single column from employee table separated by a '_'
SELECT concat(Firstname,'_',Lastname) FROM emplyee2
 
13.	Get FIRST_NAME ,Joining year,Joining Month and Joining Date from employee table
SELECT year(Joining_date),month(Joining_date),date(Joining_date) FROM emplyee2
 
Database SQL Queries Interview Questions and answers on "SQL Order By"
14.	Get all employee details from the employee table order by First_Name Ascending
15.	SELECT * FROM emplyee2 order by Firstname ASC
16.	 
16. Get all employee details from the employee table order by First_Name descending
SELECT * FROM emplyee2 order by Firstname desc
 
17. Get all employee details from the employee table order by First_Name Ascending and Salary descending
SELECT * FROM emplyee2 order by Firstname asc,Salary desc
 
SQL Queries Interview Questions and Answers on "SQL Where Condition" - Examples
17.	Get employee details from employee table whose employee name is “Dinesh”
SELECT * FROM emplyee2 WHERE Firstname='Dinesh'
 
18.	Get employee details from employee table whose employee name are “Dinesh” and “Roy”
 SELECT * FROM emplyee2 WHERE Firstname in('Dinesh','Roy')
 
19.	Get employee details from employee table whose employee name are not “Dinesh” and “Roy”
SELECT * FROM emplyee2 WHERE Firstname not in('Dinesh','Roy')
 

SQL Queries Interview Questions and Answers on "SQL Wild Card Search" - Examples
20.	Get employee details from employee table whose first name starts with 's'
SELECT * FROM emplyee2 WHERE Firstname like 's%'
 
21.	Get employee details from employee table whose first name contains 'v'
 SELECT * FROM emplyee2 WHERE Firstname like '%v%'
 
22.	Get employee details from employee table whose first name ends with 'n'
      	SELECT * FROM emplyee2 WHERE Firstname like '%n'
 
SQL Queries Interview Questions and Answers on "SQL Pattern Matching" - Examples
23.	Get employee details from employee table whose first name ends with 'n' and name contains 5 letters
SELECT * FROM emplyee2 WHERE Firstname like '____n'
 
25. Get employee details from employee table whose first name starts with 'D' and name contains 5 letters
SELECT * FROM emplyee2 WHERE Firstname like 'D____'
 
24.	Get employee details from employee table who’s Salary greater than 60000
SELECT * FROM emplyee2 WHERE (Salary>60000)
 
25.	Get employee details from employee table who’s Salary less than 80000
SELECT * FROM emplyee2 WHERE (Salary<80000)
 
26.	Get employee details from employee table who’s Salary between 50000 and 80000
SELECT * FROM emplyee2 WHERE Salary BETWEEN 50000 and 80000
 
27.	Get employee details from employee table whose name is venkatesh and ragavi
SELECT * FROM `emplyee2` WHERE Firstname in ('Venkatesh','Ragavi')

 
SQL Queries Interview Questions and Answers on "SQL DATE Functions" - Examples

28.	Get employee details from employee table whose joining year is “2015”
 SELECT * FROM emplyee2 WHERE year(Joining_date)='2015'

 
29.	Get employee details from employee table whose joining month is “February”
SELECT * FROM emplyee2 WHERE month(Joining_date)='02'
  
30.	Get employee details from employee table who joined before January 1st 2017
 SELECT * FROM emplyee2 WHERE Joining_date <'2017-01-01'
 
31.	Get employee details from employee table who joined after January 31st 2016
SELECT * FROM emplyee2 WHERE Joining_date >'2016-01-31'
 
32.	Get Joining Date and Time from employee table


36. Get Joining Date,Time including milliseconds from employee table
37. Get difference between JOINING_DATE and INCENTIVE_DATE from employee and incentives table
SELECT Firstname,Incentive_date,Joining_date from emplyee2 a inner join incentives B on A.Employee_id=B.Employer_Id
 
38. Get database date
SELECT now()
 

SQL Queries Interview Questions and Answers on "SQL Escape Characters" - Examples

39. Get names of employees from employee table who has '%' in Last_Name. Tip : Escape character for special characters in a query.
Select Firstname FROM emplyee2 WHERE Lastname LIKE '%\%%'
 
40. Get Last Name from employee table after replacing special character with white space
    SELECT REPLACE (Lastname,'%',' ')from emplyee2
 
SQL Queries Interview Questions and Answers on "SQL Group By Functions" - Examples
41. Get department,total salary with respect to a department from employee table.
SELECT Department,SUM(Salary) TOTAL_SALARY FROM emplyee2 GROUP BY Department
 
42. Get department,total salary with respect to a department from employee table order by total salary descending
SELECT Department,SUM(Salary) TOTAL_SALARY FROM emplyee2 GROUP BY Department ORDER BY TOTAL_SALARY DESC
 
SQL Queries Interview Questions and Answers on "SQL Mathematical Operations using Group By" - Examples
43. Get department,no of employees in a department,total salary with respect to a department from employee table order by total salary descending
SELECT Department,COUNT(Firstname),SUM(Salary) TOTAL_SALARY FROM emplyee2 GROUP BY Department ORDER BY TOTAL_SALARY DESC
 
44. Get department wise average salary from employee table order by salary ascending
SELECT Department,AVG(Salary) AVGSalary FROM emplyee2 GROUP BY Department ORDER BY AVGSalary ASC
 
45. Get department wise maximum salary from employee table order by salary ascending
SELECT DEPARTMENT,MAX(Salary) MAXSalary FROM emplyee2 GROUP BY Department ORDER BY MAXSalary ASC
 
46. Get department wise minimum salary from employee table order by salary ascending
SELECT DEPARTMENT,MIN(Salary) MINSalary FROM emplyee2 GROUP BY Department ORDER BY MINSalary ASC
 
47. Select no of employees joined with respect to year and month from employee table
SELECT year(Joining_date) JOIN_YEAR, month(Joining_date) JOIN_MONTH,COUNT(*) TOTAL_EMP FROM emplyee2 GROUP BY year(Joining_date),month(Joining_date)
 
48. Select department,total salary with respect to a department from employee table where total salary greater than 800000 order by Total_Salary descending
SELECT Department,SUM(Salary) TOTAL_SALARY FROM emplyee2 GROUP BY Department HAVING SUM(Salary) >80000 ORDER BY TOTAL_SALARY DESC
 
SQL Queries Interview Questions and Answers on "SQL Joins" - Examples

49. Select first_name, incentive amount from employee and incentives table for those employees who have incentives
SELECT Firstname,Incentive_amoubt FROM emplyee2 a INNER join incentives B on A.Employee_id=B.Employer_Id
 
50. Select first_name, incentive amount from employee and incentives table for those employees who have incentives and incentive amount greater than 3000
Select Firstname,incentive_amoubt from emplyee2 a inner join incentives B on A.Employee_id = B.Employer_Id and incentive_amoubt > 3000

 
51. Select first_name, incentive amount from employee and incentives table for all employes even if they didn't get incentives
Select Firstname,Incentive_amoubt from emplyee2 a left join incentives B on A.Employee_id = B.Employer_Id
 
52. Select first_name, incentive amount from employee and incentives table for all employees even if they didn't get incentives and set incentive amount as 0 for those employees who didn't get incentives.
Select Firstname,IFNULL(incentive_amoubt,0) from emplyee2 a left join incentives B on A.Employee_id = B.Employer_Id
 
53. Select first_name, incentive amount from employee and incentives table for all employees who got incentives using left join
Select Firstname, ifnull(incentive_amoubt,0) from emplyee2 a left join incentives B on A.Employee_id = B.Employer_Id
 
54. Select max incentive with respect to employee from employee and incentives table using sub query
Advanced SQL Queries Interview Questions and Answers on "Top N Salary" – Examples
select Department,(select nvl(max(Incentive_amoubt),0) from incentives where employer_id = Employee_id) Max_incentive from emplyee2
 
55. Select TOP 2 salary from employee table
select * from emplyee2 order by Salary desc limit 2
 
56. Select TOP N salary from employee table
select * from emplyee2 order by Salary desc limit 5
 
57. Select 2nd Highest salary from employee table
select min(Salary) second_minsalary from(SELECT * from emplyee2 order by Salary desc limit 2) a
 
58. Select Nth Highest salary from employee table
select min(Salary) second_minsalary from(SELECT * from emplyee2 order by Salary desc limit 5) a
 
SQL Queries Interview Questions and Answers on "SQL Union" - Examples
59. Select First_Name,LAST_NAME from employee table as separate rows
SELECT Firstname from emplyee2 UNION SELECT Lastname from emplyee2
 
60. What is the difference between UNION and UNION ALL ?


"Advanced SQL Queries Interview Questions and Answers"

61. Select employee details from employee table if data exists in incentive table ?
SELECT * FROM emplyee2 where EXISTS (select * from incentives)
 

62. How to fetch data that are common in two query results ?
63. Get Employee ID's of those employees who didn't receive incentives without using sub query ?
64. Select 20 % of salary from venkat , 10% of Salary for gopi and for other 15 % of salary from employee table
65. Select Banking as 'Bank Dept', Insurance as 'Insurance Dept' and Services as 'Pharma Dept' from employee table
66. Delete employee data from employee table who got incentives in incentive table
67. Insert into employee table Last Name with " ' " (Single Quote - Special Character)
68. Select Last Name from employee table which contain only numbers
69. Write a query to rank employees based on their incentives for a month
70. Update incentive table where employee name is 'Dinesh'

