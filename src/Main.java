public class Main {
    public static void main(String[] args) {

        /*
        Задача 1
        Необходимо присвоить переменным разные значения. Для решения этой задачи используйте тип переменной var.
        В программе IDEA в новом созданном вами проекте присвойте:
        переменной dog значение 8.0;
        переменной cat значение 3.6;
        переменной paper значение 763789.
        Выведите значения каждой переменной в консоль.
         */

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Задача 1:");
        System.out.println("var dog = " + dog);
        System.out.println("var cat = " + cat);
        System.out.println("var paper = " + paper);

        /*
        Задача 2
        Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4.
        Для решения этой задачи используйте тип переменной var.
        Выведите в консоль новые значения переменных.
         */


        /*делаем так, потому что ранее уже объявляли эти переменные
        и есть значения ранее присвоенные этим переменным
        */
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("\nЗадача 2:");
        System.out.println("var dog = " + dog);
        System.out.println("var cat = " + cat);
        System.out.println("var paper = " + paper);

        /*
        Задача 3
        Теперь нужно уменьшить значение каждой переменной:
        dog уменьшить на 3.5;
        cat уменьшить на 1.6;
        paper уменьшить на 7639.
        Выведите в консоль новые значения переменных. Для решения этой задачи используйте тип переменной var.
         */

        /* аналогичная ситуация
        повторно объявлять переменные не нужно, поэтому используем те же переменные,
        в которых уже хранятся значения со второй задачи,
        а именно присваиваем им новые значения
        */

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("\nЗадача 3:");
        System.out.println("var dog = " + dog);
        System.out.println("var cat = " + cat);
        System.out.println("var paper = " + paper);

        /*
        Задача 4
        Инициализируйте (присвойте значение) переменную friend значением 19.
        Увеличьте значение переменной на 2, после чего поделите значение на 7.
        После каждой операции выводите значение переменной в консоль. В итоге у вас должно быть выведено 3 значения одной переменной.
        Для решения этой задачи используйте тип переменной var.
         */

        System.out.println("\nЗадача 4:");

        var friend = 19;
        System.out.println("1. var friend = " + friend);

        friend = friend + 2;
        System.out.println(("2. var friend = " + friend));

        friend = friend / 7;
        System.out.println(("3. var friend = " + friend));

        /*
        Задача 5
        Инициализируйте переменную frog значением 3.5.
        Увеличьте переменную в 10 раз и поделите на 3.5. Добавьте к последнему значению переменной 4.
        После каждой операции выводите значение переменной в консоль. В итоге у вас должно быть выведено 4 значения одной переменной.
        Для решения этой задачи используйте тип переменной var.
         */

        System.out.println("\nЗадача 5:");

        var frog = 3.5;
        System.out.println("1. var frog = " + frog);

        frog = frog * 10;
        System.out.println("2. var frog = " + frog);

        frog = frog / 3.5;
        System.out.println("3. var frog = " + frog);

        frog = frog + 4;
        System.out.println("4. var frog = " + frog);

        /*
        Задача 6
        В боксе перед каждым боем спортсменов взвешивают. Это делают для того, чтобы убедиться, что боксеры соответствуют своей весовой категории и бой будет честным.
        Масса одного боксера — 78.2 кг.
        Масса второго боксера — 82.7 кг.
        Подсчитайте и выведите в консоль общую массу двух бойцов.
        Подсчитайте и выведите в консоль разницу между массами бойцов. Для решения этой задачи используйте тип переменной var.
         */

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        var differenceBoxersWeight = firstBoxerWeight - secondBoxerWeight;

        System.out.println("\nЗадача 6:");

        System.out.println("Общая масса двух бойцов: " + totalBoxersWeight + " кг.");
        System.out.println("Первый боец легче второго бойца на " + (- differenceBoxersWeight) + " кг.");

        /*Задача 7
        Найдите остаток от деления между двумя весами. Для решения этой задачи используйте тип переменной var.
         */

        System.out.println("\nЗадача 7:");

        var weightRemains = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Остаток от деления между двумя весами: " + weightRemains);

        /*
        Задача 8
        Решите задачу с помощью арифметических функций.
        640 часов работы поделено между сотрудниками. Если каждый сотрудник посвящает работе 8 часов,
        то сколько всего работников в компании? Выведите результат задачи в консоль в формате: «Всего
        работников в компании — … человек».
        Посчитайте, сколько часов работы должно быть поделено между сотрудниками, если в компании работает
        на 94 человека больше. Выведите результат задачи в консоль в формате: «Если в компании работает …
        человек, то всего … часов работы может быть поделено между сотрудниками».
        Для решения этой задачи используйте тип переменной var.
         */

        System.out.println("\nЗадача 8:");

        var totalAmountOfHours = 640.0;
        var oneEmployeeWorkHours = 8.0;
        var totalAmountOfEmployees = totalAmountOfHours / oneEmployeeWorkHours;
        System.out.println("Всего работников в компании: " + totalAmountOfEmployees + " человек");

        totalAmountOfEmployees = totalAmountOfEmployees + 94;
        oneEmployeeWorkHours = totalAmountOfHours / totalAmountOfEmployees;
        System.out.println("Если в компании работает " + totalAmountOfEmployees + " человека, " +
                "то всего " + oneEmployeeWorkHours + " часа работы может быть поделено между сотрудниками");
    }
}