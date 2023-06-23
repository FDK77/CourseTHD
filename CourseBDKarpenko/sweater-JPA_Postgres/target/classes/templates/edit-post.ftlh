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
<form action="/post/update" method="post">
    <input type="hidden" name="post_id" value="${post.post_id}" />
    <label for="post_name">Должность:</label>
    <input type="text" id="post_name" name="post_name" value="${post.post_name}" /><br>
    <label for="salary">Зарплата:</label>
    <input type="number" id="salary" name="salary" value="${post.salary}" /><br>
    <input type="submit" value="Сохранить" />
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
