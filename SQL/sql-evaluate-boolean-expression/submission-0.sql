-- Write your query below
select left_operand, operator, right_operand,
    case
        when e.operator = '>' and lv.value > rv.value then 'true'
        when e.operator = '<' and lv.value < rv.value then 'true'
        when e.operator = '=' and lv.value = rv.value then 'true'
        else 'false'
    end as value
from expressions e
left join variables lv on e.left_operand = lv.name
left join variables rv on e.right_operand = rv.name