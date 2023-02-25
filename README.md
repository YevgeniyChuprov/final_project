# Проект по автоматизации тестирования сайта [timeweb](https://timeweb.com/ru/)

![timeweb-logo](images/logo.svg)

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
Система `Allure Report` формирует отчет о запуске тестов
`Telegram`-бот отправляет уведомление о результатах прохождения тестов


# <a name="HowToRun">Содержание тест-кейсов</a>

- [x] Проверка перехода с главной на страницу стоимости виртуальногохостинга
- [x] Открытие окна оплаты услуг
- [x] Открытие окна тарифов 1С-Битрикс
- [x] Проверка поиска
- [x] Проверка свободного домена для покупки

# <a name="HowToRun">Запуск тестов из терминала</a>

## <a name="GradleCommand">Локальный запуск тестов</a>

```bash
gradle clean test
```

## <a name="GradleCommand">Запуск с параметрами:</a>
```bash
clean
test
"-DselenoidUrl=${SELENOID_URL}"
"-DbrowserSize=${BROWSER_SIZE}"
"-Dbrowser=${BROWSER}"
"-DbrowserVersion=${BROWSER_VERSION}"
```
###    Параметры сборки
```SELENOID_URL``` – адрес удаленного сервера, на котором будут запускаться тесты.

```BROWSER_SIZE``` – размер окна браузера, в котором будут выполняться тесты.

```BROWSER``` – браузер, в котором будут выполняться тесты.

```BROWSER_VERSION``` – версия браузера, в которой будут выполняться тесты.

### <img src="./images/icons/allure-Report-logo.svg" width="50" height="50"/> Сформированный отчет **"Allure Report"**

 <img src="./images/Allure_Report.PNG" width="80%" height="80%"/>

 <img src="./images/allure-behaviors.PNG" width="80%" height="80%"/>

### <img src="./images/icons/Telegram.svg" width="50" height="50"/> Уведомления в Telegram с использованием бота

<img src="./images/telegram.PNG" width="50%" height="50%" />  

К каждому тесту в отчете прилагается видео.
<p align="center">
  <img title="Selenoid Video" src="images/test.gif">
</p>




