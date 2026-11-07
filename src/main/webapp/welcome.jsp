
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f0fdf4;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
        }

        .welcome-box {
            background: white;
            padding: 50px;
            text-align: center;
            border-radius: 15px;
            box-shadow: 0 5px 20px rgba(0,0,0,0.08);
        }

        h1 {
            color: #15803d;
        }

        p {
            color: #64748b;
            font-size: 17px;
        }
    </style>
</head>

<body>

<div class="welcome-box">

    <h1>Welcome, ${name}! 🎉</h1>

    <p>Your account has been created successfully.</p>

    <p>We're happy to have you here. Enjoy your journey!</p>

</div>

</body>
</html>
