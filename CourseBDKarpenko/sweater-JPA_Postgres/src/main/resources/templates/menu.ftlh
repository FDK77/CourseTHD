<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Меню</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <style>
        /* Дополнительные стили */
        .menu-container {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        .menu-button {
            display: inline-block;
            border-radius: 4px;
            background-color: #4CAF50;
            border: none;
            color: white;
            text-align: center;
            font-size: 18px;
            padding: 12px 24px;
            width: 200px;
            transition: all 0.3s;
            cursor: pointer;
            margin: 10px;
            text-decoration: none;
        }

        .menu-button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="menu-container">
        <h1>Меню</h1>
        <a href="sale" class="menu-button btn btn-primary">Продажи</a>
        <a href="cascadeStaff" class="menu-button btn btn-primary">Сотрудники</a>
        <a href="suppliers" class="menu-button btn btn-primary">Поставщики</a>
        <a href="post" class="menu-button btn btn-primary">Должности</a>
        <a href="supinv" class="menu-button btn btn-primary">Поставки</a>
    </div>
</div>
</body>
</html>
