# SmartBill

Проект в рамках предмета "Управление производственным процессом программного обеспечения" НГУ ФИТ 2020  
Выполнен студентами группы 17202 *Смаль Иваном*, *Макаренко Данилом* и *Алексеем Киреевым*

### Описание проекта
В рамках проекта будет разработано приложение для Android для облегчения совместных закупок в магазине. Т.е. если несколько людей закупаются в магазине, а платит за них всех один человек(или несколько), то в итоге некоторые покупатели останутся должны заплатившим какую-то сумму. Данное приолжение предназначено для упрощения расчета этой суммы.
####Примерный процесс использования решения
1. Получение информации о закупке с помощью ручного ввода. Заполняется информация о:
    + О товарах(название, цена, количество)
    + Об участниках(Имя, внесенная сумма)
    + Для каждого товара: коэффициенты вложений для каждого участника 

2. Валидация введенной информации, такой как:
    + Проверка того, что у каждого товара есть хоть один участник с ненулевым коэффициентом вложения
    + Проверка того, что внесенных участниками денег >= сумма стоймости всех товаров
3. Выдача результата
