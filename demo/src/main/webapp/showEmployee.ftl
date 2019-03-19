<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>
    <#list employeesList as p>

        ${p.name}--${p.sex}--${p.wokeno}

    </#list>
</h1>
</body>
</html>