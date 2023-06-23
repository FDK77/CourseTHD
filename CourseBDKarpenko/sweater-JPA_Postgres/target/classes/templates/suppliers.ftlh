<html>
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
        <th>Код поставщика</th>
        <th>Номер телефона</th>
        <th>Эл. почта</th>
        <th>ФИО</th>
        <th>Фабрика</th>
        <th>Действия</th>
    </tr>

    <#list suppliers as supplier>
        <tr>
            <td>${supplier.supplier_id}</td>
            <td>${supplier.phone_number}</td>
            <td>${supplier.email}</td>
            <td>${supplier.full_name}</td>
            <td>${supplier.fabric}</td>
            <td>
                <a href="/suppliers/delete?id=${supplier.supplier_id}" class="button">Удалить</a>
                <a href="/suppliers/edit?id=${supplier.supplier_id}" class="button">Редактировать</a>
            </td>
        </tr>
    </#list>
</table>
<a href="menu" class="button btn btn-primary">Меню</a>
<a href="/suppliers/create" class="button btn btn-primary">Добавить</a>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
