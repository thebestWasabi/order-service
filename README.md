<h3>Order Service</h3>
<h4>Предоставляет REST API для создания заказа и просмотра совершенных пользователем заказов.<br>
Доступно для зарегистрированных клиентов онлайн кафе, информация о пользователе передается в токене доступа.</h4>
<ul class="mt-2">
    <li class="mt-2"><i>POST /v1/menu-orders</i> - создать заказ</li>
    <li class="mt-2"><i>GET /v1/menu-orders?sort={sort}&from={from}&size={size}</i> - получить пагинированный список 
    (offset paging) заказов пользователя, отсортированный по дате создания (DATE_ASC, DATE_DESC)
    </li>
</ul>   

Вычитывает из топика Kafka `v1.orders_dispatch` сообщения о том, что заказ был обработан и передан на
исполнение или отклонен и обновляет статус заказа в Postgres. Данные хранятся в реляционной базе PostgreSQL 16.
