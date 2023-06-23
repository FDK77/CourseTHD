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
<form action="/suppliers/update" method="post">
    <input type="hidden" name="supplier_id" value="${suppliers.supplier_id}" />
    <label for="phone_number">Номер телефона:</label>
    <input type="text" id="phone_number" name="phone_number" value="${suppliers.phone_number}" /><br>
    <label for="email">Электронная почта:</label>
    <input type="text" id="email" name="email" value="${suppliers.email}" /><br>
    <label for="full_name">ФИО:</label>
    <input type="text" id="full_name" name="full_name" value="${suppliers.full_name}" /><br>
    <label for="fabric">Название фабрики:</label>
    <input type="text" id="fabric" name="fabric" value="${suppliers.fabric}" /><br>
    <input type="submit" value="Сохранить" />
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
