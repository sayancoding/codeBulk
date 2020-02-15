emp1 = {name:"sayan",skill:[2]}
emp2 = {name:"sounish",skill:[1,2]}
emp3 = {name:"john",skill:[3]}
Emp = [emp1,emp2,emp3]

requiredSkill = [1,2,3]
resultSkill = []

function check(req_skill,employee_skills)
{
    for(i=0;i<employee_skills.length;i++)
    {
        var employeeSkill = Emp[i].skill;
        for(var k=0;k<employeeSkill.length;k++)
        {
            for(var j=0;j<req_skill.length;i++)
            {
                if(employeeSkill.includes(req_skill[j]))
                resultSkill.concat(employeeSkill)
            }
        }
    }
    console.log(resultSkill);
    
}
check(requiredSkill,Emp)
