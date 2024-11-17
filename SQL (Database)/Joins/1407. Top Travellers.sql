# Write your MySQL query statement below
select name,ifnull(sum(distance),0) as travelled_distance
from users left join Rides
on users.id=Rides.user_id
group by users.id 
ORDER BY travelled_distance DESC, name
;
