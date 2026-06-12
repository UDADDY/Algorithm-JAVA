select
    p.project_id,
    ROUND(AVG(e.EXPERIENCE_YEARS), 2) as average_years
from Project p, Employee e
where p.employee_id = e.employee_id
group by p.project_id