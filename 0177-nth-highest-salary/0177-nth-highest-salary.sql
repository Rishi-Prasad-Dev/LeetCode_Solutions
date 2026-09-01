CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET N=N-1;
  RETURN (
      Select DISTINCT salary as getNthHighestSalary
      from Employee
      order by salary desc
      limit 1 offset N
  );
END