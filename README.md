# Проект по автоматизации тестирования сайта [lamoda](https://lamoda.ru/)

![lamoda-logo](images/logo/Lamoda_logosvg.png)

# <a name="Technology">Технологический стек</a>
<p  align="center">
  <code><img width="5%" title="IntelliJ IDEA" src="./images/icons/IDEA-logo.svg"></code>
  <code><img width="5%" title="Java" src="./images/icons/java-logo.svg"></code>
  <code><img width="5%" title="Selenide" src="./images/icons/selenide-logo.svg"></code>
  <code><img width="5%" title="Selenoid" src="./images/icons/selenoid-logo.svg"></code>
  <code><img width="5%" title="Gradle" src="./images/icons/gradle-logo.svg"></code>
  <code><img width="5%" title="JUnit5" src="./images/icons/junit5-logo.svg"></code>
  <code><img width="5%" title="Allure Report" src="./images/icons/allure-Report-logo.svg"></code>
  <code><img width="5%" title="Allure TestOps" src="./images/icons/allure-ee-logo.svg"></code>
  <code><img width="5%" title="Github" src="./images/icons/git-logo.svg"></code>
  <code><img width="5%" title="Jenkins" src="./images/icons/jenkins-logo.svg"></code>
  <code><img width="5%" title="Telegram" src="./images/icons/Telegram.svg"></code>
</p>

Написан на `Java` с использованием фреймворка `Selenide`
Применяется фреймворк для модульного тестирования `JUnit 5`
`Gradle` используется для автоматизированной сборки проекта
Системы `Allure Report` и `Allure testops` формирут отчет о запуске тестов
`Telegram`-бот отправляет уведомление о результатах прохождения тестов


# <a name="HowToRun">Содержание тест-кейсов</a>

- [x] Добавление товара в корзину
- [x] Увеличение колличества выбранного товара
- [x] Удаление товара из корзины
- [x] Получение скидки 10%"
- [x] Сброс пароля
- [x] Проверка выбора города из списка
- [x] Проверка выбора города водом текста
- [x] Проверка перехода кликом по меню
- [x] Проверка открытия подменю при наведении
- [x] Выбор точного местоположения
- [x] Поиск существующего товара
- [x] Поиск не существующего товара

# <a name="HowToRun">Запуск тестов из терминала</a>

## <a name="GradleCommand">Локальный запуск тестов</a>

```bash
gradle clean test "-Dtag=api" "-Denv=api" 
```

## <a name="GradleCommand">Запуск с параметрами:</a>
```bash
clean
test
"-DselenoidUrl=${SELENOID_URL}"
"-Dtag=${ui}"
"-Denv=${ui_remote}"
"-Dbrowser=${BROWSER}"
"-DbrowserSize=${BROWSER_SIZE}"


```
###    Параметры сборки
```SELENOID_URL``` – адрес удаленного сервера, на котором будут запускаться тесты.

```Dtag``` – теги для запуска выполнения тестов.

```Denv``` – определяет среду для запуска этих тестов.

```SELENOID_URL``` – адрес удаленного сервера, на котором будут запускаться тесты.

```BROWSER_SIZE``` – размер окна браузера, в котором будут выполняться тесты.

```BROWSER``` – браузер, в котором будут выполняться тесты.


### <img src="./images/icons/jenkins-logo.svg" width="50" height="50"/> Запуск в **"Jenkins"**
Главная страница сборки:

<img src="./images/screens/jenkins_main.png" width="80%" height="80%"/>

Для запуска удаленных тестов необходимо заполнить параметры сборки:

<img src="./images/screens/jenkins_param.png" width="80%" height="80%"/>

### <img src="./images/icons/allure-Report-logo.svg" width="50" height="50"/> Сформированный отчет **"Allure Report"**

Основной дашборд:

 <img src="./images/screens/allure_report.png" width="80%" height="80%"/>

Список тестов с результатами прогона:

 <img src="./images/screens/allure-behaviors.png" width="80%" height="80%"/>

### <img src="./images/icons/allure-ee-logo.svg" width="50" height="50"/> Интеграция с **"Allure TestOps"**

Основной дашборд:

<img src="./images/screens/allure_testops_report.png" width="80%" height="80%"/>

Список тестов с результатами прогона:

<img src="./images/screens/allure_testops_behaviors.png" width="80%" height="80%"/>

### <img src="./images/icons/Telegram.svg" width="50" height="50"/> Уведомления в Telegram с использованием бота

<img src="./images/screens/telegram.jpg" width="50%" height="50%" />  

К каждому тесту в отчете прилагается видео.
<p align="center">
  <img title="Selenoid Video" src="images/screens/test.gif">
</p>




