<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Amigo</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>

<body>
<nav style="background-color: #FFDEAD;">
    <div class="container">
        <br>
        <h2>книга Amigo</h2>
        <div class="py-2">
            <a href="index.html" class="btn btn-outline-light" role="button" aria-pressed="true" style="color: #9B4222; font-size: 25px; border-color: #9B4222;">Главная</a>
            <a href="catalog.html" class="btn btn-outline-light" role="button" aria-pressed="true" style="color: #9B4222; font-size: 25px; border-color: #9B4222;">Каталог</a>
        </div>
    </div>
</nav>

<h2>Каталог</h2>
<div class="row">
    <#list books.hasContent() as book>
        <div class="col-sm-3">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">${book.name}</h5>
                    <img class="card-img-top" src="1984.jpg" alt="Card image cap" style="width: 85%">
                    <a href="catalogProduct.html" class="btn" style="background-color: #9B4222; color: whitesmoke; padding: 10px; margin: 10px;">Перейти к книге</a>
                </div>
            </div>
        </div>
    </#list>
</div>
</body>

<footer>
    &#169; Все права защищены
</footer>
</html>
