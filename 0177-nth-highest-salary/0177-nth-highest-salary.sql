CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      with highestsalaries as(
        select
        id,
        salary,
        DENSE_RANK() over (order by salary desc) as salary_rank
        from employee
      )
      select distinct salary as getNthHighestSalary
      from highestsalaries where salary_rank=N

  );
END