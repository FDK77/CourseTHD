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
<form action="/filtersupinv" method="post">
    <label for="supinvId">ID накладной поставки:</label>
    <input type="text" id="supinvId" name="id">
    <input type="submit" class="button btn btn-success" value="Поиск">
</form>
<table>
    <tr>
        <th>ФИО поставщика</th>
        <th>Номер телефона</th>
        <th>Фабрика</th>
        <th>Дата поставки</th>
        <th>Количество товара</th>
        <th>Название товара</th>
        <th>Цена за единицу</th>
        <th>Магазин</th>
        <th>Город</th>
    </tr>

    <#list supinv as supinv>
        <tr>
            <td>${supinv.supply.suppliers.full_name}</td>
            <td>${supinv.supply.suppliers.phone_number}</td>
            <td>${supinv.supply.suppliers.fabric}</td>
            <td>${supinv.supply.date?string("yyyy-MM-dd")}</td>
            <td>${supinv.quantity}</td>
            <td>${supinv.products.product_name}</td>
            <td>${supinv.products.price}</td>
            <td>${supinv.products.shop.shop_name}</td>
            <td>${supinv.products.shop.city.city}</td>
        </tr>
    </#list>
</table>
<a href="menu" class="button btn btn-primary">Меню</a>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
