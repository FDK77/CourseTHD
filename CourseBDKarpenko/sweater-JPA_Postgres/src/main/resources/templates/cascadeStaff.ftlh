<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Information</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <style>
        /* Дополнительные стили */
        .button {
            display: inline-block;
            border-radius: 4px;
            background-color: #4CAF50;
            border: none;
            color: white;
            text-align: center;
            font-size: 14px;
            padding: 8px;
            width: 80px;
            transition: all 0.3s;
            cursor: pointer;
            margin: 5px;
        }

        .button:hover {
            background-color: #45a049;
        }

        a.button {
            text-decoration: none;
        }

        a.button:hover {
            text-decoration: none;
        }
    </style>
</head>
<body>
<div class="container">
    <form action="/filter" method="post">
        <label for="employeeId">ID сотрудника:</label>
        <input type="text" id="employeeId" name="id">
        <input type="submit" class="button btn btn-success" value="Поиск">
    </form>
    <div class="table-responsive">
        <table class="table table-striped table-hover">
            <tr>
                <th>Серия и номер паспорта</th>
                <th>ФИО</th>
                <th>Номер телефона</th>
                <th>Должность</th>
                <th>Зарплата</th>
                <th>Магазин</th>
                <th>Город</th>
            </tr>
            <#list cascadeStaff as staff>
                <tr>
                    <td>${staff.passport_details}</td>
                    <td>${staff.human.fullname}</td>
                    <td>${staff.human.phone_number}</td>
                    <td>${staff.post.post_name}</td>
                    <td>${staff.post.salary}</td>
                    <td>${staff.shop.shop_name}</td>
                    <td>${staff.shop.city.city}</td>
                </tr>
            </#list>
        </table>
    </div>
    <a href="menu" class="button btn btn-primary">Меню</a>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>