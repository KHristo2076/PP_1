
<h3 style="text-indent: 35.4pt; margin-bottom: 11px;"><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><b><span style="line-height:107%">Описание задачи</span><span lang="EN-US"><span style="line-height:107%">:</span></span> </b></span></span></h3>

<p style="margin-left:48px; margin-bottom:11px"><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">Необходимо ознакомиться с заготовкой и доработать приложение, которое взаимодействует с базой оперируя пользователем (класс </span><span lang="EN-US"><span style="line-height:107%">User</span></span><span style="line-height:107%">) и проверить свои методы заранее написанными </span><span lang="EN-US"><span style="line-height:107%">JUnit</span></span><span style="line-height:107%"> тестами. По итогу все тесты должны быть пройдены. Разрешается посмотреть реализацию тестов. </span></span></span></p>

<p style="margin-left:48px; margin-bottom:11px"><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">Для запуска теста необходимо найти класс в папке test (показано в предыдущей лекции) и при нажатии на него правой кнопкой мыши запустить, выбрав Run </span></span></span>«<span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">Имя класса</span></span></span>»</p>

<p style="margin-left:48px; margin-bottom:11px"><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">Класс </span><span lang="EN-US"><span style="line-height:107%">UserHibernateDaoImpl</span></span> <span style="line-height:107%">в рамках этой задачи не затрагивается (остаётся пустой)</span></span></span></p>

<p style="margin-left:48px; margin-bottom:11px"><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><strong><span lang="EN-US"><span style="line-height:107%">User</span></span></strong> <span style="line-height:107%">представляет из себя сущность с полями:</span></span></span></p>

<ul>
	<li style="margin-left: 48px; margin-bottom: 11px;"><span style="font-family:Arial,Helvetica,sans-serif;">Long id</span></li>
	<li style="margin-left: 48px; margin-bottom: 11px;"><span style="font-family:Arial,Helvetica,sans-serif;">String name</span></li>
	<li style="margin-left: 48px; margin-bottom: 11px;"><span style="font-family:Arial,Helvetica,sans-serif;">String lastName</span></li>
	<li style="margin-left: 48px; margin-bottom: 11px;"><span style="font-family:Arial,Helvetica,sans-serif;">Byte age</span></li>
</ul>

<p><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Архитектура приложения создана с опорой на паттерн проектирования </span><span lang="EN-US"><span style="line-height:107%">MVC</span></span><span style="line-height:107%"> (частично, у нас не </span><span lang="EN-US"><span style="line-height:107%">WEB</span></span><span style="line-height:107%"> приложение)</span></span></span></p>

<p style="margin-left:47px; margin-bottom:11px"><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%">Ознакомиться с паттерном можно <a href="https://pro-java.ru/patterny-proektirovaniya-java/chto-takoe-pattern-proektirovaniya-mvc-v-java/" target="_blank">здесь</a></span></span></p>

<p style="margin-left:47px; margin-bottom:11px">&nbsp;</p>

<h3 style="margin-left: 47px; margin-bottom: 11px;"><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><b><span style="line-height:107%">Требования к классам приложения</span><span lang="EN-US"><span style="line-height:107%">:</span></span></b></span></span></h3>

<ol>
	<li><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp;Классы </span><span lang="EN-US"><span style="line-height:107%">dao</span></span><span style="line-height:107%">/</span><span lang="EN-US"><span style="line-height:107%">service</span></span> <span style="line-height:107%">должны реализовывать соответствующие интерфейсы</span></span></span></li>
	<li><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp;Класс </span><span lang="EN-US"><span style="line-height:107%">dao</span></span> <span style="line-height:107%">должен иметь конструктор пустой/по умолчанию</span></span></span></li>
	<li><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp;Все поля должны быть </span><span lang="EN-US"><span style="line-height:107%">private</span></span></span></span></li>
	<li><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span lang="EN-US"><span style="line-height:107%">&nbsp;</span></span><span style="line-height:107%">service переиспользует методы </span><span lang="EN-US"><span style="line-height:107%">dao</span></span></span></span></li>
	<li><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp;Обработка всех исключений, связанных с работой с базой данных должна находиться в </span><span lang="EN-US"><span style="line-height:107%">dao</span></span></span></span></li>
	<li style="margin-bottom:11px"><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp;Класс </span><span lang="EN-US"><span style="line-height:107%">Util</span></span> <span style="line-height:107%">должен содержать логику настройки соединения с базой данных </span></span></span></li>
