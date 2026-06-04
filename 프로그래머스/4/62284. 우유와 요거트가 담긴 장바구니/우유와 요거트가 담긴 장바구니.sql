select
    distinct p.CART_ID
from CART_PRODUCTS p
    , (select
            CART_ID
        from CART_PRODUCTS
        where NAME = 'Milk'
      ) milk
where 
    p.NAME = 'Yogurt'
    AND p.CART_ID = milk.CART_ID
order by CART_ID