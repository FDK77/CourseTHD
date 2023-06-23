<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <style>
        form {
            margin: 20px;
        }

        label {
            display: block;
            margin-bottom: 5px;
        }

        input[type="text"] {
            width: 200px;
            padding: 5px;
            margin-bottom: 10px;
        }

        input[type="submit"] {
            padding: 8px 16px;
            background-color: #4CAF50;
            border: none;
            color: white;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 14px;
            margin-top: 10px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<form action="/sale/update" method="post">
    <input type="hidden" name="sale_id" value="${sale.sale_id}" />
    <label for="date">Дата продажи:</label>
    <input type="text" id="date" name="date" value="${sale.date?string("yyyy-MM-dd")}" /><br>
    <label for="client">ID клиента:</label>
    <input type="text" id="client" name="client.client_id" value="${sale.client.client_id}" /><br>
    <label for="staff">ID продавца:</label>
    <input type="text" id="staff" name="staff.service_number" value="${sale.staff.service_number}" /><br>
    <input type="submit" value="Сохранить" />
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>