</ol>

<p style="text-indent:35.25pt; margin-bottom:11px">&nbsp;</p>

<h3 style="text-indent: 35.25pt; margin-bottom: 11px;"><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><b><span style="line-height:107%">Необходимые операции</span><span lang="EN-US"><span style="line-height:107%">:</span></span></b></span></span></h3>

<ol>
	<li><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp;Создание таблицы для </span><span lang="EN-US"><span style="line-height:107%">User</span></span><span style="line-height:107%">(ов) </span></span></span>—<span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%"> не должно приводить к исключению, если такая таблица уже существует</span></span></span></li>
	<li><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp;Удаление таблицы </span><span lang="EN-US"><span style="line-height:107%">User</span></span><span style="line-height:107%">(ов) </span></span></span>—<span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%"> не должно приводить к исключению, если таблицы не существует</span></span></span></li>
	<li><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp;Очистка содержания таблицы</span></span></span></li>
	<li><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp;Добавление </span><span lang="EN-US"><span style="line-height:107%">User </span></span><span style="line-height:107%">в таблицу</span></span></span></li>
	<li><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp;Удаление </span><span lang="EN-US"><span style="line-height:107%">User</span></span> <span style="line-height:107%">из таблицы (по </span><span lang="EN-US"><span style="line-height:107%">id</span></span><span style="line-height:107%">)</span></span></span></li>
	<li style="margin-bottom:11px"><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp;Получение всех </span><span lang="EN-US"><span style="line-height:107%">User</span></span><span style="line-height:107%">(ов) из таблицы</span></span></span></li>
</ol>

<p style="margin-bottom:11px"><span style="font-size:20px;"><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></span></span></span></p>

<h3 style="margin-bottom: 11px;"><span style="font-size:20px;"><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%"><b>&nbsp; &nbsp; </b></span></span></span></span><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%"><b>&nbsp; &nbsp; Алгоритм работы приложения</b>:</span></span></span></h3>

<p style="margin-bottom:11px"><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<em>В методе </em></span><em><span lang="EN-US"><span style="line-height:107%">main</span></span><span style="line-height:107%"> класса </span><span lang="EN-US"><span style="line-height:107%">Main</span></span><span style="line-height:107%"> должны происходить следующие операции:</span></em></span></span></p>

<ol>
	<li><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp;Создание таблицы </span><span lang="EN-US"><span style="line-height:107%">User</span></span><span style="line-height:107%">(ов)</span></span></span></li>
	<li><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp;Добавление 4 </span><span lang="EN-US"><span style="line-height:107%">User</span></span><span style="line-height:107%">(ов) в таблицу с данными на свой выбор. После каждого добавления должен быть вывод в консоль (</span><span lang="EN-US"><span style="line-height:107%">User</span></span> <span style="line-height:107%">с именем </span></span></span>—<span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%"> </span><span lang="EN-US"><span style="line-height:107%">name</span></span><span style="line-height:107%"> добавлен в базу данных)</span></span></span></li>
	<li><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp;Получение всех </span><span lang="EN-US"><span style="line-height:107%">User</span></span><span style="line-height:107%"> из базы и вывод в консоль (должен быть переопределен </span><span lang="EN-US"><span style="line-height:107%">toString</span></span> <span style="line-height:107%">в классе </span><span lang="EN-US"><span style="line-height:107%">User</span></span><span style="line-height:107%">)</span></span></span></li>
	<li><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp;Очистка таблицы </span><span lang="EN-US"><span style="line-height:107%">User(</span></span><span style="line-height:107%">ов)</span></span></span></li>
	<li style="margin-bottom:11px"><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp;Удаление таблицы</span></span></span></li>
</ol>
</div>
