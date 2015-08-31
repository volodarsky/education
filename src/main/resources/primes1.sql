select r
from (
  select rownum+90000 r from dual connect by rownum < 100000
)
where
  r=2
  or 0 not in(
    select mod(r,rownum+1) from dual
    connect by rownum<sqrt(r)
  )