**Принципы SOLID**

**1 принцип** - каждый класс выполняет одну задачу

**2 принцип** - класс закрыт для модификации, но открыт для расширения.
(заходить в класс и менять код нельзя.
Необходимо закладывать на моменте проектирования интерфейс, который мы будем
имплементить в новый класс, для расширения функциональности)

**3 принцип** - Должна быть возможность вместо базового (родительского) 
типа (класса) подставить любой его подтип (класс-наследник), 
при этом работа программы не должна измениться.

**4 принцип** - Данный принцип обозначает, что не нужно
заставлять клиента (класс) 
реализовывать интерфейс, который не имеет к нему отношения.
Если в интерфейсе есть методы, которые классу не нужны,
то разделите интерфейсы на два и имплементируйте
только те, что нужны. Рекомендуется 1 интерфейс = 1 метод

**5 принцип** - Модули верхнего уровня не должны зависеть 
от модулей нижнего уровня. И те, и другие должны зависеть 
от абстракции. Абстракции не должны зависеть от деталей. 
Детали должны зависеть от абстракций.