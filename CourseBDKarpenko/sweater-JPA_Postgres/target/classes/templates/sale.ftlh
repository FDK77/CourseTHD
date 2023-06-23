<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        tr:hover {
            background-color: #f5f5f5;
        }

        .button {
            display: inline-block;
            border-radius: 4px;
            background-color: #4CAF50;
            border: none;
            color: white;
            text-align: center;
            font-size: 14px;
            padding: 8px;
            width: 120px;
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
<table>
    <tr>
        <th>ID продажи</th>
        <th>Дата продажи</th>
        <th>ID клиента</th>
        <th>ID продавца</th>
        <th>Действия</th>
    </tr>

    <#list sales as sale>
        <tr>
            <td>${sale.sale_id}</td>
            <td>${sale.date?string("yyyy-MM-dd")}</td>
            <td>${sale.client.client_id}</td>
            <td>${sale.staff.service_number}</td>
            <td>
                <a href="/sale/delete?id=${sale.sale_id}" class="button">Удалить</a>
                <a href="/sale/edit?id=${sale.sale_id}" class="button">Редактировать</a>
            </td>
        </tr>
    </#list>
</table>
<a href="menu" class="button btn btn-primary">Меню</a>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
