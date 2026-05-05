/* Write your PL/SQL query statement below */
SELECT
    c.name as Customers
FROM Customers c, Orders o
WHERE 1=1
    and c.id = o.customerId(+)
    and o.id is NULL
