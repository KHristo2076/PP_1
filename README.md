<h3 style="margin-left: 48px;"><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><b><span style="line-height:107%">Описание задачи:</span></b></span></span></h3>

<p style="margin-left: 24px; margin-bottom: 11px;"><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">В прошлой задаче мы познакомились с </span><span lang="EN-US"><span style="line-height:107%">Maven</span></span><span style="line-height:107%"> и </span><span lang="EN-US"><span style="line-height:107%">JDBC</span></span><span style="line-height:107%">, доработали приложение, взаимодействующее с базой данных.</span></span></span></p>

<p style="margin-left: 24px; margin-bottom: 11px;"><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">На этот раз обратим внимание на класс </span><span lang="EN-US"><span style="line-height:107%">UserHibernateDaoImpl</span></span><span style="line-height:107%">, который реализует тот же интерефейс, что и </span><span lang="EN-US"><span style="line-height:107%">UserDaoJdbcImpl</span></span><span style="line-height:107%">. </span></span></span></p>

<p style="margin-left: 24px; margin-bottom: 11px;"><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">В рамках этой задачи необходимо реализовать взаимодействие с базой данных с помощью </span><span lang="EN-US"><span style="line-height:107%">Hibernate</span></span><span style="line-height:107%"> и дописать методы в классе </span><span lang="EN-US"><span style="line-height:107%">UserHibernateDaoImpl</span></span><span style="line-height:107%">, проверить свои методы заранее написанными </span><span lang="EN-US"><span style="line-height:107%">JUnit</span></span><span style="line-height:107%"> тестами из заготовки.</span></span></span></p>

<p style="margin-left: 24px; margin-bottom: 11px;">&nbsp;</p>

<h3 style="margin-left: 24px; margin-bottom: 11px;"><strong><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp; &nbsp;Требования к классам приложения</span><span lang="EN-US"><span style="line-height:107%">:</span></span></span></span></strong></h3>

<ol>
	<li><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span lang="EN-US"><span style="line-height:107%">&nbsp;UserHibernateDaoImpl </span></span><span style="line-height:107%">должен реализовывать интерефейс </span><span lang="EN-US"><span style="line-height:107%">UserDao</span></span></span></span></li>
	<li><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp;В класс </span><span lang="EN-US"><span style="line-height:107%">Util</span></span><span style="line-height:107%"> должна быть добавлена конфигурация для </span><span lang="EN-US"><span style="line-height:107%">Hibernate</span></span><span style="line-height:107%"> (рядом с </span><span lang="EN-US"><span style="line-height:107%">JDBC</span></span><span style="line-height:107%">), без использования xml.</span></span></span></li>
	<li><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span lang="EN-US"><span style="line-height:107%">&nbsp;Service</span></span><span style="line-height:107%"> на этот раз использует реализацию </span><span lang="EN-US"><span style="line-height:107%">dao</span></span><span style="line-height:107%"> через </span><span lang="EN-US"><span style="line-height:107%">Hibernate</span></span></span></span></li>
	<li><span style="font-family:Arial,Helvetica,sans-serif;"><span style="line-height:107%"><span style="line-height:107%">&nbsp;Методы создания и удаления таблицы пользователей в классе </span><span lang="EN-US"><span style="line-height:107%">UserHibernateDaoImpl</span></span> <span style="line-height:107%">должны быть реализованы с помощью </span><span lang="EN-US"><span style="line-height:107%">SQL</span></span><span style="line-height:107%">.&nbsp;</span></span></span></li>
</ol>

<p>&nbsp;</p>

<p>Алгоритм приложения и операции не меняются в сравнении с предыдущим заданием.&nbsp;</p>

<p style="margin-bottom: 11px; margin-left: 48px;">&nbsp;</p>
</div>