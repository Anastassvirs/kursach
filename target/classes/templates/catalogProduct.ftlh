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
<div class="section">
    <nav style="background-color: #FFDEAD;">
        <div class="container">
            <br>
            <h2>книга Amigo</h2>
            <div class="py-2">
                <a href="/index" class="btn btn-outline-light" role="button" aria-pressed="true" style="color: #9B4222; font-size: 25px; border-color: #9B4222;">Главная</a>
                <a href="/catalog" class="btn btn-outline-light" role="button" aria-pressed="true" style="color: #9B4222; font-size: 25px; border-color: #9B4222;">Каталог</a>
            </div>
        </div>
    </nav>

    <h2>Название товара: ${book.name}</h2>
    <p><a href="${book.image_path}" target="_blank"><img src="${book.image_path}" width="10%"></a></p>
    <h4>Описание товара</h4>
    <i>${book.description}</i>
    <h4>Характеристики товара</h4>
    <ul class = "specifications">
        <li>Автор: ${book.author.name} ${book.author.surname}</li>
        <li>Количество страниц: 320</li>
        <li>Жанр: ${book.genre.name}</li>
    </ul>
</div>
</body>
<footer>
    &#169; Все права защищены
</footer>

</html>