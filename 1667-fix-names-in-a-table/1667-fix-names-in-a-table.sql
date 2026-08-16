select user_id,insert(lower(name),1,1,upper(substr(name,1,1))) as name
from users
order by user_id ;